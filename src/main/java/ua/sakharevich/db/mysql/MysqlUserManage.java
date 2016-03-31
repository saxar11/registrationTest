package ua.sakharevich.db.mysql;

import ua.sakharevich.db.dao.UserManage;
import ua.sakharevich.db.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/**
 * This class define user creation from MySQL data base.
 */
public class MysqlUserManage extends UserManage {
    private Connection connection;

    /**
     * This construct create user object
     *
     * @param connection to data base
     */
    public MysqlUserManage(Connection connection) {
        super(connection);
    }

    /**
     * This method create new user in data base.
     *
     * @return pojo user
     * @throws SQLException {link java.sql.SQLException}
     */
    @Override
    public User createUser() throws SQLException {
        return null;
    }

    /**
     * Method return already created obj User.
     *
     * @param key - id of user according to data base
     * @return user
     * @throws SQLException {link java.sql.SQLException}
     */
    @Override
    public User readUser(int key) throws SQLException {
        User user = new User();
        //create sql statement
        String sql = "SELECT * FROM users.user WHERE id = ?;";
        PreparedStatement stm = connection.prepareStatement(sql);

        // set key on first "?"
        stm.setInt(1, key);
        ResultSet rs = stm.executeQuery();
        rs.next();

        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setAutoGeneratedLogin(rs.getString("login"));
        user.setAutoGeneratedID(rs.getInt("id"));
        user.setProfile(rs.getString("profile"));

        return user;
    }

    /**
     * Update user information in the data base.
     *
     * @param user not null
     * @return true if user was updated
     */
    @Override
    public boolean updateUser(User user) {
        return false;
    }

    /**
     * Delete user from database.
     *
     * @param user to delete not null
     * @return true is user was delete, and false otherwise
     */
    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    /**
     * Return list of all users in data base.
     *
     * @return List <User>
     * @throws SQLException {link java.sql.SQLException}
     */
    @Override
    public List<User> allUsers() throws SQLException {
        return null;
    }
}
