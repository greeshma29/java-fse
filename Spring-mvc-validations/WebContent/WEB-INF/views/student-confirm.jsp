<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>student data saved successfully</h1>
 <hr/>
<!-- stud.name ~ stud.getUname() -->
<h2>NAME  : ${student.uname}</h2>
<h2>EMAIL : ${student.email}</h2>
<h2>COUNTRY : ${student.country}</h2>
<h2>GENDER : ${student.gender}</h2>
<h2>OPERATING SYSTEMS:</h2>
<ul>
   <core:forEach var="hob" items="${student.hobbies}">
        <li> ${hob}</li>
   </core:forEach>
</ul>
</body>
</html>