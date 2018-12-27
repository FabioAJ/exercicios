/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 14/12/2018
Objetivo sucinto do programa: Cria contas bancarias que pode ser modificadas com metodos set e get.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class TestaContaBancaria {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, "Jorge", 10000);
        System.out.println(conta1.toString());
        System.out.println();

        ContaBancaria conta2 = new ContaBancaria(2, "Joao", 500);
        System.out.println(conta2.toString());
        System.out.println();

        ContaBancaria conta3 = new ContaBancaria(3, "Joana", 400);
        System.out.println(conta3.toString());
        System.out.println();

        System.out.println("Id da conta 3: " + conta3.getId());
        System.out.println("Titular da conta 3: " + conta3.getNomeTitular());
        System.out.println();
        System.out.println("Saldo da 2 conta: " + conta2.getSaldo());
        System.out.println("Saldo da 1 conta: " + conta1.getSaldo());
        System.out.println();
        System.out.println(conta1.realizarTransferencia(conta2, 500));
        System.out.println();
        System.out.println("Saldo da 2 conta apos a transferencia: " + conta2.getSaldo());
        System.out.println("Saldo da 1 conta apos a transferencia: " + conta1.getSaldo());
    }

}
