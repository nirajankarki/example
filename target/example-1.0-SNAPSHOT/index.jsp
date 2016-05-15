<%-- 
    Document   : index
    Created on : Apr 28, 2016, 12:24:14 PM
    Author     : Nirajan
--%>

<%@page import="com.leapfrong.example.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        Student s=new Student(0,"nirajan","nirajan@gmail.com","344344",true);
        out.println(s.toString());
        %>
    </body>
</html>
