package br.com.treinaweb.app;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.treinaweb.mysql.ConexaoMySql;

public class Programa {

	public static void main(String[] args) {
		
		try {
			Connection connection = ConexaoMySql.conexao();
			System.out.println("A conexão foi criada!");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}