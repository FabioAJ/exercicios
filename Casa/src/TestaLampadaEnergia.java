/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 18/01/2019
Objetivo sucinto do programa: Reproduz a energia de uma casa com lampada, usando composi��o.
Refer�ncia ao enunciado/origem do exerc�cio: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  p�ginas 260 ate 262
*/

public class TestaLampadaEnergia {

	public static void main(String[] args) {
		Energia energia = new Energia(true, 500);
		Lampada lampada = new Lampada(false, 20, energia);
		
		System.out.println(lampada);
	}

}
