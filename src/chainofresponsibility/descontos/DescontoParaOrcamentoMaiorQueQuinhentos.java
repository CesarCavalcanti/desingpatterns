package chainofresponsibility.descontos;

import chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaiorQueQuinhentos extends Desconto {
    //Implementação do responsibility

    public DescontoParaOrcamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
      if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
          return orcamento.getValor().multiply(new BigDecimal(("0.05")));
      }

      return proximo.calcular(orcamento);
    }
}
