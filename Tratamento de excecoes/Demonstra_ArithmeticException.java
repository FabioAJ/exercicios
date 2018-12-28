/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 28/12/2018
Objetivo sucinto do programa: Demonstra a excecao ArithmeticException.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/

public class Demonstra_ArithmeticException {

    public static void main(String[] args) {
        try {
            int inteiro = 231231;
            int zero = 0;
            int erro = inteiro / zero;
            System.out.println("Resultado: " + erro);
        } catch(ArithmeticException e) {
            System.out.println("Nao pode-se dividir por 0");
        }
    }
}
