/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 06/02/2019
Objetivo sucinto do programa: Cria a classe Person, Staff e Student e as testam mostrando uma composição 
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class TestPersonStudentStaff {

	public static void main(String[] args) {
		Person jorge = new Person("Jorge", "Copacabana");
		Student student1 = new Student("Fabio", "helio alves", "js", 25, 300);
		Staff staff1 = new Staff("joao", "Russia", "Rob. Silva", 10);
		
		//println Person 
		System.out.println(jorge);
		//println Student
		System.out.println(student1 + "program=" + student1.getProgram() + ", year=" + student1.getYear() + ", fee=" + student1.getFee() + "]");
		//println Staff
		System.out.println(staff1 + "school=" + staff1.getSchool() + ", pay=" + staff1.getPay() + "]");
	}

}
