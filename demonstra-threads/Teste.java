/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 07/02/2019
Objetivo sucinto do programa: Demonstra o uso de Threads.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1g6IIaB-HUmiA4QaFkECVG4JA0PRx2BDExf2RtSj4XnQ/edit
*/

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread thread = new  MinhaThread("Thread #1", 500);
		MinhaThread thread2 = new  MinhaThread("Thread #2", 1000);
	}

}
