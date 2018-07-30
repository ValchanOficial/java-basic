package br.com.treinaweb.classes;

public class EstudoClasses {

	public static void main(String[] args) {
		//INTEGER
		System.out.println("Valor máximo para um int: "+ Integer.MAX_VALUE);
		System.out.println("Valor mínimo para um int: "+ Integer.MIN_VALUE);
		int a = Integer.parseInt("5");
		System.out.println(Integer.toString(a));
		//DOUBLE
		System.out.println("Valor máximo para um int: "+ Double.MAX_VALUE);
		System.out.println("Valor mínimo para um int: "+ Double.MIN_VALUE);
		double b = Double.parseDouble("5");
		System.out.println(Double.toString(b));
		//CHARACTER
		char c = 't';
		System.out.println(Character.isDigit(c));//se for um número
		System.out.println(Character.isLetter(c));//se for uma letra
		//STRING
		String nome = "TreinaWeb";
		System.out.println(nome.substring(6));//Web
		System.out.println(nome.substring(6,9));//Web
		System.out.println(nome.toUpperCase());//TREINAWEB
		System.out.println(nome.toLowerCase());//treinaweb
	}
}