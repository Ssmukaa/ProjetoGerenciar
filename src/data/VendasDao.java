
package data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;

public class VendasDao {
    
   
    Connection conn;
    PreparedStatement ps;
    Statement stm;
    ResultSet rs;
    
    
    public boolean Conectar(){
        
        String url = "jdbc:mysql://localhost:3306/EmpresaDoce";
        String user = "root";
        String password = "88664897";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão " + ex.getMessage());
            return false;
        }
    }
    
    
    
    public List<Vendas> listaVenda(Filtro filtro){
        try {

            
            String sqlFiltro = "Select * from vendas where data between '"+filtro.getDataini()+"' and '"+ filtro.getDatafin()+"'";
            
            
            if(!filtro.getCliente().isEmpty()){                
                sqlFiltro = sqlFiltro + " and cliente like '%"+filtro.getCliente()+"%'";
            }if(!filtro.isSaldo() == false){
                sqlFiltro = sqlFiltro + " and valor < 0";
            }if(!filtro.getVendedor().equals(" ")){
                 sqlFiltro = sqlFiltro + " and vendedor = '"+ filtro.getVendedor()+"'";
            }if(!filtro.getFormapg().equals(" ")){
                 sqlFiltro = sqlFiltro + " and Formapg = '"+ filtro.getFormapg()+"'";
            }if(!filtro.getProduto().equals(" ")){
                sqlFiltro = sqlFiltro + " and Produto = '"+ filtro.getProduto()+"'";
            }
                
              sqlFiltro = sqlFiltro + " Order by data";
              
              stm = conn.createStatement();
              rs = stm.executeQuery(sqlFiltro);
           
            List<Vendas> lista = new ArrayList<>();
            
            while(rs.next()){
                Vendas venda = new Vendas();
                venda.setId(rs.getInt("id"));
                venda.setData(rs.getDate("Data"));
                venda.setCliente(rs.getString("Cliente"));
                venda.setProduto(rs.getString("Produto"));
                venda.setQuantidade(rs.getDouble("Qtd"));
                venda.setValor(rs.getDouble("Valor"));
                venda.setVendedor(rs.getString("Vendedor"));
                venda.setFormaPg(rs.getString("Formapg"));
                lista.add(venda);
            }
            return lista;
            
        }catch(SQLException ex) {
              System.out.println("Erro ao tentar buscar por categoria " + ex.getMessage());
              return null;
        }
        
        
    } 
    
    
    public int Salvar(Vendas v){
       int Salvar;
        
        try {
            
            ps = conn.prepareStatement("insert into vendas (Data,Cliente,Produto,Qtd,valor,Vendedor,Formapg) values (?,?,?,?,?,?,?)");
            ps.setString(1,String.valueOf(v.getData()));
            ps.setString(2,v.getCliente());
            ps.setString(3,v.getProduto());
            ps.setDouble(4,v.getQuantidade());
            ps.setDouble(5,v.getValor());
            ps.setString(6,v.getVendedor());
            ps.setString(7,v.getFormaPg());
            Salvar = ps.executeUpdate();
            return Salvar;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar Salvar "+ ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    
    public int atualizar(Vendas v){
        int status;
        try{
            ps = conn.prepareStatement("update vendas set Data = ?, Cliente = ?, produto = ?, Qtd = ?, valor = ?, Vendedor = ?, Formapg = ? where id = ?");
            ps.setString(1,String.valueOf(v.getData()));
            ps.setString(2,v.getCliente());
            ps.setString(3,v.getProduto());
            ps.setDouble(4,v.getQuantidade());
            ps.setDouble(5,v.getValor());
            ps.setString(6,v.getVendedor());
            ps.setString(7,v.getFormaPg());
            ps.setInt(8,v.getId());
            
            status = ps.executeUpdate();
            
            return status;
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(null,"Erro ao atualizar");
            return ex.getErrorCode();
        }
        
        
    }
    
    
    public boolean Excluir(int id){
        try {
            
            ps = conn.prepareStatement("Delete from vendas where id = ?");
            ps.setInt(1,id);
            ps.executeUpdate();
            return true;
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir");
            return false;
            
        }
        
        
    }
    
    
    
    
    
    
    
    public Vendas Consultar(int id){
        try {
            
            ps = conn.prepareStatement("Select * from vendas where id = ?");
            ps.setInt(1,id);
            rs = ps.executeQuery();
            
             Vendas v = new Vendas();
            while(rs.next()){     
                v.setId(rs.getInt("id"));
                v.setData(rs.getDate("Data"));
                v.setCliente(rs.getString("Cliente"));
                v.setProduto(rs.getString("produto"));
                v.setQuantidade(rs.getDouble("Qtd"));
                v.setValor(rs.getDouble("Valor"));
                v.setVendedor(rs.getString("Vendedor"));
                v.setFormaPg(rs.getString("FormaPg"));              
            }
            return v;
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro "+ ex.getMessage());
            return null;
        }
        
    }
    
    
    
    
    
    
    
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            
        }
  
    }
    
   
}


