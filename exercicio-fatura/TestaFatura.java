/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 14/12/2018
Objetivo sucinto do programa: Testa uma fatura de produtos com id descricao quantidade e preco por unidade.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class TestaFatura {

    public static void main(String[] args) {
        Fatura produto1 = new Fatura(123, "pao de batata", 22, 20);
        System.out.println(produto1.toString());

        Fatura produto2 = new Fatura(456, "pao frances", 12, 28);
        System.out.println(produto2.toString());

        Fatura produto3 = new Fatura(789, "baguete", 44, 42);
        System.out.println(produto3.toString());

        System.out.println("o id do baguete é: " + produto3.getId());
        System.out.println("descricao do produto 2: " + produto2.getDescricao());
        System.out.println("ha em estoque " + produto2.getQuantidade() + " paes fanceses");
        produto2.setQuantidade(23);
        System.out.println("agora ha em estoque " + produto2.getQuantidade() + " paes franceses");
        System.out.println("cada unidade do pao de batata esta saindo por R$" + produto1.getPrecoUnidade());
        produto1.setPrecoUnidade(15);
        System.out.println("a unidade do pao de batata entrou em promocao agora esta R$" + produto1.getPrecoUnidade());
        System.out.println("agora o lote do pao de batata esta R$" + produto1.getPrecoTotal());
    }
}
