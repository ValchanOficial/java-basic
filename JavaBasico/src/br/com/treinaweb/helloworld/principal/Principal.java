package br.com.treinaweb.helloworld.principal;

import br.com.treinaweb.escopo.EscopoDeVariavel;

public class Principal {

	public static void main(String[] args) {
		// Coment�rio de uma linha, inicia com duas barras
		System.out.println("Hello World");
		/*
		Coment�rio em bloco
		Aceita m�ltiplas linhas
		*/
		
		//chamando classe Escopo
		EscopoDeVariavel calc = new EscopoDeVariavel();
		System.out.println(calc.Somar());
	}
}