package br.com.treinaweb.app;

import br.com.treinaweb.heranca.ClasseAve;
import br.com.treinaweb.heranca.ClasseMamifero;

public class Heranca {

	public static void main(String[] args) {
		ClasseMamifero cachorro = new ClasseMamifero("Totó", 5, "Cachorro",2);
		try {
			cachorro.comer();
			System.out.println(cachorro.crescer());
			cachorro.dormir();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ClasseAve tucano = new ClasseAve("Tucky", 2, "Tucano", 5);
		try {
			tucano.comer();
			tucano.dormir();
			System.out.println(tucano.crescer());
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}