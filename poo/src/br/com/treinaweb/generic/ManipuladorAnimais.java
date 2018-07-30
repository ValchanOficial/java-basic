package br.com.treinaweb.generic;

import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.classe.ClasseAnimal;

public class ManipuladorAnimais<T extends ClasseAnimal> {
	
	private List<T> animais = new ArrayList<T>();
	
	public List<T> getAnimais(){
		return animais;
	}
	public T getPorPosicao(int indice) {
		return animais.get(indice);
	}
	public void inserirAnimal(T animal) {
		animais.add(animal);
	}
}