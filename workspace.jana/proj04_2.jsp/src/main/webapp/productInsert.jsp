<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>쿠팡 - 관리자 상품 등록</title></head>
<body>
    <h2>상품 등록 페이지 (관리자용)</h2>
    <form action="productInsertAction.jsp" method="post">
        상품 번호: <input type="number" name="productId"><br>
        상품 이름: <input type="text" name="productName"><br>
        상품 가격: <input type="number" name="productPrice"><br>
        상품 설명: <textarea name="productDescription"></textarea><br>
        <input type="submit" value="상품 등록하기">
    </form>
</body>
</html>