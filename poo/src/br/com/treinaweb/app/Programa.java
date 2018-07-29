package br.com.treinaweb.app;

import br.com.treinaweb.classe.ClasseAnimal; //classe importada
import br.com.treinaweb.heranca.ClasseMamifero;

public class Programa {

	public static void main(String[] args) {
		//Não é possível instanciar mais ClasseAnimal, agora utilizada apenas para base nas outras classes.
		ClasseMamifero cachorro = new ClasseMamifero("Totó",5,"Cachorro", 2); //chamando classe
		ClasseAnimal.QUANTIDADE_ANIMAIS++;
		//setando atributos
		try {
			ClasseAnimal.verificarSeEstaVivo(cachorro);
			//executando ações(métodos)
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