<%-- 
    Document   : Password_reset
    Created on : Apr 28, 2017, 2:27:33 PM
    Author     : gemeolivia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <h1>Titan Online Banking Application</h1>
        <h2>Reset Your Password</h2>
    </head>
    <body>
            <label>Old Password: </label>
            <span>${user.password}</span><br>
            
            <label>New Password: </label>
            <input type="password" name="password"><br>
            
            <input type="submit" value="Submit" class="margin-left">
        </form>

        <div id="nav">
            
            <br><a href="index.jsp">Home</a>
        </div>
        
           <c:import url="includes/footer.jsp" />
        
    </body>
</html>
