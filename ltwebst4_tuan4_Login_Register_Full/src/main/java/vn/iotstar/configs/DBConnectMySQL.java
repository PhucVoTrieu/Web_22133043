package vn.iotstar.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import vn.iotstar.dao.impl.UserDao;
import vn.iotstar.models.User;

public class DBConnectMySQL {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/doanweb";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "trieuphuc";

	public static Connection getDatabaseConnection() throws ClassNotFoundException {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

	}
}
