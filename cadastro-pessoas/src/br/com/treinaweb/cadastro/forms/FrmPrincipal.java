package br.com.treinaweb.cadastro.forms;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.treinaweb.cadastro.componentes.PessoaJTable;

public class FrmPrincipal extends JFrame{
	
	public FrmPrincipal() {
		this.setSize(600,500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 150);
		this.setTitle("TreinaWeb - Cadastro de pessoas");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//lblId
		JLabel lblId = new JLabel("Id: ");
		lblId.setBounds(10,10,50,20);
		panel.add(lblId);
		
		//txtId
		JTextField txtId = new JTextField("");
		txtId.setBounds(65,10,515,20);
		txtId.setEnabled(false);
		panel.add(txtId);
		
		//lblNome
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10,35,50,20);
		panel.add(lblNome);
		
		//txtNome
		JTextField txtNome = new JTextField("");
		txtNome.setBounds(65,35,515,20);
		panel.add(txtNome);
		
		//lblIdade
		JLabel lblIdade = new JLabel("Idade: ");
		lblIdade.setBounds(10,60,50,20);
		panel.add(lblIdade);
		
		//txtNome
		JTextField txtIdade = new JTextField("");
		txtIdade.setBounds(65,60,515,20);
		txtIdade.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char tecla = e.getKeyChar();
				if(Character.isAlphabetic(tecla)) {
					e.consume();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {				
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		panel.add(txtIdade);
		
		//btnAdicionar
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(65,85,100,20);
		panel.add(btnAdicionar);
		//btnAlterar
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(160,85,100,20);
		panel.add(btnAlterar);
		//btnDeletar
		JButton btnDeletar = new JButton("Alterar");
		btnDeletar.setBounds(265,85,100,20);
		panel.add(btnDeletar);
		
		//tblPessoas
		PessoaJTable tblPessoas = new PessoaJTable();
		tblPessoas.setBounds(20,110,550,280);
		panel.add(tblPessoas);
		
		this.add(panel);
		this.setVisible(true);
	}
}