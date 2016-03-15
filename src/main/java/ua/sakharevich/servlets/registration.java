package ua.sakharevich.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Павел on 03.08.2015.
 */
@WebServlet("/registration")
public class registration extends HttpServlet {


/**

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        if (request.getParameter("email").equals(null)) {

            System.err.print("no email"); // need to make personal exception
        }
        if (!request.getParameter("repass").equals(request.getParameter("pass")) &&
                request.getParameter("pass") == null){
            System.err.print("no or different passwords!"); // need to make personal exception

        }

        if (request.getParameter("email")!= (null) &&
                request.getParameter("repass").equals(request.getParameter("pass")) &&
                    request.getParameter("pass") != null) {

                try {

                    user = userDAO.findUserByEmail(request.getParameter("email"));
                    System.err.print("this email is already exist"); // need to make personal exception

                }catch (SQLException e){

                    User newUser = new User();
                    newUser.buildUser(0, "user", request.getParameter("nick"), request.getParameter("pass"),
                    request.getParameter("email") );

                    HttpSession session = request.getSession(true);
                    session.setMaxInactiveInterval(3600);
                    request.getSession().setAttribute("user", user); // Put user in session.
                    response.sendRedirect("/secured/content.html"); // Go to some content page.

                }
            }

    }
 **/

}
