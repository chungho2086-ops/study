<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<h2>회원가입</h2>

<form action="${pageContext.request.contextPath}/joinEmp2" method="post">

	ename:
	<input type="text" name="ename"><br>

	job:
	<input type="text" name="job"><br>

	sal:
	<input type="number" name="sal"><br>

	mgr:
	<input type="number" name="mgr"><br>

	hiredate:
	<input type="date" name="hiredate"><br>

	comm:
	<input type="number" name="comm"><br>

	deptno:
	<input type="number" name="deptno"><br>

	<br>
	<input type="submit" value="회원가입">

</form>

<br>
<a href="${pageContext.request.contextPath}/list">목록으로</a>

</body>
</html>