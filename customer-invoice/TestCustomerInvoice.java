/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 30/01/2019
Objetivo sucinto do programa: Cria uma classe de teste para customer e invoice
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class TestCustomerInvoice {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Gold D. Roger", 10);
		Invoice invoice1 = new Invoice(233, customer1, 120.00);
		
		System.out.println("Fatura ID: " + invoice1.getId());
		System.out.println("Cliente: " + customer1.getName() + "(" + customer1.getId() + ")");
		System.out.printf("Price: R$" + "%.2f" + "\n", invoice1.getAmount()); 
		System.out.printf("Price after discount of 10%s: " + "%.2f", "%", invoice1.getAmountAfterDiscount());
	} 
}
