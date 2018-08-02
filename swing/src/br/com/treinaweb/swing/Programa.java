package br.com.treinaweb.swing;

import javax.swing.JFrame;

public class Programa {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600); //tamanho da janela
		frame.setLocation(300, 100); //posição na tela
		frame.setTitle("Exemplo de Utilização do Swing"); //título da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //comando ao clicar no botão de fechar
		frame.setVisible(true);	//visibilidade da tela	
	}
}