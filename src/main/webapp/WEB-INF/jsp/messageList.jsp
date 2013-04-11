<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Message List</title>
</head>
<body>
	<c:forEach items="${messages}" var="message">
		<table>
			<tr>
				<td>Author</td>
				<td>${message.author}</td>
			</tr>
			<tr>
				<td>Title</td>
				<td>${message.title}</td>
			</tr>
			<tr>
				<td>body</td>
				<td>${message.body}</td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="messageDelete?messageId=${message.id}">删除</a>
				</td>
			</tr>
		</table>
		<hr/>
	</c:forEach>
	<a href="messagePost">POST</a>
</body>
</html>