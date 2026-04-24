<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지 - 정보 수정</title>
<style>
    .update-container { width: 400px; margin: 50px auto; border: 1px solid #ddd; padding: 20px; }
    .input-group { margin-bottom: 15px; }
    input { width: 100%; padding: 10px; box-sizing: border-box; }
    .btn-update { width: 100%; padding: 12px; background: #0073e6; color: white; border: none; cursor: pointer; }
    .btn-delete { width: 100%; padding: 12px; background: #ff4d4d; color: white; border: none; cursor: pointer; margin-top: 10px; }
</style>
</head>
<body>
    <div class="update-container">
        <h3 style="text-align: center;">내 정보 수정</h3>
        <form action="memberUpdateAction.jsp" method="post">
            <div class="input-group">
                <label>이름</label>
                <input type="text" name="userName" value="홍길동">
            </div>
            <div class="input-group">
                <label>연락처</label>
                <input type="tel" name="userPhone" value="010-1234-5678">
            </div>
            <button type="submit" class="btn-update">수정 완료</button>
        </form>
        
        <hr style="margin: 20px 0;">
        
        <p style="font-size: 12px; color: #666; text-align: center;">더 이상 서비스를 이용하지 않으시나요?</p>
        <button type="button" class="btn-delete" onclick="location.href='memberDelete.jsp'">회원 탈퇴하기</button>
    </div>
</body>
</html>