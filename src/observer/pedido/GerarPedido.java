package observer.pedido;

import java.util.List;

public class GerarPedido {

    private List<AcaoAposGerarPedido> acoes;
    Pedido pedido;


    public GerarPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executa(Pedido pedido){
       acoes.forEach(a -> a.executarAcao(pedido));
    }
}
