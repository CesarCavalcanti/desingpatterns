package state.descontos;



import state.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal regra (Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return calcular(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    //Padrão state
    protected abstract BigDecimal calcular(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);
}
