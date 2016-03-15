package ua.sakharevich.filters;

        import javax.servlet.*;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

/**
 * Created by Павел on 17.11.2015.
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {

        if (((HttpServletRequest) request).getSession().getAttribute("user") != null) {
            //   chain.doFilter(request, response); // User is logged in, just continue request.
        } else {
            ((HttpServletResponse) response).sendRedirect("/login.jsp"); // Not logged in, show login page. You can eventually show the error page instead.
        }
    }

    @Override
    public void destroy() {

    }
}

