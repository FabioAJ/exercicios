/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 23/01/2019
Objetivo sucinto do programa: Cria uma classe que testa as classes Book e Author.
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class TestAuthorBook {

	public static void main(String[] args) {

		Author author = new Author("Echiro Oda", "Echiro@gmail.com", 'M');
		Book book = new Book("One Piece", author, 11, 30);

		System.out.println(book.toString());
	}

}
