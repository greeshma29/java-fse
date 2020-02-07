<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>  <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Manage your profile</h1>
 <hr/>
 <spring:form action="save" method="post" modelAttribute="student">
	<spring:label path="uname">Enter name</spring:label>
	<spring:input path="uname"/>
	<br/>
	<br/>
	<spring:label path="email">Enter email</spring:label>
	<spring:input path="email"/>
	<br/>
	<br/>
	<spring:label path="country">select country</spring:label>
	<spring:select path="country">
	<spring:options items="${student.countries}"/>
	</spring:select>
	<br/>
	<br/>
	<spring:label path="gender">select Gender</spring:label>
	<br/><spring:radiobutton path="gender" value="male"/> MALE
	<br/><spring:radiobutton path="gender" value="female"/> FEMALE
	<br/><spring:radiobutton path="gender" value="others"/> OTHERS
	<br/>
	<br/>
	<spring:label path="hobbies">Select your hobbies</spring:label>
	<br/><spring:checkbox path="hobbies" value="cricket"/> Cricket
	<br/><spring:checkbox path="hobbies" value="volleyball"/> VolleyBall
	<br/><spring:checkbox path="hobbies" value="tennis"/> Tennis
	<br/><spring:checkbox path="hobbies" value="football"/>Football
	<br/>
	<br/>
	
	<input type="submit" value="Submit">
	
</spring:form>
</body>
</html>