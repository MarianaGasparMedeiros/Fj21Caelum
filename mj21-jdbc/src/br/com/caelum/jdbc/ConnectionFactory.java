package br.com.caelum.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(null, null)
		}catch() {}
	}

}