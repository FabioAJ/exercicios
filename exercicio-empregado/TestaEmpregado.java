/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 13/12/2018
Objetivo sucinto do programa: Testa funcionarios com seus nomes e salarios
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class TestaEmpregado {

    public static void main(String[] args) {
        Empregado fabio = new Empregado(4 , "Fabin" , "Augusto" , 10000.0);
        System.out.println(fabio.toString());

        Empregado joao = new Empregado(5 , "Joao" , "Oliveira" , 500.0);
        System.out.println(joao.toString());

        Empregado elian = new Empregado(3 , "Elian" , "Melo" , 10.0);
        System.out.println(elian.toString());

        Empregado ilton = new Empregado(2 , "Ilton" , "Batista" , 600.0);
        System.out.println(ilton.toString());

        Empregado ezequiel = new Empregado(1 , "Ezequiel" , "Santana" , 346.0);
        System.out.println(ezequiel.toString());

        System.out.println("id de fabio: " + fabio.getId());
        System.out.println("primeiro nome de elian e: " + elian.getPrimeiroNome());
        elian.setPrimeiroNome("elianzin");
        System.out.println("primeiro nome de elian agora e: " + elian.getPrimeiroNome());
        System.out.println("segundo nome de joao e: " + joao.getSegundoNome());
        joao.setSegundoNome("jorge");
        System.out.println("segundo nome de joao agora e: " + joao.getSegundoNome());
        System.out.println("nome completo de ilton e: " + ilton.getNomeCompleto());
        System.out.println("Salario de ezequiel e: " + ezequiel.getSalario());
        ezequiel.setSalario(1000);
        System.out.println("Salario de ezequiel agora e: " + ezequiel.getSalario());
        System.out.println("Salario anual de ezequiel e: " + ezequiel.getSalarioAnual());
        ezequiel.setAumentoSalario(30.0);
        System.out.println("Aumento salarial para ezequiel de 30 por cento agora seu salario e: " + ezequiel.getSalario());
    }
}
