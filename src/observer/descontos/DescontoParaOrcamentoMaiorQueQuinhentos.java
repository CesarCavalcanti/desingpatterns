package observer.descontos;

import comand.descontos.Desconto;
import comand.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorQueQuinhentos extends comand.descontos.Desconto {

    public DescontoParaOrcamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
         return orcamento.getValor().multiply(new BigDecimal(("0.05")));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
