package br.com.treinaweb.estruturas;

import java.util.Scanner;

public class LacosDeRepeticaoFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número para que a tabuada seja gerada: ");
		int numero = leitor.nextInt();
		for (int i=0;i<=10;i++){
		    System.out.printf("%d x %d = %d%n",numero,i,numero*i);
		}
		leitor.close();
	}
}