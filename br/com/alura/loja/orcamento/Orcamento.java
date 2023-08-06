package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;
    public Orcamento(){
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
       var descontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(descontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    public void adicionarItem(Orcavel orcavel){
        this.valor = this.valor.add(orcavel.getValor());
        this.itens.add(orcavel);
    }

    public int getQuantidadeDeItens(){
        return itens.size();
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }
}
