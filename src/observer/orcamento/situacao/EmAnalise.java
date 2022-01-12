package observer.orcamento.situacao;

import comand.orcamento.Orcamento;
import comand.orcamento.situacao.Aprovado;
import comand.orcamento.situacao.Reprovado;
import comand.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

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
