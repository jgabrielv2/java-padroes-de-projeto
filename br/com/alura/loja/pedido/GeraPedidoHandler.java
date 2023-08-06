package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        var orcamento = new Orcamento();
        var pedido = new Pedido(dados.getCliente(), dados.getDataPedido(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));
    }

}
