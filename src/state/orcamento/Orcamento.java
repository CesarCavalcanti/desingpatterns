package state.orcamento;

import state.orcamento.situacao.EmAnalise;
import state.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacaoOrcamento = new EmAnalise();
    }

    public void aplciarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacaoOrcamento.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.situacaoOrcamento.aprovar(this);
    }
    public void reprovar(){
        this.situacaoOrcamento.reprovar(this);
    }
    public void finalizar(){
        this.situacaoOrcamento.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }
}