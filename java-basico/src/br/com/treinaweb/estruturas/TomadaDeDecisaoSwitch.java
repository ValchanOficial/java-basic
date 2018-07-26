package br.com.treinaweb.estruturas;

import java.util.Scanner;

public class TomadaDeDecisaoSwitch {

	public static void main(String[] args) {
		// 0 e 3: n�meros baixos
		// 4 e 6: n�meros m�dios
		// acima de 6 ser�o considerados n�meros altos
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = leitor.nextInt();
		switch(numero) {
		case 0:
		case 1:
		case 2:
		case 3:
			System.out.println("Este n�mero � baixo.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Este n�mero � m�dio.");
			break;
		default:
			System.out.println("Este n�mero � alto.");
		}
	}
}