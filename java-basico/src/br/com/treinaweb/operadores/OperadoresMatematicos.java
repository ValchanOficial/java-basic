package br.com.treinaweb.operadores;

public class OperadoresMatematicos {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		double resultadoDivisao = a / 5.0;
		System.out.printf("%d + %d = %d%n", a,b,a+b);
		System.out.printf("%d - %d = %d%n", a,b,a-b);
		System.out.printf("%d * %d = %d%n", a,b,a*b);
		System.out.printf("%d / %d = %d%n", a,b, a/b); //INTEIRO
		System.out.printf("%d / %d = %f%n", a,b, resultadoDivisao);//DOUBLE
		System.out.printf("%d módulo %d = %d%n", a,b,a%b);
	}
}