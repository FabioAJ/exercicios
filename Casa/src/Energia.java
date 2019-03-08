/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 18/01/2019
Objetivo sucinto do programa: Reproduz a energia de uma casa
Refer�ncia ao enunciado/origem do exerc�cio: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  p�ginas 260 ate 262
*/

public class Energia {
	private boolean disjuntor;
	private double preco;

	public Energia(boolean disjuntor, double preco) {
		this.disjuntor = disjuntor;
		this.preco = preco;
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
		return "energia ligada? = " + this.disjuntor + ", preco da energia = " + this.preco + "R$";
	}

}
