package br.com.treinaweb.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesMarcadas {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		try {			
			int numero = LerNumero(leitor);			
			System.out.printf("2 / %d = %d",numero,DividirDoisPeloNumero(numero));
		}catch(InputMismatchException ex) {
			System.out.println("Voc� digitou um n�mero inv�lido. Tente novamente.");
		}catch(Exception e){
			System.out.println("A aplica��o foi encerrada.");
		}finally {
			System.out.println("Obrigada e volte sempre!");
		}
	}
	private static int LerNumero(Scanner leitor) {
		System.out.print("Digite o n�mero: ");
		return leitor.nextInt();
	}
	private static int DividirDoisPeloNumero(int numero) throws ArithmeticException{
		return 2/numero;
	}
}