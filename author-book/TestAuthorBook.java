/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Cria uma classe que testa as classes Book e Author.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Znd6TTkM0lh0M9vUTP1yVve8KSKEn8TlKzfJf8zyX9U/edit 
*/

public class TestAuthorBook {

	public static void main(String[] args) {

		Author author = new Author("Echiro Oda", "Echiro@gmail.com", 'M');
		Author author2 = new Author("Echiro Oda", "Echiro@gmail.com", 'M');
		Book book = new Book("One Piece", author, 11, 30);

		System.out.println(book.toString());
		
		System.out.println(author.equals(author2));
	}

}
