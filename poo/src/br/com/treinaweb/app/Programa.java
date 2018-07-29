package br.com.treinaweb.app;

import br.com.treinaweb.classe.ClasseAnimal; //classe importada

public class Programa {

	public static void main(String[] args) {

		ClasseAnimal cachorro = new ClasseAnimal("Tot�",5,"Cachorro"); //chamando classe
		ClasseAnimal.QUANTIDADE_ANIMAIS++;
		//setando atributos
		try {
			ClasseAnimal.verificarSeEstaVivo(cachorro);
			//executando a��es(m�todos)
			cachorro.dormir();
			cachorro.comer();
			cachorro.emitirBarulho("AU AU");
			System.out.println(cachorro.crescer());
			cachorro.morrer();//estaVivo = false
			System.out.println("Quantidade de animais cadastrados: "+ClasseAnimal.QUANTIDADE_ANIMAIS);
		} catch (Exception e) {
		System.out.println(e.getMessage());;
		}
	}
}