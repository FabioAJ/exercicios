/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 30/01/2019
Objetivo sucinto do programa: Cria um Cliente
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class Customer {

	private int id;
	private String name;
	private int discount;
	
	public Customer(int id, String name, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "a";
	}
	
}
