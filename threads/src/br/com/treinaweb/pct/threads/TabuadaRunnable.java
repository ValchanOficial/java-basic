package br.com.treinaweb.pct.threads;

public class TabuadaRunnable implements Runnable{
	
	private int numero;
	
	public TabuadaRunnable(int numero) {
		this.numero = numero;
	}	
	@Override
	public void run() {
		for(int i=0; i<=10;i++) {
			if(Thread.interrupted()) {
				return;
			}
			System.out.printf("%d x %d = %d%n",numero,i,numero*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}