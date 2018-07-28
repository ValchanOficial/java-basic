package br.com.treinaweb.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao {

	public static void main(String[] args) {
		try {
			Scanner leitor = new Scanner(System.in);
			System.out.print("Digite o número: ");
			int numero = leitor.nextInt();
			System.out.printf("%d x 2 = %d",numero,numero*2);
			leitor.close();
		}catch(InputMismatchException ex) { //catch executa apenas se ocorrer um erro
			System.out.println("Você digitou um número inválido. Tente novamente.");
		}catch(Exception e){ //outro erro
			System.out.println("A aplicação foi encerrada.");
			System.out.println("Erro: "+e);
			//Mensagem do erro: e.getMessage();
			//Linhas do código onde ocorreram o erro: e.getStackTrace();
			//Causa do erro: e.getCause();
		}finally { //sempre executado
			System.out.println("Obrigada e volte sempre!");
		}
	}
}