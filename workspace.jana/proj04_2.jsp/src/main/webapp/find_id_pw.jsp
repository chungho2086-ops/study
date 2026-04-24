<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디/비밀번호 찾기</title>
<style>
    * { box-sizing: border-box; margin: 0; padding: 0; font-family: 'Malgun Gothic', sans-serif; }
    body { background-color: #F8F9FA; display: flex; justify-content: center; align-items: center; min-height: 100vh; }
    .container { width: 100%; max-width: 450px; padding: 20px; }
    .logo { text-align: center; color: #0073e6; font-size: 35px; font-weight: bold; margin-bottom: 20px; cursor: pointer; }
    .find-box { background: white; border: 1px solid #ddd; padding: 30px; border-radius: 4px; }
    .tab-menu { display: flex; margin-bottom: 20px; border-bottom: 2px solid #eee; }
    .tab-btn { flex: 1; padding: 15px; border: none; background: none; font-size: 15px; font-weight: bold; color: #888; cursor: pointer; }
    .tab-btn.active { color: #0073e6; border-bottom: 3px solid #0073e6; margin-bottom: -2px; }
    .input-field { width: 100%; padding: 12px; border: 1px solid #ccc; margin-bottom: 10px; font-size: 14px; }
    .btn-submit { width: 100%; padding: 14px; background-color: #0073e6; color: white; border: none; font-weight: bold; cursor: pointer; }
    .footer-links { text-align: center; margin-top: 20px; font-size: 13px; }
    .footer-links a { color: #666; text-decoration: none; margin: 0 10px; }
    #pw-find-form { display: none; }
</style>
<script>
    function showTab(type) {
        if(type === 'id') {
            document.getElementById('id-find-form').style.display = 'block';
            document.getElementById('pw-find-form').style.display = 'none';
            document.getElementById('tab-id').classList.add('active');
            document.getElementById('tab-pw').classList.remove('active');
        } else {
            document.getElementById('id-find-form').style.display = 'none';
            document.getElementById('pw-find-form').style.display = 'block';
            document.getElementById('tab-id').classList.remove('active');
            document.getElementById('tab-pw').classList.add('active');
        }
    }
</script>
</head>
<body>
<div class="container">
    <div class="logo" onclick="location.href='main.jsp'">COUPANG</div>
    <div class="find-box">
        <div class="tab-menu">
            <button id="tab-id" class="tab-btn active" onclick="showTab('id')">아이디 찾기</button>
            <button id="tab-pw" class="tab-btn" onclick="showTab('pw')">비밀번호 찾기</button>
        </div>
        <div id="id-find-form">
            <form action="findIdAction.jsp" method="post">
                <input type="email" name="userEmail" class="input-field" placeholder="가입한 이메일 주소" required>
                <button type="submit" class="btn-submit">아이디 찾기</button>
            </form>
        </div>
        <div id="pw-find-form">
            <form action="findPwAction.jsp" method="post">
                <input type="text" name="userId" class="input-field" placeholder="아이디" required>
                <input type="email" name="userEmail" class="input-field" placeholder="가입한 이메일 주소" required>
                <button type="submit" class="btn-submit">비밀번호 찾기</button>
            </form>
        </div>
    </div>
    <div class="footer-links">
        <a href="login.jsp">로그인으로 돌아가기</a> | <a href="join.jsp">회원가입</a>
    </div>
</div>
</body>
</html>