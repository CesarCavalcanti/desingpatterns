package template.descontos;



import template.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    //Implementação do padrão template
    @Override
    public BigDecimal calcular(Orcamento orcamento){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    //Implementação do padrão template
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
