<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
    <h2>회원가입</h2>
    <form action="join_action.jsp" method="post">
        아이디: <input type="text" name="userId"><br>
        비밀번호: <input type="password" name="userPw"><br>
        이름: <input type="text" name="userName"><br>
        이메일: <input type="text" name="userEmail"><br><br>
        <input type="submit" value="가입하기">
    </form>
</body>
</html>