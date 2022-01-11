package strategy.imposto;

import strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}