package observer.orcamento.situacao;

import comand.orcamento.Orcamento;
import comand.orcamento.situacao.Finalizado;
import comand.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Finalizado());
    }

}
