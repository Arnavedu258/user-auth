

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/adminreg")
public class adminreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Adminport acces=new AdminportImp();
	
 
    public adminreg() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String Email=request.getParameter("email");
		String AdminId=request.getParameter("Adid");
		Admindetail admins=new Admindetail();
		admins.Setname(username);
		admins.Setemail(Email);
		admins.Setpassword(password);
		admins.SetAdmin(AdminId);
		
		
		 if(username == null || username.trim().isEmpty() ||
		            password == null || password.trim().isEmpty() ||
		            Email == null || Email.trim().isEmpty() ||AdminId == null || AdminId.trim().isEmpty() ) {
		    	
		             response.sendRedirect("adminreg.jsp?error=1");
		             return;
		         }
		if(acces.isvalid(admins)) {
			 System.out.println("DB Status: SUCCESS");
             response.sendRedirect("loginer.jsp");
			
		}
		else {
			response.sendRedirect("adminreg.jsp?error=1");
		}
		
		
		
		
		
		
	}

}
