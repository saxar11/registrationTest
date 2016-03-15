package ua.sakharevich.db.dao;

import ua.sakharevich.db.mysql.MysqlDAOFactory;

import java.sql.Connection;
import java.sql.SQLException;

// This is factory to work with database
public abstract class DAOFactory {

	// This method return connection to DB
	public DAOFactory getDaoFactory() throws SQLException {
		return new  MysqlDAOFactory();
	}

	// This method return obj user
	public abstract UserDAO getUser() throws SQLException;

}

