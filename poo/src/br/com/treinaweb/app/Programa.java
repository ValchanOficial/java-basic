package br.com.treinaweb.app;

import br.com.treinaweb.classe.Classe; //classe importada

public class Programa {

	public static void main(String[] args) {
		Classe cachorro = new Classe(); //chamando classe
		//setando atributos
		cachorro.nome = "Totó";
		cachorro.idade = 5;
		cachorro.especie = "Cachorro";
		//executando ações(métodos)
		cachorro.dormir();
		cachorro.comer();
		System.out.println(cachorro.crescer());
		
		Classe gato = new Classe();
		gato.nome = "Frajola";
		gato.idade = 3;
		gato.especie = "Gato";
		gato.comer();
		gato.dormir();
		System.out.println(gato.crescer());
	}
}