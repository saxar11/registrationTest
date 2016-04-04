package ua.sakharevich.db.dao;

import ua.sakharevich.db.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * This Class make users object.
 */
public abstract class UserManage {

    /**
     *This construct create user object.
     * @param connection to data base
     */
    public UserManage(Connection connection) {}
    /**
     * This method create new user in data base.
     * @return pojo user
     * @throws Exception {link java.sql.SQLException}
     */
    public abstract User createUser() throws Exception;

    /**
     * Method return already created obj User.
     * @param key - id of user according to data base
     * @return user
     * @throws Exception {link java.sql.SQLException}
     */
    public abstract User readUser(int key) throws Exception;



    /**
     * Update user information in the data base.
     * @param user not null
     * @return true if user was updated
     * @throws Exception {link java.sql.SQLException}
     */
    public abstract boolean updateUser(User user) throws Exception;

    /**
     * Delete user from database.
     * @param user to delete not null
     * @return true is user was delete, and false otherwise
     * @throws Exception {link java.sql.SQLException}
     */
    public abstract boolean deleteUser(User user) throws Exception;;

    // method return list of all exist users in database

    /**
     * Return list of all users in data base.
     * @return List <User>
     * @throws SQLException {link java.sql.SQLException}
     */
    public abstract List<User> allUsers() throws SQLException;
}
