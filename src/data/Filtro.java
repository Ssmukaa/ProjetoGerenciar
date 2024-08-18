package data;

import java.util.Date;


public class Filtro {
    
    Date dataini;
    Date datafin;
    String cliente;
    String produto;
    String formapg;
    String vendedor;
    Double valor;  
    boolean saldo;

    public Date getDataini() {
        return dataini;
    }

    public void setDataini(Date dataini) {
        this.dataini = dataini;
    }

    public Date getDatafin() {
        return datafin;
    }

    public void setDatafin(Date datafin) {
        this.datafin = datafin;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFormapg() {
        return formapg;
    }

    public void setFormapg(String formapg) {
        this.formapg = formapg;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDataini(String dataIni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isSaldo() {
        return saldo;
    }

    public void setSaldo(boolean saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
