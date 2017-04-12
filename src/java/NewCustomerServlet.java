/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author gemeolivia
 */
public class NewCustomerServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String firstName= request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipCode= request.getParameter("zipCode");
            String email = request.getParameter("email");
            String url = null;
            
            String message;
            if (firstName == null || lastName == null || phone == null || address == null || 
                city == null || state == null || zipCode == null || email == null 
                    || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() 
                    || address.isEmpty() || city.isEmpty() || state.isEmpty()
                    || zipCode.isEmpty() || email.isEmpty()) {
               message = "Please fill out all textboxes.";
               url = "/Success.html";
               
            }
                    else {
                            message = "";
                            url = "/New_Customer.html";
                            }
                    request.setAttribute(message, message);
              getServletContext().getRequestDispatcher(url).forward(request, response);

    }
    
            
            
        
        
        
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        
    }

    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

  
    }

