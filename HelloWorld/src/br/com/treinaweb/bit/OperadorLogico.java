package br.com.treinaweb.bit;

public class OperadorLogico {
	
	static int LEITURA = 1;
	static int ALTERACAO = 2;
	static int INCLUSAO = 4;
	static int EXCLUSAO = 8;
	
	public static void main(String[] args) {
		int permissoes = 0;
		System.out.println("Permissão inicial: "+Integer.toBinaryString(permissoes));
		permissoes = permissoes | LEITURA;
		System.out.println("Permissão após leitura: "+Integer.toBinaryString(permissoes));
		permissoes = permissoes | ALTERACAO;
		System.out.println("Permissão após alteração: "+Integer.toBinaryString(permissoes));
		
		if((permissoes & LEITURA) == LEITURA) {
			System.out.println("Tenho permissão de leitura");
		}else{
			System.out.println("Não tenho permissão de leitura");
		}		
		if((permissoes & ALTERACAO) == ALTERACAO) {
			System.out.println("Tenho permissão de alteração");
		}else{
			System.out.println("Não tenho permissão de alteração");
		}		
	}
}