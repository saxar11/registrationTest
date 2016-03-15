package ua.sakharevich.db.mysql;

import ua.sakharevich.db.dao.DAOFactory;
import ua.sakharevich.db.dao.UserDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDAOFactory extends DAOFactory {


	// settings for connection
	private String user = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/users";
	private String driver = "com.mysql.jdbc.Driver";


	public Connection getConnection() throws SQLException {
		System.out.println("Database connection complited");
		return DriverManager.getConnection(url, user, password);
	}


	public UserDAO getUser() throws SQLException {
		return new MysqlUserDAO(this.getConnection());
	}

	public MysqlDAOFactory() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
