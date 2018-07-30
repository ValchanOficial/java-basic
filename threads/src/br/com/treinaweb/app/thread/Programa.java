package br.com.treinaweb.app.thread;

import br.com.treinaweb.pct.threads.TabuadaRunnable;

public class Programa {

	public static void main(String[] args) {
		TabuadaRunnable tabuadaDoCinco = new TabuadaRunnable(5);
		TabuadaRunnable tabuadaDoSeis = new TabuadaRunnable(6);
		Thread tr5 = new Thread(tabuadaDoCinco);
		Thread tr6 = new Thread(tabuadaDoSeis);
		tr5.start();
		try {
			tr5.join(3000);//executa 1º a thread 5 depois de 3segundos junta as threads
			tr5.interrupt();//cancela/para a thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tr6.start();
		System.out.println("Threads iniciadas");
		
	}
}