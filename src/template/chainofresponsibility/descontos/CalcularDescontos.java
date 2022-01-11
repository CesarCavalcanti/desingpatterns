package template.chainofresponsibility.descontos;

import template.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontos {

    public BigDecimal calcular (Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
