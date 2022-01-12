package observer.acoes;

import observer.pedido.AcaoAposGerarPedido;
import observer.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        //Enivar Email...
    }
}
