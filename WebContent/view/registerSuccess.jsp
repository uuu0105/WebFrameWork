<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> You registered successfully.</h1>
		<ul>
			<li>id : ${n_customer.id}</li>
			<li>password : ${n_customer.password}</li>
			<li>gender : ${n_customer.gender}</li>
			<li>Name : ${n_customer.name}</li>
			<li>Email : ${n_customer.email}</li>
		</ul>
		<br>
		<a href="/hw1-helloMVC/index.jsp"> go to home page </a>	
</body>
</html>