package registry;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static registered reg = new registerimp();
    public register() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
	    if(username == null || username.trim().isEmpty() ||
	            password == null || password.trim().isEmpty() ||
	            email == null || email.trim().isEmpty()) {
	    	
	             response.sendRedirect("register.jsp?error=1");
	             return;
	         }

	         // DATABASE INSERT
	         if(reg.createclass(username, password, email)) {
	        	 System.out.println("DB Status: SUCCESS");
	             response.sendRedirect("loginer.jsp");

	         } else {
	        	    System.out.println("DB Status: FAILED inside createclass method!");
	             response.sendRedirect("register.jsp?error=1");
	         }

	         System.out.println("userdata of " + username);
	         System.out.println("userdata of " + email);
	}

}
