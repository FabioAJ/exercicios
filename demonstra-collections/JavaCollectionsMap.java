/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 31/01/2019
Objetivo sucinto do programa: Mostra exemplos de uso de Map
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit
*/

import java.util.HashMap;
import java.util.Map.Entry;

public class JavaCollectionsMap {

	public static void main(String[] args) {
		HashMap<String, Integer> myBooks = new HashMap<>();
		
		myBooks.put("One Piece", 10);
		myBooks.put("Naruto", 7);
		myBooks.put("Dragon Ball", 6);
		
		for (Entry<String, Integer> entry : myBooks.entrySet()) {
			String title = entry.getKey();
			int score = entry.getValue();
			
			System.out.println(title + " e nota " + score);
		}
		
		System.out.println(myBooks.containsKey("Naruto"));
		
		myBooks.remove("Naruto");
		
		System.out.println(myBooks.containsKey("Naruto"));
	}
}
