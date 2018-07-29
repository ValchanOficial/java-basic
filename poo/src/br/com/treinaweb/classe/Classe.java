package br.com.treinaweb.classe;

//Classe exemplo animal
public class Classe {
	
	//Atributos
	private String nome;
	private int idade;
	private String especie;
	private boolean estaVivo = true;
	
	//Encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if(nome.equals("")) {
			throw new Exception("O nome n�o pode ser vazio.");
		}
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isEstaVivo() {
		return estaVivo;
	}
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
	public void morrer() {
		estaVivo = false;
		System.out.println(nome+" infelizmente morreu.");
	}
}