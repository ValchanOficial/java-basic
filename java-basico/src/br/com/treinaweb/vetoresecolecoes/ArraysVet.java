package br.com.treinaweb.vetoresecolecoes;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysVet {

	public static void main(String[] args) {
		String[] nomeDosAmigos = new String[5];
		String[] nomeDosAmigos2 = new String[5];
		Scanner leitor = new Scanner(System.in);
		for(int i=0;i<=4;i++) {
			System.out.print("Digite o nome de um de seus melhores amigos: ");
			nomeDosAmigos[i] = leitor.nextLine();
			nomeDosAmigos2[i] = nomeDosAmigos[i];
		}
		//Arrays.fill(nomeDosAmigos, "Amigo"); //preenche com o valor especificado
		//Arrays.sort(nomeDosAmigos);//ordenado ascendente
		System.out.println("Seus melhores amigos s�o: ");
		for(int i=0;i<=4;i++) {
			System.out.println("Amigo: "+nomeDosAmigos[i]);
		}
		System.out.printf("Tamanho do vetor: %d%n",nomeDosAmigos.length);
		//compara conte�do e posi��o dos arrays
		System.out.printf("Os vetores s�o iguais? "+Arrays.equals(nomeDosAmigos, nomeDosAmigos2));
		//necess�rio a array estar ordenada
		System.out.println("A posi��o do Jo�o �: "+Arrays.binarySearch(nomeDosAmigos,"Joao"));
		leitor.close();
	}
}