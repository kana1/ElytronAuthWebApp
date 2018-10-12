package lk.inli.elytron;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    private static String PAGE_HEADER = "<html><head><title>servlet-security</title></head><body>";

    private static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	
    	req.logout();
    	resp.sendRedirect(req.getContextPath() + "/logout.jsp");
    }

}
