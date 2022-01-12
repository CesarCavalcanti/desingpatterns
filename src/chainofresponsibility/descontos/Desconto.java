package chainofresponsibility.descontos;



import chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    //Implementação do responsibility

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
