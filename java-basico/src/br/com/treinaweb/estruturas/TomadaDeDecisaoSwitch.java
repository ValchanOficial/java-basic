package br.com.treinaweb.estruturas;

import java.util.Scanner;

public class TomadaDeDecisaoSwitch {

	public static void main(String[] args) {
		// 0 e 3: números baixos
		// 4 e 6: números médios
		// acima de 6 serão considerados números altos
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = leitor.nextInt();
		switch(numero) {
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("Este número é baixo.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Este número é médio.");
			break;
		default:
			System.out.println("Este número é alto.");
		}
	}
}