package observer.orcamento.situacao;

import comand.orcamento.Orcamento;
import comand.orcamento.situacao.Finalizado;
import comand.orcamento.situacao.SituacaoOrcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
