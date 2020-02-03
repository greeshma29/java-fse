<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1> Congratulations you've logged in</h1>
   <h2> hello: <%
     String usname = request.getParameter("name");
   %>
    <%= usname %>
   </h2>
   <% 
    for(int i=1;i<=5;i++){
    %>
    <input type="text" id= "text<%=i%>"/>
    <% } %>
</body>
</html>