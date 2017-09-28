package servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import servlets.User;


public class LoginServlet extends HttpServlet {
    

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String url = "/Login.html";
            HttpSession session = request.getSession(true);
            
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        

        
        User user = (User) session.getAttribute("user");

        if (request.getSession().getAttribute("user") == null) {
            url = "/New_Customer.jsp";
            request.getRequestDispatcher(url).forward(request, response);

        } else if (user.getusername().equals(username)
                && user.getpassword().equals(password)) {
            url = "/Account_Activity.jsp";
            request.getRequestDispatcher(url).forward(request, response);
        } else {
            //forward to login failure
            url = "/Login_Failure.jsp";
            request.getRequestDispatcher(url).forward(request, response);
        }
    }         
         
        
  
  

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
