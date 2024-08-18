
package data;

import java.util.Date;

public class Vendas {
    
    int id;
    Date Data;
    String Cliente;
    String Produto;
    Double Quantidade;
    Double Valor;
    String Vendedor;
    String FormaPg;

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getFormaPg() {
        return FormaPg;
    }

    public void setFormaPg(String FormaPg) {
        this.FormaPg = FormaPg;
    }

    public Double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Double Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
