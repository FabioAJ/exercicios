/*
* Nome do autor: Fábio Augusto Amaro Jaime
* Data de criação do arquivo: 15/01/2019
* Objetivo sucinto do programa: Cria uma luta entre emojis com POO
* Referência ao enunciado/origem do exercício: https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY
*/

public class Lutador{

    private String nome;
    private String nacionalidade;
    private String categoria;
    private double altura;
    private double peso;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.idade = idade;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("---------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Direto de: "+ this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " metros de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou: "+ this.getVitorias() + " vezes");
        System.out.println("Perdeu:"+ this.getDerrotas() + " vezes");
        System.out.println("Empates: "+ this.getEmpates() + " vezes");
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Tem " + this.getVitorias() + " vitorias");
        System.out.println("Tem " + this.getDerrotas() + " derrotas");
        System.out.println("Tem " + this.getEmpates() + " empates");
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria(){
        return categoria;
    }

    private void setCategoria(double peso) {
        if (peso < 52.2) {
            categoria = "Inválido";
        }
        else if (peso <= 70.3) {
            categoria = "Leve";
        }
        else if (peso <= 83.9) {
            categoria = "Médio";
        }
        else if (peso < 120.2) {
            categoria = "Pesado";
        }
        else {
            categoria = "Inválido";
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void setDerrotas(int idade) {
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
