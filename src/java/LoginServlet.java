
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
    

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String url = "/Login.html";
        
        
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if (username.equals ("jsmith@toba.com") && password.equals("letmein")) {
                url = "/Account_Activity.html";
          
            request.getRequestDispatcher(url).forward(request, response);


            }
            else {
                url = "/Login_failure.html";
            }
        
        
             getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
  
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
