<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="com.ddb.javaweb.listener.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginUser页面</title>
</head>
<body>
<%
       LoginUser user=new LoginUser("subiao");  //实例化LoginUser对象
      session.setAttribute("info", user);  //在session中保存对象

%>


</body>
</html>