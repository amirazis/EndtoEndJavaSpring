<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
<form action="updateLoc" method="post">
Id : <input type="text" name="id" value="${location.id}" />
Code : <input type="text" name="code" value="${location.code} }"/>
Name : <input type="text" name="name" value="${location.name}"/>
Type : Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
	   Urban <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
<input type="submit" value="save"/>
</form>

</body>
</html>