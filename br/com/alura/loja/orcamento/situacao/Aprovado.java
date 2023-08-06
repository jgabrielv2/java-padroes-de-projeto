package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{
    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento o) {
        return o.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento o) {
        o.setSituacao(new Finalizado());
    }
}
