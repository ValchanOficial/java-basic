package br.com.treinaweb.helloworld.principal;

import br.com.treinaweb.escopo.EscopoDeVariavel;

public class Principal {

	public static void main(String[] args) {
		// Comentário de uma linha, inicia com duas barras
		System.out.println("Hello World");
		/*
		Comentário em bloco
		Aceita múltiplas linhas
		*/
		
		//chamando classe Escopo
		EscopoDeVariavel calc = new EscopoDeVariavel();
		System.out.println(calc.Somar());
	}
}