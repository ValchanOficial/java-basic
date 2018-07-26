package br.com.treinaweb.operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.printf("%d > %d = %b%n", a,b, a>b);
		System.out.printf("%d < %d = %b%n", a,b, a<b);
		System.out.printf("%d <= %d = %b%n", a,b, a<=b);
		System.out.printf("%d => %d = %b%n", a,b, a>=b);
		System.out.printf("%d = %d = %b%n", a,b, a==b);
		System.out.printf("%d <> %d = %b%n", a,b, a!=b);
	}
}