package br.com.treinaweb.heranca;

import br.com.treinaweb.classe.ClasseAnimal;

//classe final n�o pode ser extendida
public final class ClasseAve extends ClasseAnimal{
	
	private int quantidadeDeOvos;
	
	public ClasseAve(String nome, int idade, String especie, int quantidadeDeOvos) {
		super(nome, idade, especie);//refer�ncia a Classe
		this.quantidadeDeOvos = quantidadeDeOvos;
	}
	public int getQuantidadeDeOvos() {
		return quantidadeDeOvos;
	}
	public void setQuantidadeDeOvos(int quantidadeDeOvos) {
		this.quantidadeDeOvos = quantidadeDeOvos;
	}
	//sobrescrevendo o m�todo toString de Object
	@Override
	public String toString() {
		return "Nome: "+this.getNome()+"; Esp�cie: "+this.getEspecie()+".";
	}
	//retorna a compara��o entre valores
	@Override
	public boolean equals(Object obj) {
		ClasseAve aveDois = (ClasseAve)obj;
		return this.getNome().equals(aveDois.getNome()) &&
				this.getEspecie().equals(aveDois.getEspecie())&&
				this.getIdade()==aveDois.getIdade()&&
				this.getQuantidadeDeOvos()==aveDois.getQuantidadeDeOvos();
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	//Override no m�todo da ClasseAnimal
	@Override
	public void emitirBarulho(String barulho) {
		System.out.println(barulho.toUpperCase());
	}
	@Override
	public void correr() {
		System.out.println("A ave est� correndo.");
	}	
}