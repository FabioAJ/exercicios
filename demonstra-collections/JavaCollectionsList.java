/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 31/01/2019
Objetivo sucinto do programa: Mostra exemplos de uso de List
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit
*/

import java.util.ArrayList;

public class JavaCollectionsList {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		
		int numOfElements = (int) (Math.random() * 100);
		
		for (int i = 0; i < numOfElements; i++) {
			myList.add(i);
		}
		
		for (int element : myList) {
			System.out.println(element);
		}
	}
}
