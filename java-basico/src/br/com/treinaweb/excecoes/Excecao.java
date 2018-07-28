package br.com.treinaweb.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {

	public static void main(String[] args) {
		try {
			Scanner leitor = new Scanner(System.in);
			System.out.print("Digite o n�mero: ");
			int numero = leitor.nextInt();
			System.out.printf("%d x 2 = %d",numero,numero*2);
			leitor.close();
		}catch(InputMismatchException ex) { //catch executa apenas se ocorrer um erro
			System.out.println("Voc� digitou um n�mero inv�lido. Tente novamente.");
		}catch(Exception e){ //outro erro
			System.out.println("A aplica��o foi encerrada.");
			System.out.println("Erro: "+e);
			//Mensagem do erro: e.getMessage();
			//Linhas do c�digo onde ocorreram o erro: e.getStackTrace();
			//Causa do erro: e.getCause();
		}finally { //sempre executado
			System.out.println("Obrigada e volte sempre!");
		}
	}
}