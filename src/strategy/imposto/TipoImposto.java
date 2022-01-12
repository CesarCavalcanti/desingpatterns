package strategy.imposto;

import strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    //Implementação do strategy

    BigDecimal calcular(Orcamento orcamento);
}
