<%@ page language= "java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	.div-inline{border:1px solid #000;width:800px;height:80px;}
</style>
</head>
<body>
	<%@ include file = "head.jsp" %>
	<div class="div-inline">
		标题: <input type="text" name="fname" /><br>
	  <img src="1.jpg"  alt="图片" />
	  内容:<input type="text" name="fname" />
	</div>
	<div class="div-inline">
		标题: <input type="text" name="fname" /><br>
	  <img src="1.jpg"  alt="图片" />
	  内容:<input type="text" name="fname" />
	</div>
	<div class="div-inline">
		标题: <input type="text" name="fname" /><br>
	  <img src="1.jpg"  alt="图片" />
	  内容:<input type="text" name="fname" />
	</div>
	<%@ include file = "Footer.jsp" %>
</body>
</html>