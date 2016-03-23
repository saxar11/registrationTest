package ua.sakharevich.db.dao;

import ua.sakharevich.db.mysql.MysqlDAOFactory;
import java.sql.SQLException;

/**
 * This is abstract factory that provide Data Access Object (DAO).
 */
public abstract class DAOFactory {

	/**
	 * There will be a mathod for every DAO that can be create.
	 * The concrete factories will have to
	 // implement these methods.
	 * @return object of connection to MySql data base
	 * @throws SQLException {link java.sql.SQLException}
	 */
	public DAOFactory getDaoFactory() throws SQLException {
		return new  MysqlDAOFactory();
	}

	/**
	 * This method create user object and setup it with data according to data base information.
	 * @return pojo user
	 * @throws SQLException {link java.sql.SQLException}
	 */
	public abstract UserDAO getUser() throws SQLException;

}

