package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicarDesconto(orcamento)) {
            return efetuarCalculo(orcamento);

        } else {
            return proximo.calcular(orcamento);
        }
    }

    public abstract boolean deveAplicarDesconto(Orcamento orcamento);
}
