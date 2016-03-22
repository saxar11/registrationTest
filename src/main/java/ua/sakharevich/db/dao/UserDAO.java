package ua.sakharevich.db.dao;

import java.sql.SQLException;
import java.util.List;
import ua.sakharevich.db.pojo.User;

// This is factory to manage obj User
public interface UserDAO {
	//method create new obj User
	public User createUser();
	
	// method return already created obj User  
	public User readUser(int key) throws SQLException;
	
	// method update form of user
	public boolean updateUser(User user);
	
	// method delete user from database
	public boolean deleteUser(User user);
	
	// method return list of all exist users in database
	public List <User> allUsers() throws SQLException;

}
