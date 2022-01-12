package state.orcamento.situacao;

import state.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {
    //Padrão state
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
