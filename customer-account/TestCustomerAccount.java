/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 31/01/2019
Objetivo sucinto do programa: Testa a composi��o das classes Customer e Account
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class TestCustomerAccount {

	public static void main(String[] args) {
		Customer customer1 = new Customer(2, "Sogeking", 'M');
		Account account1 = new Account(466, customer1, 300);
		
		System.out.printf(customer1.toString() + " balance = $" + "%.2f" , account1.getBalance());
		account1.debit(10);
		account1.credit(20);
		System.out.printf("\n" + customer1.toString() + " balance = $" + "%.2f" , account1.getBalance());
	}

}
