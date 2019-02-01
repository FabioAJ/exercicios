/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 01/02/2019
Objetivo sucinto do programa: Cria a classe Circle, Cylinder e as testam mostrando uma composição 
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class TestCircleCylinder {

	public static void main(String[] args) {
		Circle circle1 = new Circle(2, "Blue");
		Cylinder cylinder1 = new Cylinder(2, 2, "Green");

		System.out.println(circle1.toString());
		System.out.printf("Area of circle = " + "%.2f\n" ,circle1.getArea());
		System.out.printf("Area of cylinder = " + "%.2f\n" ,cylinder1.getArea());
		System.out.printf("Volume of cylinder = " + "%.2f" , cylinder1.getVolume());
	}

}
