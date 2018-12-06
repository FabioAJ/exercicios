/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 06/12/2018
Objetivo sucinto do programa: Cria objetos de cavaleiros
*/

public class Cavaleiro {

    private String arma = "";
    private String reino = "";
    private double forca = 20;

    public Cavaleiro (String arma) {
        this.arma = arma;
    }

    public Cavaleiro (String arma, String reino) {
        this(arma);
        this.reino = reino;
    }

    public Cavaleiro (String arma, String reino, double forca) {
        this(arma, reino);
        this.forca = forca + forca;
    }

    public static void main(String[] args) {
        Cavaleiro samurai = new Cavaleiro("katana", "japones", 40);
        Cavaleiro link = new Cavaleiro("master sword", "hylian", 100);
    }
}
