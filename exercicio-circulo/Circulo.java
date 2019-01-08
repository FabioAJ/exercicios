/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 12/12/2018
Objetivo sucinto do programa: Cria um circulo que pode ser modificado com metodos set e get.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class Circulo {

    private double raio = 1.0;
    private String cor = "Vermelho";

    public Circulo () { //construtor se nao passado nenhum parametro

    }

    public Circulo (double raio) {//construtor se passado 1 parametro
        this.raio = raio;
    }

    public Circulo (double raio, String cor) {//construtor se passado 2 parametros
        this(raio);
        this.cor = cor;
    }

    public double getRaio () {//pega o raio do circulo *
        return raio;
    }

    public String getCor () {//pega a cor do circulo *
        return cor;
    }

    public void setRaio (double raio) {//coloca um raio no circulo *
        this.raio = raio;
    }

    public void setCor (String cor) {//coloca uma cor no circulo *
        this.cor = cor;
    }

    public double getArea () {//coloca uma area no circulo /
        double area = Math.PI * (raio * raio);
        return area;
    }

    public double getCircunferencia () {//pega a circunferencia do circulo /
        double circunferencia = (raio * 2) * Math.PI;
        return circunferencia;
    }

    public String toString () {//transforma o atributo/variavel em atributo
        return "Circulo = [raio = " + raio + " cor = " + cor + "]";
    }
}
