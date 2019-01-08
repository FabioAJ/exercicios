/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 28/12/2018
Objetivo sucinto do programa: Demonstra a excecao IllegalArgumentException.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/

public class Demonstra_IllegalArgumentException {

    public static void main(String[] args) {
        erro(51);
    }
    public static void erro(int fabin) {
        if (fabin > 50) {
            throw new IllegalArgumentException("O argumento nao pode ser maior");
        }
    }
}
