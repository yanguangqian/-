<%@ page language= "java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>

<body>
<%@ include file = "head.jsp" %>
<div>
  <form action="zcsql" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" size="15"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password" size="16"></td>
				
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="注册"></td>
				<td><input type="reset" name="reset" value="重置"></td>
				<td><a href="dl.jsp">登录</a></td>
			</tr>
		</table>
	</form>
</div>
<%@ include file = "Footer.jsp" %>
</body>
</html>