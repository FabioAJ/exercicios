/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 11/12/2018
Objetivo sucinto do programa: Cria a classe conta que é encapsulada pelo getNome e setNome.
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) páginas: 56 a 63.
*/

import java.util.Scanner;

public class ContaTeste {

    public static void main(String[] args) {
        //cria obj scanner para obter entrada no comando
        Scanner input = new Scanner(System.in);

        //cria obj Account e atribui a MyAccount
        Conta MinhaConta = new Conta();

        //exibe o valor inicial do nome(null)
        System.out.printf("nome inicial e: %s%n%n", MinhaConta.getNome());

        //solicita e lê o nome
        System.out.println("Por favor coloque o nome:");
        String oNome = input.nextLine(); //lê uma linha de texto
        MinhaConta.setNome(oNome); //insere theName em MyAccount
        System.out.println(); //gera uma linha em branco

        //exibe o nome no obj MyAccount
        System.out.printf("Nome no objeto minhaConta e: %n%s%n", MinhaConta.getNome());
    }
}
