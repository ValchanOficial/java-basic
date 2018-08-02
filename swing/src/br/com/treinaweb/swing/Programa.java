package br.com.treinaweb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Programa {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(410,100); //tamanho da janela
		frame.setLocation(300, 100); //posição na tela
		frame.setTitle("Exemplo de Utilização do Swing"); //título da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //comando ao clicar no botão de fechar
		JPanel panel = new JPanel();
		//criando componentes
		panel.setLayout(null);
		JLabel label = new JLabel("Texto: ");
		label.setBounds(10,10,60,20);//x,y,tamanho,largura
		panel.add(label);
		JTextField campo = new JTextField();
		campo.setBounds(70,10,200,20);
		panel.add(campo);
		JButton botao = new JButton("Processar");
		botao.setBounds(280,10,100,20);
		panel.add(botao);
		frame.add(panel);	
		frame.setVisible(true);	//visibilidade da tela	
	}
}