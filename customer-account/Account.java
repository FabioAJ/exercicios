/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 31/01/2019
Objetivo sucinto do programa: Cria uma conta de banco
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class Account {
	private int id;
	private Customer customer;
	private double balance = 0.0;

	public Account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int id, Customer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}


	public int getId() {
		return id;
	}


	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return customer.toString() + " balance = $" + this.getBalance();
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public String credit(double value) {
        balance += value;
        return "You had added " + value;
    }

    public String debit(double value) {
    	if (balance >= value) {
    		balance -= value;
    		return "You removed " + value;
    	} else {
    		return "Amount withdrawn exceeds the current balance!";
    	}
    }
}
