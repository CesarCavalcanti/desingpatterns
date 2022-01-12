package observer.pedido;

import observer.orcamento.Orcamento;

import java.util.Date;

public class Pedido {

    private String cliente;
    private Orcamento orcamento;
    private Date data;

    public Pedido(String cliente, Orcamento orcamento, Date data) {
        this.cliente = cliente;
        this.orcamento = orcamento;
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
