/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Cria uma classe Book
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Znd6TTkM0lh0M9vUTP1yVve8KSKEn8TlKzfJf8zyX9U/edit 
*/

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	public Book(String name, Author author, double price, int qty) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
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
		return "Book [name=" + name + ", Author[" + author + "], price=" + price + ", qty=" + qty + "]";
	}
}
