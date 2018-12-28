/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 28/12/2018
Objetivo sucinto do programa: Demonstra a excecao ArrayIndexOutOfBoundsException.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/

public class Demonstra_ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        try {
            int erro[] = new int[5];
            erro[8] = 7; //Nao existe o index que tenta modificar
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Esse index nao existe");
        }
    }
}
