/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: A classe processador é implementada na classe Computador
Referência ao enunciado/origem do exercício: https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html
*/

public class Processador implements Computador {

    private int nucleos;

    public int getNucleos() {
        return this.nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    @Override
    public boolean getLigado(boolean ligado) {
        ligado = true;
        return ligado;
    }

    @Override
    public double getPreco(double preco) {
        preco = 999;
        return preco;
    }

    @Override
    public double getTemperatura(double temperatura) {
        temperatura = 40.6;
        return temperatura;
    }

}