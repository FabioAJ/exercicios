/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Cria uma classe Book
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	
	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		String dataAuthors = "";

		for (int i = 0; i < authors.length; i++) {
			dataAuthors += authors[i].toString() + (i < authors.length - 1 ? ", " : "");
		}

		return "Book [name=" + name + ", Authors={" + dataAuthors + "}, price=" + price + ", qty=" + qty + "]";
	}

	public String getAuthorNames() {

		String names = "";

		for (int i = 0; i < authors.length; i++) {
			names += authors[i].getName() + (i < authors.length - 1 ? ", " : "");
		}
		return names;
	}
}
