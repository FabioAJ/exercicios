/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 30/01/2019
Objetivo sucinto do programa: Cria uma fatura
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class Invoice {
	
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		super();
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public double getAmountAfterDiscount() {
		double x = customer.getDiscount() * 0.01;
		x *= this.amount;
		double y = this.amount - x;
		return y;
	}
	
}
