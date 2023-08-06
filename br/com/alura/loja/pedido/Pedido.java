package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento){
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }
    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
