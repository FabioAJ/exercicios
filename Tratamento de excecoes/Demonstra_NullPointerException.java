/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 28/12/2018
Objetivo sucinto do programa: Demonstra a excecao NullPointerException.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/

public class Demonstra_NullPointerException {

    public static void main(String[] args) {
        try {
            String erro = null;
            System.out.println(erro.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("String nula");
        }
    }
}
