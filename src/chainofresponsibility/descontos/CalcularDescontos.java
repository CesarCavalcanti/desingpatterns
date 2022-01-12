package chainofresponsibility.descontos;

import chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontos {

    //Implementação do responsibility
    public BigDecimal calcular (Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
