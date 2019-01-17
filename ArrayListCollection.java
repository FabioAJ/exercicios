
/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 17/01/2019
Objetivo sucinto do programa: Reproduz as cole��es de ArrayList
Refer�ncia ao enunciado/origem do exerc�cio: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  p�ginas 225 ate 227
*/

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String[] args) {
// cria um novo ArrayList de strings com uma capacidade inicial de 10
		ArrayList<String> items = new ArrayList<String>();

		items.add("vermelho"); // anexa um item � lista
		items.add(0, "amarelo"); // insere amarelo no �ndice 0

// cabe�alho
		System.out.print("Exibir o conte�do da lista com loop controlado pelo contador:");

// exibe as cores na lista
		for (int i = 0; i < items.size(); i++)
			System.out.printf(" %s", items.get(i));

// exibe as cores usando for aprimorada no m�todo display
		display(items, "%nExibir o conte�do da lista com a declara��o aprimorada:");

		items.add("verde"); // adiciona verde ao fim da lista
		items.add("amarelo"); // adiciona amarelo ao fim da lista
		display(items, "Liste dois novos elementos: ");

		items.remove("amarelo"); // remove o primeiro amarelo
		display(items, "Remove a primeira instancia de amarelo: ");

		items.remove(1); // remove o item no �ndice 1
		display(items, "Remove o segundo elemento da lista verde: ");

// verifica se um valor est� na lista
		System.out.printf("\"vermelho\" esta na lista%n", items.contains("vermelho") ? "" : "nao ");

// exibe o n�mero de elementos na lista
		System.out.printf("Tamanho: %s%n", items.size());
	}

// exibe elementos do ArrayList no console
	public static void display(ArrayList<String> items, String header) {
		System.out.printf(header); // exibe o cabe�alho

// exibe cada elemento em itens
		for (String item : items)
			System.out.printf(" %s", item);

		System.out.println();
	}
} // fim da classe ArrayListCollection