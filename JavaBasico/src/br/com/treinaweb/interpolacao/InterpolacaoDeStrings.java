package br.com.treinaweb.interpolacao;

public class InterpolacaoDeStrings {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 5;
		int resultado = (a*b)+c;
		
		//concatenação de strings
		System.out.println("O resultado de ("+a+" * "+b+") + "+c+" é igual a "+resultado);
		//interpolação de strings
		System.out.printf("O resultado de (%d * %d) + %d é igual a %d",a,b,c,resultado);
	}
}