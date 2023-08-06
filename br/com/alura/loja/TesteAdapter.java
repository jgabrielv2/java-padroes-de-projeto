package br.com.alura.loja;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento o = new Orcamento();
        o.adicionarItem(new ItemOrcamento(new BigDecimal("19,90")));
        o.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        o.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        o.adicionarItem(new ItemOrcamento(new BigDecimal("130")));
        o.adicionarItem(new ItemOrcamento(new BigDecimal("70")));
        o.aprovar();
        o.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(o);
    }
}
