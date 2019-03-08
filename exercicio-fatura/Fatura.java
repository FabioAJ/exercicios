/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 14/12/2018
Objetivo sucinto do programa: Cria uma fatura de produtos com id descricao quantidade e preco por unidade.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class Fatura {

    private int id;
    private String descricao;
    private int quantidade;
    private double precoUnidade;

    public Fatura() {

    }

    public Fatura(int id, String descricao, int quantidade, double precoUnidade) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public double getPrecoTotal() {
        return precoUnidade * quantidade;
    }

    public String toString() {
        return "id do produto = " + id + " descricao = " + descricao + " quantidade = " + quantidade + " preco da unidade = " + precoUnidade + "\n";
    }
}
