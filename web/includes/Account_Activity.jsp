<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<c:import url="/includes/header.html" />

<%@ page import="java.sql.*" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>



<h1>Titan Online Banking Application</h1>
<h2>Account Activity</h2>
<c:if test="${sessionScope.user != null}">
    Welcome ${user.firstName} ${user.lastName}.
</c:if>
<c:if test="${sessionScope.user == null}">
    You are not logged in.
</c:if>
