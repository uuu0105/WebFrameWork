<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
		border: none;
	}
	tr{
		align: center;
	}
	#textbox{
		border-radius: 4px;
	}
</style>
</head>
<body>
	<h1><b>Registration Form</b></h1>
	
	<form action="/hw1-helloMVC/doRegister" method="post">
	
		<table border="5" bordercolor="black" width ="400" height="300" >
	    	<tr>
				<td colspan = "2"><b>Enter Information Here</b></td>
	    	</tr>
	    	<tr>
				<td>아이디</td>
				<td><input id="textbox" type="text" name="newCustomerId" style="background-color:aliceblue;"></td>
	    	</tr>
	    	<tr>
				<td>비밀번호</td>
				<td><input id="textbox" type="password" name="newCustomerPwd" style="background-color:aliceblue;"></td>
	    	</tr>
	    	<tr>
				<td>이름</td>
				<td><input id="textbox" type="text" name="newCustomerName"></td>
	    	</tr>
	    	<tr>
				<td>성별</td>
				<td><input type="radio" name="newCustomerGender" value="male"> 남자 <input type="radio" name="newCustomerGender" value="female"> 여자</td>
	    	</tr>
	    	<tr>
				<td>이메일</td>
				<td><input id="textbox" type="text" name="newCustomerEmail"></td>
	    	</tr>
	    	<tr>
				<td></td>
				<td><input type="submit" value="register"></td>
	    	</tr>    	
		</table>
	</form>
</body>
</html>