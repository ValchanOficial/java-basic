package br.com.treinaweb.heranca;

import br.com.treinaweb.classe.Classe;

public class ClasseAve extends Classe{
	
	private int quantidadeDeOvos;
	
	public ClasseAve(String nome, int idade, String especie, int quantidadeDeOvos) {
		super(nome, idade, especie);//referência a Classe
		this.quantidadeDeOvos = quantidadeDeOvos;
	}
	public int getQuantidadeDeOvos() {
		return quantidadeDeOvos;
	}
	public void setQuantidadeDeOvos(int quantidadeDeOvos) {
		this.quantidadeDeOvos = quantidadeDeOvos;
	}	
}