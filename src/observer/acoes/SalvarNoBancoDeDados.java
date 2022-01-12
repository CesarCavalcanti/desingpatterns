package observer.acoes;

import observer.pedido.AcaoAposGerarPedido;
import observer.pedido.Pedido;

public class SalvarNoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        //Salvar no banco
    }
}
