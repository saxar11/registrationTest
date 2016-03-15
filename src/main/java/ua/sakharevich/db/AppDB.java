package ua.sakharevich.db;

import java.sql.Connection;
import java.sql.SQLException;

import ua.sakharevich.db.dao.DAOFactory;
import ua.sakharevich.db.dao.UserDAO;
import ua.sakharevich.db.mysql.MysqlDAOFactory;

public class AppDB {
	
	public static void main(String args[]) throws SQLException{

		DAOFactory daoFactory = new MysqlDAOFactory();
	 try{

		 UserDAO userdao = daoFactory.getUser();


		 userdao.readUser(2);
		 		 System.out.println(userdao.toString());
		 userdao.readUser(1);
		 System.out.println(userdao.toString());
		
		  } 
	 catch (SQLException e){
		 e.printStackTrace();
	 }

	}
}

