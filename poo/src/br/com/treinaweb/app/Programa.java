package br.com.treinaweb.app;

import br.com.treinaweb.classe.Classe; //classe importada

public class Programa {

	public static void main(String[] args) {
		Classe cachorro = new Classe("Tot�",5,"Cachorro"); //chamando classe
		Classe.QUANTIDADE_ANIMAIS++;
		//setando atributos
		try {
			Classe.verificarSeEstaVivo(cachorro);
			//executando a��es(m�todos)
			cachorro.dormir();
			cachorro.comer();
			cachorro.emitirBarulho("AU AU");
			System.out.println(cachorro.crescer());
			cachorro.morrer();//estaVivo = false
			System.out.println("Quantidade de animais cadastrados: "+Classe.QUANTIDADE_ANIMAIS);
		} catch (Exception e) {
		System.out.println(e.getMessage());;
		}
	}
}