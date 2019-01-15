/*
* Nome do autor: Fábio Augusto Amaro Jaime
* Data de criação do arquivo: 15/01/2019
* Objetivo sucinto do programa: Cria uma luta entre emojis com POO
* Referência ao enunciado/origem do exercício: https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY
*/

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals (l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("desafiante");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: // empate
                System.out.println("Empatou");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
                case 1: //desafiado
                System.out.println("Vitoria do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
                case 2: //desafiante
                System.out.println("Vitoria do " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
            }

        } else {
            System.out.println("Essa luta nao pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
}
