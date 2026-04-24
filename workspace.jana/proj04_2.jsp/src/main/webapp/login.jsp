<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
    <h2>로그인</h2>
    <form action="login_action.jsp" method="post">
        아이디: <input type="text" name="userId"><br>
        비밀번호: <input type="password" name="userPw"><br><br>
        <input type="submit" value="로그인">
        <button type="button" onclick="location.href='join.jsp'">회원가입</button>
    </form>
</body>
</html>