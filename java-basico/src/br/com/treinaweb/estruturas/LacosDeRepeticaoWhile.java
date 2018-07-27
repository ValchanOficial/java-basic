package br.com.treinaweb.estruturas;

import java.util.Scanner;

public class LacosDeRepeticaoWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int contador = 0;
		String continua = "S";
		while(continua.equals("S") && contador<=4) {
			System.out.printf("Valor do contador: %d%n",contador);
			System.out.print("Você deseja continuar? (S)im ou (N)ão: ");
			continua = leitor.nextLine();
			contador++;
		leitor.close();
		}
	}
}