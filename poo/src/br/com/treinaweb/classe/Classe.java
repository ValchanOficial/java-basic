package br.com.treinaweb.classe;

//Classe exemplo animal
public class Classe {
	
	//Atributos
	public String nome;
	public int idade;
	public String especie;
	
	//M�todos
	public String crescer() {
		return nome +" est� crescendo..";
	}
	public void dormir() {
		System.out.println(nome+" est� dormindo..");
	}
	public void comer() {
		System.out.println(nome+" est� comendo..");
	}
}