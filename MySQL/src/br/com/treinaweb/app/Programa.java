package br.com.treinaweb.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.treinaweb.mysql.ConexaoMySql;

public class Programa {

	public static void main(String[] args) {
		
		try {
			Connection connection = ConexaoMySql.conexao();
			System.out.println("A conexão foi criada!");
			
			//INSERT
			PreparedStatement statement = ConexaoMySql.criarPreparedStatement(connection, "INSERT INTO pessoas (nome, idade) VALUES (?, ?)");
			statement.setString(1, "Zé");
			statement.setInt(2, 20);
			statement.execute();
			//SELECT
			ResultSet select = ConexaoMySql.executeSelect(connection, "SELECT * FROM pessoas");
			System.out.println("Pessoas no Banco de Dados: ");
			while(select.next()) { //retorna true enquanto houver linhas
				System.out.println(select.getInt("id"));
				System.out.println(select.getString("nome"));
				System.out.println(select.getInt("idade"));
				System.out.println("====================");		
			}
			System.out.println("Fim da leitura do banco de dados.");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}