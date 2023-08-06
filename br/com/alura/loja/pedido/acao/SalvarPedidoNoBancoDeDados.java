package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido p){
        System.out.println("Salvando pedido no banco de dados.");
    }
}
