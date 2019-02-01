/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 01/02/2019
Objetivo sucinto do programa: Cria a classe Circle, Cylinder e as testam mostrando uma composição 
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/

public class Cylinder extends Circle{
	private double height = 1.0;

	public Cylinder() {
		super();
	}
	
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius,double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return (2 * Math.PI * Math.pow(super.getRadius(), 2)) + this.height * (super.getArea());
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return super.getArea() * this.height;
	}
}
