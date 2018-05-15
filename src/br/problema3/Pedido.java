package br.problema3;

import br.strategy.FormaDeEntrega;
import br.strategy.RetiradaNoLocal;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private FormaDeEntrega formaDeEntrega;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.formaDeEntrega = RetiradaNoLocal.getInstance();
    }
    
    public double getValorEntrega() {
        return this.formaDeEntrega.getPrecoFrete(this);
    }
    
    public int getPesoTotalPedido() {
        int peso = 0;
        for(ItemPedido item: this.itens) {
            peso += item.getProduto().getPeso() * this.getQuantidadeItens();
        }
        return peso;
    }
    
    public int getQuantidadeItens() {
        int qtd = 0;
        for(ItemPedido item: this.getItens()) {
            qtd += item.getQuantidade();
        }
        return qtd;
    }
    
    public double getValorTotal() {
        double aux = this.getValorEntrega();
        for(ItemPedido item: itens) {
            aux += item.getValorItem();
        }
        return aux;
    }
    
    public ArrayList<ItemPedido> getItens() {
        return this.itens;
    }
    
    public void setFormaDePagamento(FormaDeEntrega forma) {
        this.formaDeEntrega = forma;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }

}
