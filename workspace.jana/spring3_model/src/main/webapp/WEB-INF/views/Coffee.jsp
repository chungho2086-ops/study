<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커피 주문</title>

<script>
function addMenu() {

    let menu = document.getElementById("menu").value;
    let price = document.getElementById("price").value;

    if(menu == "") {
        alert("메뉴를 입력하세요");
        return;
    }

    if(price == "") {
        alert("가격을 입력하세요");
        return;
    }

    let select = document.getElementById("type");

    let option = document.createElement("option");

   
    option.value = menu + ":" + price;

  
    option.text = menu;

    select.appendChild(option);

    document.getElementById("menu").value = "";
    document.getElementById("price").value = "";
}
</script>

</head>
<body>

<h2>커피 주문</h2>

추가할 메뉴 :
<input type="text" id="menu">

가격 :
<input type="number" id="price">

<button type="button" onclick="addMenu()">메뉴 추가</button>

<br><br>

<form action="order" method="get">

    메뉴 선택 :
    <select name="type" id="type">
        <option value="아아:3500">아아</option>
        <option value="얼박사:3600">얼박사</option>
    </select>

    수량 :
    <input type="number" name="count" value="1">

    <button type="submit">주문</button>

</form>

<hr>

<p>메뉴 : ${type}</p>
<p>수량 : ${count}</p>
<p>총 금액 : ${total}</p>

</body>
</html>