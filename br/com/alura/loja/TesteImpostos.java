package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TesteImpostos {
    public static void main(String[] args) {
//        var orcamento = new Orcamento(new BigDecimal("100"), 2);
        var orcamento = new Orcamento();
        var calc = new CalculadoraDeImposto();

        String valorIcms = NumberFormat.getCurrencyInstance(Locale.of("PT", "BR")).format(calc.calcular(orcamento, new ICMS(null)));
        String valorIss = NumberFormat.getCurrencyInstance(Locale.of("PT", "BR")).format(calc.calcular(orcamento, new ISS(null)));
        String valorIcmsIss = NumberFormat.getCurrencyInstance(Locale.of("PT", "BR")).format(calc.calcular(orcamento, new ICMS(new ISS(null))));

        System.out.println("ICMS -> " + valorIcms);
        System.out.println("ISS -> " + valorIss);
        System.out.println("ICMS + ISS -> " + valorIcmsIss );
    }
}
