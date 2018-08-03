package br.com.treinaweb.cadastro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.treinaweb.cadastro.model.Pessoa;
import br.com.treinaweb.cadastro.utils.DbUtils;

public class PessoaDao implements IAbstractDao<Pessoa> {
	
	@Override
	public List<Pessoa> all() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			con = DbUtils.getConnection();
			ResultSet rs = DbUtils.getResultSet(con, "SELECT * FROM pessoas");
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			while(rs.next()) {
				Pessoa p = new Pessoa();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setIdade(rs.getInt("idade"));
				pessoas.add(p);
			}
			return pessoas;
		}finally{
			if(con!=null) {
				con.close();
			}
		}
	}
	@Override
	public Pessoa findById(int id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			con = DbUtils.getConnection();
			PreparedStatement statement = DbUtils.getPreparedStatement(con, "SELECT * FROM pessoas WHERE id = ?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				Pessoa p = new Pessoa();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setIdade(rs.getInt("idade"));
				return p;
			} else {
				return null;
			}
		}finally {
			if(con!=null) {
				con.close();
			}
		}
	}
	@Override
	public void insert(Pessoa entidade) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			con = DbUtils.getConnection();
			PreparedStatement statement = DbUtils.getPreparedStatement(con, "INSERT INTO pessoas (nome, idade) VALUES(?, ?)");
			statement.setString(1, entidade.getNome());
			statement.setInt(2, entidade.getIdade());
			statement.executeQuery();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
	}
	@Override
	public void update(Pessoa entidade) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			con = DbUtils.getConnection();
			PreparedStatement statement = DbUtils.getPreparedStatement(con, "UPDATE pessoas SET nome = ?,idade = ? WHERE id = ?");
			statement.setString(1, entidade.getNome());
			statement.setInt(2, entidade.getIdade());
			statement.setInt(3, entidade.getId());
			statement.executeQuery();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
	}
	@Override
	public void delete(Pessoa entidade) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			con = DbUtils.getConnection();
			PreparedStatement statement = DbUtils.getPreparedStatement(con, "DELETE FROM pessoas WHERE id = ?");
			statement.setInt(1, entidade.getId());
			statement.executeQuery();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
	}
}