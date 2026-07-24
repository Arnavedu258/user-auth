package datamanager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static USERDATA userdate=new USERDATAimp();

    public login() {
        super();
      
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		if(userdate.isvalidate(username,Password)) {
			HttpSession sess=request.getSession()	;
			sess.setAttribute("user", username);
			
			System.out.println(sess.getAttribute("user"));
			response.sendRedirect("welcome.jsp");
			}
		else {
			response.sendRedirect("loginer.jsp?error="+1);
			
		}
		
		
		
	}

}
