/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 11/12/2018
Objetivo sucinto do programa: Cria a classe conta que é encapsulada pelo getNome e setNome.
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) páginas: 56 a 63.
*/

public class Conta {

    private String nome;

    //define o nome do obj
    public void setNome(String nome) {
        this.nome = nome; //armazena o name
    }

    //recupera o nome do obj
    public String getNome () {
        return nome; //retorna o valo do nome ao chamador
    }
}
