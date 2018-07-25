package br.com.treinaweb.escopo;

public class EscopoDeVariavel {
	//Variavel de classe
	public static int varEscopo = 2;
	
	public int Somar() {
		//Variavel de método
		int a =2;
		if(Verificar(a,varEscopo)) {
			return a+varEscopo;
		}else {
			//Variavel local
			int c = 5;
			return c;
		}		
	}	
	public boolean Verificar(int a, int b) {//Variavel por parâmetro
		return a>0 && b>0;
	}
}