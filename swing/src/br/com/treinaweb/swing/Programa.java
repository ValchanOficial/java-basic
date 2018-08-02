package br.com.treinaweb.swing;

import javax.swing.JFrame;

public class Programa {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setLocation(300, 100);
		frame.setTitle("Exemplo de Utilização do Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
}