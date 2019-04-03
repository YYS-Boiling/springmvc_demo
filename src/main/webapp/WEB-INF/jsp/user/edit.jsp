<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="user">
		<input type="hidden" name="requestMethod" value="post"/>  
<!-- 	<form:form commandName="user" action="" method="POST"> -->
		<table>
			<tr>
				<td>username:</td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><form:input path="password"/></td>
			</tr>
			<tr>
				<td>nickname:</td>
				<td><form:input path="nickname"/></td>
			</tr>
			<tr>
				<td>email:</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
		</table>
		
<!-- 	</form:form> -->
	</form:form>
</body>
</html>