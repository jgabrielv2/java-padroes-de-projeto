package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento o) {
        return o.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento o) {
        o.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento o) {
        o.setSituacao(new Reprovado());
    }
}
