<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>替换application属性</title>
</head>
<body>
  <h3>替换application属性</h3>
   <%application.setAttribute("prc"," 中国"); %>
   <%=application.getAttribute("prc") %>
</body>
</html>