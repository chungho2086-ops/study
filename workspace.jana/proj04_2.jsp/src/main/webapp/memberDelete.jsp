<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
    <div style="text-align: center; margin-top: 50px;">
        <h2>정말 탈퇴하시겠습니까?</h2>
        <p>탈퇴하시면 모든 정보가 삭제되며 복구할 수 없습니다.</p>
        
        <form action="memberDeleteAction.jsp" method="post">
            <input type="password" name="confirmPw" placeholder="비밀번호 확인" required><br><br>
            <button type="submit" style="background: red; color: white; padding: 10px;">회원 탈퇴 확정</button>
            <button type="button" onclick="history.back()">취소</button>
        </form>
    </div>
</body>
</html>