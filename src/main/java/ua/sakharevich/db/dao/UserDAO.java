package ua.sakharevich.db.dao;

import java.sql.SQLException;
import java.util.List;
import ua.sakharevich.db.pojo.User;

/**
 * This is factory to manage user.
 * All DAO's had to implement it.
 */
public interface UserDAO {
	/**
	 * Create new user objact.
	 * @return user
	 */
	User createUser();

	/**
	 * Method return already created obj User.
	 * @param key - id of user according to data base
	 * @return user
	 * @throws SQLException {link java.sql.SQLException}
	 */
	User readUser(int key) throws SQLException;

	/**
	 * Update user information.
	 * @param user not null
	 * @return true if user was updated
	 */
	boolean updateUser(User user);

	/**
	 * Delete inputted user from database.
	 * @param user not null
	 * @return true is user was delete, and false otherwise
	 */
	boolean deleteUser(User user);

	// method return list of all exist users in database

	/**
	 * Return list of all users in data base.
	 * @return List <User>
	 * @throws SQLException {link java.sql.SQLException}
	 */
	List<User> allUsers() throws SQLException;

}
