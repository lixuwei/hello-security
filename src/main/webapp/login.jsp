<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body>
	<form action="<c:url value="/j_spring_security_check"/>">
		<table>
			<tr>
				<td align="right">UserName</td>
				<td><input type="text" name="j_username"></td>
			</tr>
			<tr>
				<td align="right">Password</td>
				<td><input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td align="right">Remember me</td>
				<td><input type="checkbox" name="_spring_security_remember_me"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Login"/>
					<input type="reset" value="Reset"/>				
				</td>
			</tr>
		</table>
	</form>
</body>
</html>