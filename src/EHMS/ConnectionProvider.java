package EHMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("----- Driver Problem: " + e + " -----");
		}
	}

	public static Connection getCon() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/ehms";

		String uname = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, uname, pass);
		return con;

	}

}
