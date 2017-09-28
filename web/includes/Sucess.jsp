<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
<h1>Titan Online Banking Application</h1>

<div>
    Your account has been created successfully!

    Check to make sure the information that you entered is correct below:
</div
    </head>
<label>First Name: </label>
<span>${user.firstName}</span><br>
<label>Last Name: </label>
<span>${user.lastName}</span><br>
<label>Phone Number: </label>
<span>${user.phoneNumber}</span><br>
<label>Address: </label>
<span>${user.address}</span><br>
<label>City: </label>
<span>${user.city}</span><br>
<label>State: </label>
<span>${user.state}</span><br>
<label>Zip code:</label>
<span>${user.zipcode}</span><br>
<label>Email: </label>
<span>${user.email}</span><br>
<label>Username: </label>
<span>${user.username}</span><br>
<label>Password: </label>
<span>${user.password}</span><br>
        
        
        
    
<div id="nav">
    <br><a href="index.jsp">Home</a> 
    <br><a href="Account_Activity.jsp">Account Activity</a> 
</div>

<c:import url="includes/footer.jsp" />
