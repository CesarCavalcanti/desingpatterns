package strategy.imposto;

import strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    //Implementação do strategy

    public BigDecimal calcular(Orcamento orcamento, TipoImposto imposto){
        return imposto.calcular(orcamento);
    }
}
