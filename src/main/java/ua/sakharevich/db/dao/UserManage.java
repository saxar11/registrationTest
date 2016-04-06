package ua.sakharevich.db.dao;

import ua.sakharevich.db.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * This is users maker interface.
 */
public interface UserManage {


    /**
     * This method create new user in data base.
     * @return pojo user
     * @throws Exception {link java.sql.SQLException}
     */
    User createUser() throws Exception;

    /**
     * Method return already created obj User.
     * @param key - id of user according to data base
     * @return user
     * @throws Exception {link java.sql.SQLException}
     */
    User readUser(int key) throws Exception;



    /**
     * Update user information in the data base.
     * @param user not null
     * @return true if user was updated
     * @throws Exception {link java.sql.SQLException}
     */
    boolean updateUser(User user) throws Exception;

    /**
     * Delete user from database.
     * @param user to delete not null
     * @return true is user was delete, and false otherwise
     * @throws Exception {link java.sql.SQLException}
     */
    boolean deleteUser(User user) throws Exception;;

    // method return list of all exist users in database

    /**
     * Return list of all users in data base.
     * @return List <User>
     * @throws SQLException {link java.sql.SQLException}
     */
    List<User> allUsers() throws SQLException;
}
