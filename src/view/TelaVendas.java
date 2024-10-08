/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import data.Vendas;
import data.VendasDao;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendas
     */
    public TelaVendas() {
        initComponents();
        preencherData();
        BtAlterar.setVisible(false);
        BtExcluir.setVisible(false);
        FfData.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbData = new javax.swing.JLabel();
        LbProduto = new javax.swing.JLabel();
        LbQtd = new javax.swing.JLabel();
        LbValor = new javax.swing.JLabel();
        LbVendedor = new javax.swing.JLabel();
        LbFormapg = new javax.swing.JLabel();
        CbProdutos = new javax.swing.JComboBox<>();
        CbVendedor = new javax.swing.JComboBox<>();
        CbFormapg = new javax.swing.JComboBox<>();
        BtVoltar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtAlterar = new javax.swing.JButton();
        TxValorPg = new javax.swing.JTextField();
        TxValor = new javax.swing.JTextField();
        TxQtd = new javax.swing.JTextField();
        LbValorPago = new javax.swing.JLabel();
        FfData = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        TxCliente = new javax.swing.JTextField();
        LbCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LbTxIni = new javax.swing.JLabel();
        LbLogo = new javax.swing.JLabel();
        BtAdicionar = new javax.swing.JButton();
        imagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 550));
        getContentPane().setLayout(null);

        LbData.setBackground(new java.awt.Color(153, 153, 153));
        LbData.setForeground(new java.awt.Color(255, 255, 255));
        LbData.setText("Data:");
        getContentPane().add(LbData);
        LbData.setBounds(40, 180, 40, 16);

        LbProduto.setForeground(new java.awt.Color(255, 255, 255));
        LbProduto.setText("Produto:");
        getContentPane().add(LbProduto);
        LbProduto.setBounds(40, 300, 60, 16);

        LbQtd.setForeground(new java.awt.Color(255, 255, 255));
        LbQtd.setText("Quantidade:");
        getContentPane().add(LbQtd);
        LbQtd.setBounds(330, 300, 70, 16);

        LbValor.setForeground(new java.awt.Color(255, 255, 255));
        LbValor.setText("Valor:");
        getContentPane().add(LbValor);
        LbValor.setBounds(460, 300, 40, 16);

        LbVendedor.setForeground(new java.awt.Color(255, 255, 255));
        LbVendedor.setText("Vendedor:");
        getContentPane().add(LbVendedor);
        LbVendedor.setBounds(340, 180, 70, 16);

        LbFormapg.setForeground(new java.awt.Color(255, 255, 255));
        LbFormapg.setText("Forma de Pagamento:");
        getContentPane().add(LbFormapg);
        LbFormapg.setBounds(330, 230, 130, 16);

        CbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Caixinha", "Bombom" }));
        getContentPane().add(CbProdutos);
        CbProdutos.setBounds(110, 300, 99, 22);

        CbVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Samuel", "Luana" }));
        CbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(CbVendedor);
        CbVendedor.setBounds(490, 180, 100, 22);

        CbFormapg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pix", "Dinheiro", "Cartão" }));
        getContentPane().add(CbFormapg);
        CbFormapg.setBounds(490, 230, 100, 22);

        BtVoltar.setBackground(new java.awt.Color(153, 153, 153));
        BtVoltar.setForeground(new java.awt.Color(255, 255, 255));
        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BtVoltar);
        BtVoltar.setBounds(37, 455, 72, 30);

        BtExcluir.setBackground(new java.awt.Color(204, 0, 0));
        BtExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BtExcluir.setText("Excluir");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BtExcluir);
        BtExcluir.setBounds(480, 455, 72, 30);

        BtAlterar.setBackground(new java.awt.Color(204, 204, 0));
        BtAlterar.setForeground(new java.awt.Color(51, 51, 51));
        BtAlterar.setText("Alterar");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(BtAlterar);
        BtAlterar.setBounds(587, 455, 72, 30);
        getContentPane().add(TxValorPg);
        TxValorPg.setBounds(670, 292, 56, 30);

        TxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxValorActionPerformed(evt);
            }
        });
        getContentPane().add(TxValor);
        TxValor.setBounds(510, 292, 56, 30);

        TxQtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxQtdFocusLost(evt);
            }
        });
        getContentPane().add(TxQtd);
        TxQtd.setBounds(400, 292, 30, 30);

        LbValorPago.setForeground(new java.awt.Color(255, 255, 255));
        LbValorPago.setText("Valor Pago:");
        getContentPane().add(LbValorPago);
        LbValorPago.setBounds(590, 300, 70, 16);

        try {
            FfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FfDataActionPerformed(evt);
            }
        });
        getContentPane().add(FfData);
        FfData.setBounds(110, 180, 79, 22);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153,100));

        TxCliente.setPreferredSize(new java.awt.Dimension(64, 25));
        TxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxClienteActionPerformed(evt);
            }
        });

        LbCliente.setForeground(new java.awt.Color(255, 255, 255));
        LbCliente.setText("Cliente:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCliente)
                    .addComponent(TxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 160, 730, 180);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        LbTxIni.setBackground(new java.awt.Color(0, 0, 0));
        LbTxIni.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LbTxIni.setForeground(new java.awt.Color(0, 0, 0));
        LbTxIni.setText("Tela vendas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTxIni)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbTxIni, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, 30, 140, 50);

        LbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemFundo/Logo.png"))); // NOI18N
        LbLogo.setText("jLabel1");
        getContentPane().add(LbLogo);
        LbLogo.setBounds(30, 10, 130, 130);

        BtAdicionar.setBackground(new java.awt.Color(0, 153, 0));
        BtAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        BtAdicionar.setText("Adicionar");
        BtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(BtAdicionar);
        BtAdicionar.setBounds(534, 455, 81, 30);

        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagemFundo/imagem f.png"))); // NOI18N
        getContentPane().add(imagemFundo);
        imagemFundo.setBounds(0, 0, 770, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        TelaInicio ti = new TelaInicio();
        ti.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
      
        VendasDao dao = new VendasDao();     
          int opcao =JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir ?");
         if(opcao >0){
             JOptionPane.showMessageDialog(null,"Operação cancelada");
         }else{
              boolean status = dao.Conectar();
            if(status == false){
                JOptionPane.showMessageDialog(null,"Erro ao tentar conectar com o BD");
            }else{
             boolean ex = dao.Excluir(idV);
             if(ex == true){
                 JOptionPane.showMessageDialog(null,"Venda excluida com sucesso !!");
                 TelaInicio ti = new TelaInicio();
                 ti.setVisible(true);
                 dispose();
             }else{
                 JOptionPane.showMessageDialog(null,"Não foi possível excluir");
             }
         }
        }
         dao.desconectar();
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void TxQtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxQtdFocusLost
        
        calculo();
    }//GEN-LAST:event_TxQtdFocusLost
        
    
    
    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        
        
        if(validacao() == false){
            
        }else{
        Vendas v = new Vendas();
        VendasDao dao = new VendasDao();
        
        boolean status = dao.Conectar();
        if(status == false){
            JOptionPane.showMessageDialog(null,"Erro ao tentar se conectar com o banco de dados");
        }else{
            String data = FfData.getText();
            String cliente = TxCliente.getText();
            String produto = CbProdutos.getSelectedItem().toString();
            String Vendedor = CbVendedor.getSelectedItem().toString();
            String Formapg = CbFormapg.getSelectedItem().toString();
            Double qtd = Double.parseDouble(TxQtd.getText());
            Double valorPg = Double.parseDouble(TxValorPg.getText());
            Double valor = Double.parseDouble(TxValor.getText().replace(",","."));
            
            v.setId(idV);
            v.setCliente(cliente);
            v.setProduto(produto);
            v.setVendedor(Vendedor);
            v.setFormaPg(Formapg);          
            v.setQuantidade(qtd);
            v.setValor(valorPg);
            
             SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
            try { 
                Date dataConvertida = conversor.parse(data);
                java.sql.Date sqlDate = new java.sql.Date(dataConvertida.getTime());
                v.setData(sqlDate);           
                
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null,"Erro na conversao da data " + ex.getMessage());
            } 
            
            
            
            if(valorPg < valor){
               int opcao = JOptionPane.showConfirmDialog(null,"A venda está com o valor negativo\n Deseja alterar ?");
               valorPg = valorPg - valor;
               v.setValor(valorPg);
            if(opcao > 0){
                JOptionPane.showMessageDialog(null,"Operação cancelada");
            }
            else{
                
           
            
            
           int atualizar = dao.atualizar(v);
           if(atualizar == 1){
               JOptionPane.showMessageDialog(null,"Venda alterada com sucesso !!!");
               TelaInicio tl = new TelaInicio();
               tl.setVisible(true);
               dispose();
           }else{
               JOptionPane.showMessageDialog(null,"Erro ao alterar");
           }
            
             }
            }else if(valorPg >= valor){
                int atualizar = dao.atualizar(v);
           if(atualizar == 1){
               JOptionPane.showMessageDialog(null,"Venda alterada com sucesso !!!");
               TelaInicio tl = new TelaInicio();
               tl.setVisible(true);
               dispose();
           }else{
               JOptionPane.showMessageDialog(null,"Erro ao alterar");
           }
            }
                   
            
        }
        dao.desconectar();
        }
        
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void TxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxValorActionPerformed

    private void FfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FfDataActionPerformed

    private void TxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxClienteActionPerformed

    private void CbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbVendedorActionPerformed

    private void BtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarActionPerformed
        
        
        if(validacao() == false){
            
        }else{

        Vendas v = new Vendas();
        VendasDao dao = new VendasDao();
        
        boolean conec = dao.Conectar();
        if(conec == false){
            JOptionPane.showMessageDialog(null,"Erro ao conectar com o BD");
        }else{
        String data = FfData.getText();
        String Cliente = TxCliente.getText();
        String Vendedor = CbVendedor.getSelectedItem().toString();
        String Produto = CbProdutos.getSelectedItem().toString();
        String FormaPg = CbFormapg.getSelectedItem().toString();
        Double qtd = Double.parseDouble(TxQtd.getText());
        Double valorPg = Double.parseDouble(TxValorPg.getText());
        Double valor = Double.parseDouble(TxValor.getText().replace(",","."));
        
         
            v.setCliente(Cliente);
            v.setProduto(Produto);
            v.setVendedor(Vendedor);
            v.setFormaPg(FormaPg);          
            v.setQuantidade(qtd);
            v.setValor(valorPg);
            
             SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
            try { 
                Date dataConvertida = conversor.parse(data);
                java.sql.Date sqlDate = new java.sql.Date(dataConvertida.getTime());
                v.setData(sqlDate);           
                
            } catch (ParseException ex) {
               JOptionPane.showMessageDialog(null,"Erro na conversao da data " + ex.getMessage());
            }
            
             if(valorPg < valor){
               int opcao = JOptionPane.showConfirmDialog(null,"A venda está com o valor negativo\n Deseja alterar ?");
               valorPg = valorPg - valor;
               v.setValor(valorPg);
            if(opcao > 0){
                JOptionPane.showMessageDialog(null,"Operação cancelada");
            }
            else{
                
                int salvar = dao.Salvar(v);
                if(salvar == 1){
                    JOptionPane.showMessageDialog(null,"Venda adicionada com sucesso");
                    limpar();
                }else if(salvar == 1062){
                 JOptionPane.showMessageDialog(null,"Venda já foi adicionada");
                
                 
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao Adicionar Venda");
            }
             }        
             
               }else if(valorPg >= valor){
                 int salvar = dao.Salvar(v);
                if(salvar == 1){
                    JOptionPane.showMessageDialog(null,"Venda adicionada com sucesso");
                    limpar();
                }else if(salvar == 1062){
                 JOptionPane.showMessageDialog(null,"Venda já foi adicionada");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao Adicionar Venda");
            }
                 
             }   
            
             
        }
           dao.desconectar();
        }
        
    }//GEN-LAST:event_BtAdicionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdicionar;
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JComboBox<String> CbFormapg;
    private javax.swing.JComboBox<String> CbProdutos;
    private javax.swing.JComboBox<String> CbVendedor;
    private javax.swing.JFormattedTextField FfData;
    private javax.swing.JLabel LbCliente;
    private javax.swing.JLabel LbData;
    private javax.swing.JLabel LbFormapg;
    private javax.swing.JLabel LbLogo;
    private javax.swing.JLabel LbProduto;
    private javax.swing.JLabel LbQtd;
    private javax.swing.JLabel LbTxIni;
    private javax.swing.JLabel LbValor;
    private javax.swing.JLabel LbValorPago;
    private javax.swing.JLabel LbVendedor;
    private javax.swing.JTextField TxCliente;
    private javax.swing.JTextField TxQtd;
    private javax.swing.JTextField TxValor;
    private javax.swing.JTextField TxValorPg;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


 public void preencherData(){
         DateTimeFormatter dt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime time = LocalDateTime.now();
            FfData.setText(time.format(dt));
            
            TxValor.setEditable(false);
        
     }
 
 public void calculo(){
        Double qtd = Double.parseDouble(TxQtd.getText());
        Double valor = qtd * 10;
        DecimalFormat mascara = new DecimalFormat("###,###.00");
        mascara.format(valor);
        
        TxValor.setText(String.valueOf(valor+"0").replace(".",","));
 }
 
   int idV;
 public void preencherDados(int id,String data,String cliente,String produto,String qtd,String valor,String Vendedor,String Formapg){
         Vendas v = new Vendas();
         idV = id;
         FfData.setText(data);
         TxCliente.setText(cliente);
         CbProdutos.setSelectedItem(produto);
         CbVendedor.setSelectedItem(Vendedor);
         CbFormapg.setSelectedItem(Formapg);
         TxQtd.setText(qtd);
         TxValorPg.setText(valor);
         calculo();
         
         BtAlterar.setVisible(true);        
         BtExcluir.setVisible(true);
         BtAdicionar.setVisible(false);    
     
 }
 
    public void limpar(){
                 TxCliente.setText("");
                 CbFormapg.setSelectedItem(" ");
                 CbProdutos.setSelectedItem(" ");
                 CbVendedor.setSelectedItem(" ");
                 TxQtd.setText("");
                 TxValor.setText("");
                 TxValorPg.setText("");
    }
    
    public boolean validacao(){
        String data = FfData.getText();
        String Cliente = TxCliente.getText();
        String Vendedor = CbVendedor.getSelectedItem().toString();
        String Formapg = CbFormapg.getSelectedItem().toString();
        String Produto = CbProdutos.getSelectedItem().toString();
        String qtd = TxQtd.getText();
        String valor = TxValorPg.getText();
        
        boolean validaData = data.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
        
        boolean v = false;
        
        if(validaData == false && Cliente.isEmpty() && Vendedor.contains(" ") && Formapg.contains(" ") && Produto.contains(" ") && qtd.isEmpty() && valor.isEmpty()){
            JOptionPane.showMessageDialog(null,"Dados inválidos");
            return v;
        }else if(validaData == false){
            JOptionPane.showMessageDialog(null,"Campo 'DATA' está incorreto");
            return v;
        }else if(Cliente.isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo 'CLIENTE' está incorreto"); 
            return v;
        }else if(Vendedor.contains(" ")){
            JOptionPane.showMessageDialog(null,"Campo 'VENDEDOR' está incorreto");
            return v;
        }else if(Produto.contains(" ")){
            JOptionPane.showMessageDialog(null,"Campo 'PRODUTO' está incorreto");
            return v;
        }else if(qtd.isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo 'QUANTIDADE' está incorreto");
            return v;
        }else if(valor.isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo 'VALOR' está incorreto");
            return v;
        }
        else if(validaData == true && !Cliente.isEmpty() && !Vendedor.contains(" ")  && !Produto.contains(" ") && !qtd.isEmpty() && !valor.isEmpty()){
            v = true;
            return v;
        }
          return  v;
         
    }

}
