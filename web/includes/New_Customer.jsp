<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/includes/header.html" />
<!DOCTYPE html>
<html>
    <body>
        <h1>Titan Online Banking Application</h1>
        <h2>Register a new account</h2>
        

        <p><i>${message}</i></p>


        <form action="NewCustomerServlet" method="post">
            <input type="hidden" name="action" value="add">
            <label>First Name:</label>
            <input type="text" name="firstName" ><br>
            <label>Last Name:</label>
            <input type="text" name="lastName" ><br>
            <label>Phone #:</label>
            <input type="text" name="phoneNumber" ><br>
            <label>Address:</label>
            <input type="text" name="address" required><br>
            <label>City:</label>
            <input type="text" name="city" required><br>
            <label>State:</label>
            <input type="text" name="state" required><br>
            <label>Zipcode:</label>
            <input type="text" name="zipcode" required><br>
            <label>Email:</label>
            <input type="email" name="email" required><br>

            <input type="submit" value="Submit" class="margin-left">
        </form>

        <div id="nav">

        </div>

        <c:import url="includes/footer.jsp" />
    </body>
</html>
