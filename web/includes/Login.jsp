<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/includes/header.html" />


<title>Login</title>


<h1>Titan Online Banking Application</h1>
<h2>Login with your credentials</h2>

<form action="LoginServlet" method="post">
    <input type="hidden" name="action" value="add">
    <label class="pad_top">Username:</label>
    <input type="text" name="username" required><br>
    <label class="pad_top">Password:</label>
    <input type="password" name="password"><br>

    <input type="submit" value="Login" class="margin-left">
</form>

<div id="nav">
    <br><a href="New_Customer.jsp">Register</a>
    <br><a href="Password_Reset.jsp">Reset Password</a>
</div>

<c:import url="includes/footer.jsp" />

</html>
