package br.com.treinaweb.mysql;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
 
public class ConexaoMySql {
	
	public static Connection conexao() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//String de conexão
		String url = "jdbc:mysql://127.0.0.1:3306/banco?useTimezone=true&serverTimezone=UTC";
		String usuario ="root";
		String senha ="valchan";
		Connection connection = DriverManager.getConnection(url,usuario,senha);
		return connection;		
	}
}