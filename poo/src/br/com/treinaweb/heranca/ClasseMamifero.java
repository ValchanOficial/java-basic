package br.com.treinaweb.heranca;

import br.com.treinaweb.classe.Classe;

public class ClasseMamifero extends Classe{
	
	private double tamanhoDaCauda;
	
	public ClasseMamifero(String nome, int idade, String especie, double tamanhoDaCauda) {
		super(nome, idade, especie);//referência a Classe
		this.tamanhoDaCauda = tamanhoDaCauda;
	}
	public double getTamanhoDaCauda() {
		return tamanhoDaCauda;
	}
	public void setTamanhoDaCauda(double tamanhoDaCauda) {
		this.tamanhoDaCauda = tamanhoDaCauda;
	}	
}