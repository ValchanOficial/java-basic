package br.com.treinaweb.app;

import java.util.List;

import br.com.treinaweb.classe.ClasseAnimal;
import br.com.treinaweb.generic.ManipuladorAnimais;
import br.com.treinaweb.heranca.ClasseAve;
import br.com.treinaweb.heranca.ClasseMamifero;

public class Heranca {

	public static void main(String[] args) {
		ClasseMamifero cachorro = new ClasseMamifero("Tot�", 5, "Cachorro",2);
		try {
			cachorro.comer();
			System.out.println(cachorro.crescer());
			cachorro.dormir();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ClasseAve tucano = new ClasseAve("Tucky", 2, "Tucano", 5);
		ClasseAve tucanoDois = new ClasseAve("Tucky", 2, "Tucano", 5);
		System.out.println(tucano.equals(tucanoDois));//Comparando
		System.out.println(tucano.toString());
		try {
			tucano.comer();
			tucano.dormir();
			System.out.println(tucano.crescer());
		}catch(Exception e){
			e.printStackTrace();
		}	
		
		System.out.println("===============================");
		tucano.emitirBarulho("ca ca"); //chamou m�todo sobrescrito da ClasseAve
		cachorro.emitirBarulho("au au"); //chamou m�todo da ClasseAnimal	
		System.out.println("===============================");
		tucano.correr();
		cachorro.correr();
		System.out.println("===============================");
		//polimorfismo
		ClasseAnimal teste = new ClasseMamifero("teste", 4, "Teste", 5);
		teste.correr();
		System.out.println("===============================");
		//manipulador
		ManipuladorAnimais<ClasseAve> manipuladorAnimais = new ManipuladorAnimais<ClasseAve>();
		ClasseAve ave = new ClasseAve("Ara", 3, "Arara", 5);
		System.out.println("Inseri a ave.");
		manipuladorAnimais.inserirAnimal(ave);
		ClasseAve aveRecuperada = manipuladorAnimais.getPorPosicao(0);
		System.out.println("Ave recuperada: "+ aveRecuperada.getNome());
		List<ClasseAve> aves = manipuladorAnimais.getAnimais();
		for(ClasseAve a: aves) {
			System.out.println("Ave recuperada: "+ a.getNome());
		}
	}
}