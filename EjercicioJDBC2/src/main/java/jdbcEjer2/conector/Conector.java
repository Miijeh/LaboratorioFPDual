package jdbcEjer2.conector;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conector {

	Properties prop = new Properties();
	
	public Conector() {
		try {
			//Cargar archivos de propiedades
			prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getMYSQLConnection() {
		
		try {
			Class.forName(prop.getProperty(MySQLConstants.DRIVER));
			
			return DriverManager.getConnection(getURL());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	public String getURL() {
		return new StringBuilder().append(prop.getProperty(MySQLConstants.PREFIX))
				.append(prop.getProperty(MySQLConstants.HOST)).append(":")
				.append(prop.getProperty(MySQLConstants.PORT)).append("/")
				.append(prop.getProperty(MySQLConstants.SCHEMA)).append("?user=")
				.append(prop.getProperty(MySQLConstants.USER)).append("&password=")
				.append(prop.getProperty(MySQLConstants.PASSWD)).append("&useSSL=")
				.append(prop.getProperty(MySQLConstants.SSL)).toString();
	}
}
