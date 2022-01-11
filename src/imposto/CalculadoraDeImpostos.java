package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto imposto){
        return imposto.calcular(orcamento);
    }
}
