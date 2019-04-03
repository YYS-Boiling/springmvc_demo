<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>------------用户列表----------</h1>
	<a href="toadd/add">添加</a><br/>
	<c:forEach items="${userlist}"  var="user">
<!-- 		${user.key}----${user.value}<br/> -->
<!-- 		${user.value.username}----${user.value.password}----${user.value.nickname}----${user.value.email}<br/><br/> -->
		<!-- rest风格 -->
		<a href="user/${user.value.username}">${user.value.username}</a>----${user.value.password}----${user.value.nickname}----${user.value.email}&nbsp;&nbsp;&nbsp;&nbsp;<a href="${user.value.username}/update">修改</a><br/><br/>
	</c:forEach>
</body>
</html>