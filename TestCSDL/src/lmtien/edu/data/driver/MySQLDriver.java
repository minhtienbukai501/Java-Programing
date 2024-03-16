package lmtien.edu.data.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lmtien.edu.vn.utils.Constance;

public class MySQLDriver {
	public static Connection getConection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			return DriverManager.getConnection(Constance.URL, Constance.USER, Constance.PASSWORD);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
