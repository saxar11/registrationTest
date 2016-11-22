package ua.sakharevich.db.dao;

import ua.sakharevich.db.mysql.MysqlDAOFactory;

import java.sql.Connection;

/**
 * This is abstract factory that provide Data Access Object (DAO).
 */
public abstract class DAOFactory {

	/**
	 * There will be a method for every DAO that can be create.
	 * The concrete factories will have to implement these methods.
	 * @return object of connection to MySql data base
	 * @throws Exception {link java.sql.SQLException}
	 */
	public static DAOFactory getDaoFactory() throws Exception {
		return new  MysqlDAOFactory();
	}

	/**
	 * Connection to db.
	 * @return new connection
	 * @throws Exception {link java.sql.SQLException}
	 */
	public abstract Connection getConnection()throws Exception;
}


