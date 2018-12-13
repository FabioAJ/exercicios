/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 13/12/2018
Objetivo sucinto do programa: Cria empregados que podem ser modificados com metodos set e get.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/

public class Empregado {

    private int id;
    private String primeiroNome;
    private String segundoNome;
    private double salario;

    public Empregado () {

    }

    public Empregado (int id, String primeiroNome, String segundoNome, double salario) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getNomeCompleto() {
        return primeiroNome + " " + segundoNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioAnual () {
        return salario * 12;
    }

    public void setAumentoSalario(double porcentagem) {
        this.salario = (this.salario + this.salario * (porcentagem / 100.0));
    }

    public String toString() {
        return "seu id e = " + id + " seu nome e = " + getNomeCompleto() + " e seu salario e = " + salario;
    }

}
