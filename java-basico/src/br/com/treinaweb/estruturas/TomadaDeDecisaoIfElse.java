package br.com.treinaweb.estruturas;

import java.util.Scanner;

public class TomadaDeDecisaoIfElse {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Scanner leitorString = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade = leitor.nextInt();
		System.out.println("Digite (M) se você é homem ou (F) se você é mulher: ");
		String sexo = leitorString.nextLine();
		
		if(sexo.equals("M")) {
			if(idade>=21) {
				System.out.println("Você não vai mais crescer!");
			}else {
				System.out.println("Você vai mais crescer mais!");
			}
		}else if(sexo.equals("F")){
			if(idade>=18) {
				System.out.println("Você não vai mais crescer!");
			}else {
				System.out.println("Você vai mais crescer mais!");
			}
		}else {
			System.out.println("Opção inválida!");
		}
	}
}