/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 28/12/2018
Objetivo sucinto do programa: Demonstra a excecao StringIndexOutOfBoundsException.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/

public class Demonstra_StringIndexOutOfBoundsException {

    public static void main(String[] args) {
        try {
            String erro = "pao de batata";
            System.out.println(erro.charAt(20));
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("tentou acessar um index nao existente na string");
        }
    }
}
