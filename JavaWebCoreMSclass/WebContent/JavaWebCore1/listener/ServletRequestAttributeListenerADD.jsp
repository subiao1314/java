<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加Request属性页面</title>
</head>
<body>
<h3>增加Request属性</h3>
   <!-- 加一个request属性 -->
<%request.setAttribute("www", "www.baidu.com"); %>
   <!-- 替换为新的request属性 -->
<%request.setAttribute("www", "www.hao123.com"); %>
   


</body>
</html>