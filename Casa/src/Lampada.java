/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 18/01/2019
Objetivo sucinto do programa: Reproduz a energia de uma casa com lampada, usando composi��o.
Refer�ncia ao enunciado/origem do exerc�cio: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  p�ginas 260 ate 262
*/

public class Lampada {
	
	private boolean disjuntor;
	private double preco;
	private Energia energia;
	
	public Lampada(boolean disjuntor, double preco, Energia energia) {
		this.disjuntor = disjuntor;
		this.preco = preco;
		this.energia = energia;
	}

	public Energia getEnergia() {
		return energia;
	}

	public void setEnergia(Energia energia) {
		this.energia = energia;
	}

	public boolean getDisjuntor() {
		return disjuntor;
	}

	public void setDisjuntor(boolean disjuntor) {
		this.disjuntor = disjuntor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "Lampada ligada? = " + disjuntor + ", preco da lampada = " + preco + "R$\n" + energia;
	}

}
