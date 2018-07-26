package br.com.treinaweb.operadores;

public class OperadoresCondicionais {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		//AND
		System.out.printf("%d == 3 e %d == 5 => %b%n", a,b, a==3 && b==5);
		System.out.printf("%d == 3 e %d == 5 => %b%n", a,b, a==5 && b==5);
		//OR
		System.out.printf("%d == 3 e %d == 5 => %b%n", a,b, a==3 || b==5);
		System.out.printf("%d == 3 e %d == 5 => %b%n", a,b, a==5 || b==5);
		//NOT
		System.out.printf("%d == 3 negado => %b%n", a, !(a==3));
		System.out.printf("%d == 3 negado => %b%n", a, !(false));
	}
}