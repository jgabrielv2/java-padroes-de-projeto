package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TesteComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        System.out.println("Orcamento antigo -> " + NumberFormat.getCurrencyInstance(Locale.of("pt", "br")).format(antigo.getValor()));

        Orcamento novo = new Orcamento();

        novo.adicionarItem(new ItemOrcamento(new BigDecimal("159")));
        novo.adicionarItem(antigo);

        System.out.println("Orcamento novo -> " + NumberFormat.getCurrencyInstance(Locale.of("pt", "br")).format(novo.getValor()));
    }
}
