package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outroImposto;

    public Imposto (Imposto outroImposto){
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal calcular(Orcamento orcamento);

    public BigDecimal somaImposto(Orcamento orcamento){
        BigDecimal valorImposto = calcular(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outroImposto != null){
            valorOutroImposto = outroImposto.calcular(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }

}
