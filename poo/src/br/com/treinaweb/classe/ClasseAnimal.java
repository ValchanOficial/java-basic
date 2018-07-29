package br.com.treinaweb.classe;

//Classe exemplo animal
public class ClasseAnimal {
	
	//Atributos
	static public int QUANTIDADE_ANIMAIS = 0;//atribitos est�ticos devem ser escritos em uppercase
	private String nome;
	private int idade;
	private String especie;
	private boolean estaVivo;
	//Construtor
	public ClasseAnimal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.estaVivo = true;
	}
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
	//sobrecarga de m�todos
	public final void emitirBarulho() { //N�o pode ser sobrescrevido
		System.out.println("Barulho do animal: BARULHO");
	}
	public void emitirBarulho(String barulho) {
		System.out.println("Barulho do animal: "+barulho);
	}
	//est�tico
	static public void verificarSeEstaVivo(ClasseAnimal animal) {
		//operador tern�rio
		System.out.println(animal.isEstaVivo()?animal.getNome()+" est� vivo":"Infelizmente "+animal.getNome()+" morreu.");
	}
}