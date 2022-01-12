package observer.descontos;

import comand.descontos.Desconto;
import comand.descontos.DescontoParaOrcamentoComMaisDeCincoItens;
import comand.descontos.DescontoParaOrcamentoMaiorQueQuinhentos;
import comand.descontos.SemDesconto;
import comand.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontos {

    public BigDecimal calcular (Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
