package br.com.treinaweb.classe;

//Classe exemplo animal
public class Classe {
	
	//Atributos
	static public int QUANTIDADE_ANIMAIS = 0;//atribitos estáticos devem ser escritos em uppercase
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
			throw new Exception("O nome não pode ser vazio.");
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
	public void morrer() {
		estaVivo = false;
		System.out.println(nome+" infelizmente morreu.");
	}
	static public void verificarSeEstaVivo(Classe animal) {
		//operador ternário
		System.out.println(animal.isEstaVivo()?animal.getNome()+" está vivo":"Infelizmente "+animal.getNome()+" morreu.");
	}
}