package br.com.treinaweb.bit;

public class OperadorLogico {
	
	static int LEITURA = 1;
	static int ALTERACAO = 2;
	static int INCLUSAO = 4;
	static int EXCLUSAO = 8;
	
	public static void main(String[] args) {
		int permissoes = 0;
		System.out.println("Permiss�o inicial: "+Integer.toBinaryString(permissoes));
		permissoes = permissoes | LEITURA;
		System.out.println("Permiss�o ap�s leitura: "+Integer.toBinaryString(permissoes));
		permissoes = permissoes | ALTERACAO;
		System.out.println("Permiss�o ap�s altera��o: "+Integer.toBinaryString(permissoes));
		
		if((permissoes & LEITURA) == LEITURA) {
			System.out.println("Tenho permiss�o de leitura");
		}else{
			System.out.println("N�o tenho permiss�o de leitura");
		}		
		if((permissoes & ALTERACAO) == ALTERACAO) {
			System.out.println("Tenho permiss�o de altera��o");
		}else{
			System.out.println("N�o tenho permiss�o de altera��o");
		}		
	}
}