/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 07/02/2019
Objetivo sucinto do programa: Demonstra o uso de Threads.
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1g6IIaB-HUmiA4QaFkECVG4JA0PRx2BDExf2RtSj4XnQ/edit
*/

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaThreads {

	public static void main(String[] args) {
		Printer printer1 = new Printer("Jorge", 20,100);
		Printer printer2 = new Printer("Jorgin", 30,500);
		
		printer1.start();
		printer2.start();
		
		try {
			printer1.join();
			printer2.join();
		} catch (InterruptedException ex) {
			Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
}


class Printer extends Thread {
	String text;
	int delay, times;
	
	public Printer(String text, int times, int delay) {
		this.text = text;
		this.times = times;
		this.delay = delay;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.println(text);
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException ex) {
				Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}