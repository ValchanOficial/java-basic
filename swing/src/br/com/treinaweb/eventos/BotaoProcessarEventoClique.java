package br.com.treinaweb.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoProcessarEventoClique implements ActionListener{
	
	private JTextField textField;
	
	public BotaoProcessarEventoClique(JTextField textField) {
		this.textField = textField;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "Você digitou: " + textField.getText());
	}
}