<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
<form action="/csrfDemo/demo" method="get">
<input type="text" >
<input type="submit" value="提交">
</form>
<h2>${CSRFToken }</h2>
</body>
</html>
