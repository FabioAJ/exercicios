/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 31/01/2019
Objetivo sucinto do programa: Cria um cliente
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class Customer {

	private int id;
	private String name;
	private char gender;

	public Customer(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return name + "(" + id + ")";
	}

}
