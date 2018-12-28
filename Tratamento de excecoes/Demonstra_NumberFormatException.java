/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 28/12/2018
Objetivo sucinto do programa: Demonstra a excecao NumberFormatException.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/

public class Demonstra_NumberFormatException {

    public static void main(String[] args) {
        try{
            int erro = Integer.parseInt ("fabin");
            System.out.println(erro);
        } catch(NumberFormatException e) {
            System.out.println("nao e um numero inteiro");
        }
    }
}
