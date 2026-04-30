<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<h2>로그인</h2>

<form action="${pageContext.request.contextPath}/loginCheck" method="post">

    사번:
    <input type="number" name="empno" required><br>

    이름:
    <input type="text" name="ename" required><br>

    <br>
    <input type="submit" value="로그인">

</form>

<br>


<p style="color:red;">
    ${msg}
</p>

<br>

<a href="${pageContext.request.contextPath}/list">목록으로</a>

</body>
</html>