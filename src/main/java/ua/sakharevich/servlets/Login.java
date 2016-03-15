package ua.sakharevich.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Павел on 11.11.2015.
 */
@WebServlet(name = "Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       String email = request.getParameter("email");
       String pass = request.getParameter("pass");
/**
        try {
            user = userDAO.findUserByEmail(email);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (user != null && user.getPassword() == pass) {
            request.getSession().setAttribute("user", user); // Put user in session.
            response.sendRedirect("/secured/content.html"); // Go to some start page.
        } else {
            request.setAttribute("error", "Unknown login, try again"); // Set error msg for ${error}
            request.getRequestDispatcher("/logIn.jsp").forward(request, response); // Go back to login page.
        }
 **/
    }
}
