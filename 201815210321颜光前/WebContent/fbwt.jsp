<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>发布问题</title>
<style type="text/css">
	
</style>
</head>

<body>
<%@ include file = "head.jsp" %>
<% 
String userId = (String)request.getSession().getAttribute("userId");
if(userId==null){
	out.print("<script>alert('你还没登录，请先登录')</script>");
	response.setHeader("refresh", "1;url=dl.jsp");
}
%>
	<div>
	<h1>发布问题</h1>
	<form action="" method="post">
	<div>
		标题: <input type="text" name="fname" />
	</div> 
	<div>
		内容：<textarea rows="3" cols="30">
		</textarea>
		    
	</div>
	<input type="submit" value="提交"/>
	</form>
	</div>
<%@ include file = "Footer.jsp" %>
</body>
</html>