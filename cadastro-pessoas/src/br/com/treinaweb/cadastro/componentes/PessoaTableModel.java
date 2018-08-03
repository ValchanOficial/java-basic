package br.com.treinaweb.cadastro.componentes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.com.treinaweb.cadastro.model.Pessoa;

public class PessoaTableModel extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6019805208505561374L;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private String[] columnNames = {"Id", "Nome", "Idade"};
	private Class<?>[] columnTypes = {Integer.class,String.class,Integer.class};
	
	public void load(List<Pessoa>pessoas) {
		this.pessoas = pessoas;
		fireTableDataChanged();
	}
	
	public Pessoa getPessoaAt(int index) {
		if(this.pessoas.size()<=0) {
			return null;
		}
		return this.pessoas.get(index);
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public int getRowCount() {
		return this.pessoas.size();
	}
	@Override
	public Object getValueAt(int arg0, int arg1) {//linha,coluna
		if(this.pessoas.size()<=0) {
			return null;
		}
		Pessoa p = this.pessoas.get(arg0);
		switch(arg1) {
		case 0:
			return p.getId();
		case 1:
			return p.getNome();
		case 2:
			return p.getIdade();
		}
		return null;
	}
}