package br.com.treinaweb.heranca;

import br.com.treinaweb.classe.ClasseAnimal;

public class ClasseMamifero extends ClasseAnimal{
	
	private double tamanhoDaCauda;
	
	public ClasseMamifero(String nome, int idade, String especie, double tamanhoDaCauda) {
		super(nome, idade, especie);//referÍncia a Classe
		this.tamanhoDaCauda = tamanhoDaCauda;
	}
	public double getTamanhoDaCauda() {
		if(tamanhoDaCauda == 0) {
			this.estaVivo = false;//utilizando atributo protected
		}
		return tamanhoDaCauda;
	}
	public void setTamanhoDaCauda(double tamanhoDaCauda) {
		this.tamanhoDaCauda = tamanhoDaCauda;
	}	
}