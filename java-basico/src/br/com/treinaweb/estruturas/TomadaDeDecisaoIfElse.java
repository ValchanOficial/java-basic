package br.com.treinaweb.estruturas;

import java.util.Scanner;

public class TomadaDeDecisaoIfElse {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Scanner leitorString = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade = leitor.nextInt();
		System.out.println("Digite (M) se voc� � homem ou (F) se voc� � mulher: ");
		String sexo = leitorString.nextLine();
		
		if(sexo.equals("M")) {
			if(idade>=21) {
				System.out.println("Voc� n�o vai mais crescer!");
			}else {
				System.out.println("Voc� vai mais crescer mais!");
			}
		}else if(sexo.equals("F")){
			if(idade>=18) {
				System.out.println("Voc� n�o vai mais crescer!");
			}else {
				System.out.println("Voc� vai mais crescer mais!");
			}
		}else {
			System.out.println("Op��o inv�lida!");
		}
	}
}