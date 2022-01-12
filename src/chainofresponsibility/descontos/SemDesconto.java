package chainofresponsibility.descontos;

import chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    //Implementação do responsibility

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
