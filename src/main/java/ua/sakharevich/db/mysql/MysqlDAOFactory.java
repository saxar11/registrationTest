package ua.sakharevich.db.mysql;

import ua.sakharevich.db.dao.DAOFactory;
import ua.sakharevich.db.dao.UserDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is realisation of MySQL DAO.
 * {link ua.sakharevich.db.dao.DAOFactory}
 */
public class MysqlDAOFactory extends DAOFactory {


	// settings for connection
	private String user = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/users";
	private String driver = "com.mysql.jdbc.Driver";

	/**
	 * Create connection to MySQL data base.
	 * @return connection to data base
	 * @throws SQLException {link java.sql.SQLException}
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	/**
	 * Method return user.
	 * @return  user of MySQL data base
	 * @throws SQLException {link java.sql.SQLException}
	 */
	public UserDAO getUser() throws SQLException {
		return new MysqlUserDAO(this.getConnection());
	}

	/**
	 *Obtain reference to the class object with the FQCN (fully qualified class name).
	 */
	public MysqlDAOFactory() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

