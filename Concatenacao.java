/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 01/02/2019
Objetivo sucinto do programa: Mostra exemplos de uso de ArrayList com concatena��o
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1tHsvSkW3aBy2ZpfaSjeoBOKYCG-XaKoBZA8AwFiPxlw/edit
*/

import java.util.ArrayList;

public class Concatenacao {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("Palavra 1");
		myList.add("Palavra 2");
		
		StringBuffer buffer = new StringBuffer();
		for (String percorrer : myList) {
			buffer.append(percorrer + " ");
		}
		
		StringBuilder builder = new StringBuilder();
		for (String percorre : myList) {
			builder.append(percorre + " ");
		}
		
		System.out.println(buffer);
		System.out.println(builder);
	}
}
