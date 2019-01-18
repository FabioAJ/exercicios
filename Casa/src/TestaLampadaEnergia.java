/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 18/01/2019
Objetivo sucinto do programa: Reproduz a energia de uma casa com lampada, usando composição.
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  páginas 260 ate 262
*/

public class TestaLampadaEnergia {

	public static void main(String[] args) {
		Energia energia = new Energia(true, 500);
		Lampada lampada = new Lampada(false, 20, energia);
		
		System.out.println(lampada);
	}

}
