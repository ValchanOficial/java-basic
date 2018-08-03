package br.com.treinaweb.cadastro.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtils {
	
	public static Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//String de conexão
		String url = "jdbc:mysql://127.0.0.1:3306/banco?useTimezone=true&serverTimezone=UTC";
		String usuario ="root";
		String senha ="valchan";
		Connection connection = DriverManager.getConnection(url,usuario,senha);
		return connection;
	}
	//SELECT
	public static ResultSet executeSelect(Connection con,String sql) throws SQLException {
		Statement query = con.createStatement();
		return query.executeQuery(sql);
	}
	//INSERT, UPDATE, DELETE
	public static PreparedStatement criarPreparedStatement(Connection con,String sql) throws SQLException {
		return con.prepareStatement(sql);
	}
}