package br.com.treinaweb.app;

import br.com.treinaweb.classe.Classe; //classe importada

public class Programa {

	public static void main(String[] args) {
		Classe cachorro = new Classe(); //chamando classe
		//setando atributos
		try {
			cachorro.setNome("Tot�");
			cachorro.setIdade(5);
			cachorro.setEspecie("Cachorro");
			System.out.println(cachorro.isEstaVivo());
			//executando a��es(m�todos)
			cachorro.dormir();
			cachorro.comer();
			System.out.println(cachorro.crescer());
			cachorro.morrer();//estaVivo = false
		} catch (Exception e) {
		System.out.println(e.getMessage());;
		}
	}
}