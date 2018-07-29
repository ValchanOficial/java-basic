package br.com.treinaweb.app;

import br.com.treinaweb.classe.Classe; //classe importada

public class Programa {

	public static void main(String[] args) {
		Classe cachorro = new Classe(); //chamando classe
		Classe.QUANTIDADE_ANIMAIS++;
		//setando atributos
		try {
			cachorro.setNome("Tot�");
			cachorro.setIdade(5);
			cachorro.setEspecie("Cachorro");
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