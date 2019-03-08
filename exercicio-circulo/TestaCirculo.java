/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 12/12/2018
Objetivo sucinto do programa: Testa um circulo que pode ser modificado com metodos set e get
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class TestaCirculo {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        System.out.println(circulo1.toString());

        Circulo circulo2 = new Circulo(2.0);
        System.out.println(circulo2.toString());

        Circulo circulo3 = new Circulo(3.0, "preto");
        System.out.println(circulo3.toString());

        System.out.println("Area do circulo 1: " + circulo1.getArea());
        System.out.println("Circunferencia do circulo 2: " + circulo2.getCircunferencia());
        System.out.println("Raio do circulo 3: " + circulo3.getRaio());
        circulo3.setRaio(5.0);
        System.out.println("Raio do circulo 3 mudou de 3 para: " + circulo3.getRaio());
        System.out.println("Cor do circulo 3: " + circulo3.getCor());
        circulo3.setCor("Laranja");
        System.out.println("cor do circulo 3 mudou de preto para: " + circulo3.getCor());
    }
}
