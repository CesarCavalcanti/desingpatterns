package strategy.imposto;

import strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoImposto {

    //Implementação do strategy

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
