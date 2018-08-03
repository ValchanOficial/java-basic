package br.com.treinaweb.cadastro.componentes;

import javax.swing.JTable;

public class PessoaJTable extends JTable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4422928614200696506L;
	private PessoaTableModel tabModel;
	
	public PessoaJTable() {
		this.tabModel = new PessoaTableModel();
		setModel(this.tabModel);
	}
}