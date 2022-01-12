package comand.pedido;

public class GerarPedido {

    private Pedido pedido;

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
        //Comandos para executar o pedido....
    }
}
