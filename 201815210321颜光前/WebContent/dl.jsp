<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
.dl_div{
  border-radius: 25px;
  background: #73AD21;
  padding: 20px; 
  width: 200px;
  height: 150px; 
}}
</style>
</head>
<body>
<%@ include file = "head.jsp" %>

<div>
<form action="dl" method="post">
   学号<input type="text" name="sno" size="15" /><br>
   姓名<input type="text" name="sname" size="15"/><br>
   <input type="submit" value="登录"/> 
   <a href="zc.jsp">注册</a>
</form>
</div>
<%@ include file = "Footer.jsp" %>
</body>
</html>