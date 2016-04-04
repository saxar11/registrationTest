package ua.sakharevich.db;

import ua.sakharevich.db.dao.DAOFactory;
import ua.sakharevich.db.dao.UserManage;
import ua.sakharevich.db.mysql.MysqlUserManage;
import ua.sakharevich.db.mysql.MysqlDAOFactory;

/**
 * Test Class.
 * @throws Exception of connection to db
 */
public class AppDB {
	public static void main(String[] args) throws Exception {

		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		UserManage user = new MysqlUserManage(daoFactory.getConnection());
		try {
		 user.readUser(2);
 		 System.out.println(user.toString());
		 user.readUser(1);
		 System.out.println(user.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

