package br.com.treinaweb.variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		String nomeVariavel = "TreinaWeb";
		int variavelInteiro = 2018;
		double variavelPontoFlutuante = 20.18;
		
		System.out.println("Ola, "+nomeVariavel);
		System.out.println("Estamos em "+variavelInteiro+"!");
		System.out.println(variavelPontoFlutuante);
		
		//Convertendo o tipo de dado
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		String idadeUsuario = leitor.nextLine(); //recebe o dado do tipo String no console 
		//String idadeUsuario = leitor.nextInt();
		
		//Estrutura de decisão + conversão de String para Integer
		if(Integer.parseInt(idadeUsuario)>=18) {
			System.out.println("Usuário maior de idade.");
		}else {
			System.out.println("Usuário menor de idade.");
		}
		
		double a = 1.5; //double é maior que int
		int b = (int)a; //convertendo para int
		System.out.println(b);
		
		leitor.close();
	}
}