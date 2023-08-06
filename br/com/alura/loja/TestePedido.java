package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedido {

    public static void main(String[] args) {
        var gerador = new GeraPedido("João", 5, new BigDecimal("250"));
        var geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBancoDeDados()));
        geraPedidoHandler.executa(gerador);
    }
}
