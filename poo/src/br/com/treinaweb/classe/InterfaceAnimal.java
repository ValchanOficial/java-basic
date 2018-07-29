package br.com.treinaweb.classe;

public interface InterfaceAnimal {
	//obriga ter os métodos
	String crescer();
	void dormir();
	void comer();
	void morrer();
	void emitirBarulho();
	void emitirBarulho(String barulho);
	void correr();
}