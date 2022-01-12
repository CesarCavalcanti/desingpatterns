package template.descontos;

import template.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    //Implementação do padrão template
    public BigDecimal calcular(Orcamento orcamento){
         return orcamento.getValor().multiply(new BigDecimal(("0.05")));
    }

    //Implementação do padrão template
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
