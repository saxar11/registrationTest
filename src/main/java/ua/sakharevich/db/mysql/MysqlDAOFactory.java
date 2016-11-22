package ua.sakharevich.db.mysql;

import ua.sakharevich.db.dao.DAOFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * This is realisation of MySQL DAO.
 * {link ua.sakharevich.db.dao.DAOFactory}
 */
public class MysqlDAOFactory extends DAOFactory {

	/**
	 * Create connection to MySQL data base.
	 * @return connection to data base
	 * @throws Exception {link java.sql.SQLException}
	 */
	public Connection getConnection() throws Exception {

		Properties props = new Properties();
		// this way we obtain db.properties file from resources
		InputStream in;

		try {
			in = getClass().getResourceAsStream("/db.properties");
			if (in == null) {
				throw new IllegalStateException(
						"File must be resides in classpath: db.properties");
			}
			props.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return DriverManager.getConnection(props.getProperty("db.url"),
				props.getProperty("db.user"), props.getProperty("db.password"));
	}

	/**
	 *Obtain reference to the class object with the FQCN (fully qualified class name).
	 */
	public MysqlDAOFactory() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

