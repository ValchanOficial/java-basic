package br.com.treinaweb.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.treinaweb.eventos.BotaoProcessarEventoClique;

public class Programa {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(410,100); //tamanho da janela
		frame.setResizable(false); //tamanho fixo
		frame.setLocation(300, 100); //posi��o na tela
		frame.setTitle("Exemplo de Utiliza��o do Swing"); //t�tulo da janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //comando ao clicar no bot�o de fechar
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
		BotaoProcessarEventoClique evento = new BotaoProcessarEventoClique(campo);
		botao.addActionListener(evento);//vincula bot�o ao evento
		panel.add(botao);
		frame.add(panel);	
		frame.setVisible(true);	//visibilidade da tela	
	}
}