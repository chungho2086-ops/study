<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
</head>
<body>
    <h1>🛒 내 장바구니</h1>
    <table border="1" style="width: 100%; text-align: center;">
        <tr>
            <th>상품명</th>
            <th>가격</th>
            <th>수량</th>
            <th>삭제</th>
        </tr>
        <tr>
            <td>멋진 티셔츠</td>
            <td>15,000원</td>
            <td>1개</td>
            <td><button onclick="location.href='cartDeleteAction.jsp'">삭제</button></td>
        </tr>
    </table>
    <br>
    <button onclick="location.href='productList.jsp'">쇼핑 계속하기</button>
    <button style="background: #0073e6; color: white;">주문하기</button>
</body>
</html>