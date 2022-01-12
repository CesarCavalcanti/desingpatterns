package state.orcamento.situacao;

import state.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    //Padrão state
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Reprovado());
    }
}
