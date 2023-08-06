package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private final HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.http = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {

        if (!orcamento.isFinalizado()) {
            throw new IllegalStateException("O orçamento deve estar finalizado antes de ser entregue.");
        }
        String url = "https://google.com/";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeDeItens", orcamento.getQuantidadeDeItens());
        http.post(url, dados);
    }
}