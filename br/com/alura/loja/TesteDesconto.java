package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TesteDesconto {

    public static void main(String[] args) {

//        var orcamentoOne = new Orcamento(new BigDecimal("200"), 6);
//        var orcamentoTwo = new Orcamento(new BigDecimal("1000"),3);


        var bone = new ItemOrcamento(new BigDecimal("50"));
        var carteira = new ItemOrcamento(new BigDecimal("50"));
        var caderno = new ItemOrcamento(new BigDecimal("20"));
        var meia = new ItemOrcamento(new BigDecimal("30"));
        var calca = new ItemOrcamento(new BigDecimal("30"));
        var camisa = new ItemOrcamento(new BigDecimal("20"));

        var tenis = new ItemOrcamento(new BigDecimal("350"));
        var patins = new ItemOrcamento(new BigDecimal("500"));
        var mochila = new ItemOrcamento(new BigDecimal("150"));

        var orcamentoOne = new Orcamento();
        var orcamentoTwo = new Orcamento();

        orcamentoOne.adicionarItem(bone);
        orcamentoOne.adicionarItem(carteira);
        orcamentoOne.adicionarItem(caderno);
        orcamentoOne.adicionarItem(meia);
        orcamentoOne.adicionarItem(calca);
        orcamentoOne.adicionarItem(camisa);

        orcamentoTwo.adicionarItem(tenis);
        orcamentoTwo.adicionarItem(patins);
        orcamentoTwo.adicionarItem(mochila);

        var calc = new CalculadoraDeDesconto();

        var descontoOne = calc.calcular(orcamentoOne);
        var descontoTwo = calc.calcular(orcamentoTwo);

        System.out.println("descontoOne -> " + NumberFormat.getCurrencyInstance(Locale.of("pt", "br")).format(descontoOne));
        System.out.println("descontoTwo -> " + NumberFormat.getCurrencyInstance(Locale.of("pt", "br")).format(descontoTwo));
    }
}
