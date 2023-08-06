package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento o){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento o){
        throw new IllegalStateException("Orçamento não pode ser aprovado.");
    }

    public void reprovar(Orcamento o){
        throw new IllegalStateException("Orçamento não pode ser reprovado.");
    }

    public void finalizar(Orcamento o){
        throw new IllegalStateException("Orçamento não pode ser finalizado;");
    }
}
