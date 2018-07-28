package br.com.treinaweb.classe;

//Classe exemplo animal
public class Classe {
	
	//Atributos
	public String nome;
	public int idade;
	public String especie;
	
	//Métodos
	public String crescer() {
		return nome +" está crescendo..";
	}
	public void dormir() {
		System.out.println(nome+" está dormindo..");
	}
	public void comer() {
		System.out.println(nome+" está comendo..");
	}
}