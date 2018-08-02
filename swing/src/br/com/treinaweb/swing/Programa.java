package br.com.treinaweb.swing;

import javax.swing.JFrame;

public class Programa {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600); //tamanho da janela
		frame.setLocation(300, 100); //posi��o na tela
		frame.setTitle("Exemplo de Utiliza��o do Swing"); //t�tulo da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //comando ao clicar no bot�o de fechar
		frame.setVisible(true);	//visibilidade da tela	
	}
}