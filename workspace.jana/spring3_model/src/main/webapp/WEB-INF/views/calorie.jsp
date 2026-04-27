<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>칼로리</title>
</head>
<body>

<h2>칼로리</h2>

<h3>
    현재 칼로리 :
    <span id="calorie">
        <c:choose>
            <c:when test="${empty calorie}">
                0
            </c:when>
            <c:otherwise>
                ${calorie}
            </c:otherwise>
        </c:choose>
    </span>
</h3>

<p id="msg" style="color:red;">
    <c:if test="${calorie > 1000}">
        운동하세요!
    </c:if>
</p>

<hr>

<h3>음식 선택</h3>

<button type="button" onclick="calorieAjax('eat', 100)">아메리카노 (100)</button>
<button type="button" onclick="calorieAjax('eat', 600)">햄버거 (600)</button>
<button type="button" onclick="calorieAjax('eat', 300)">초콜릿 (300)</button>

<h3>운동을 뭘 해볼까용</h3>

<button type="button" onclick="calorieAjax('work', 50)">걷기 (50)</button>
<button type="button" onclick="calorieAjax('work', 150)">달리기 (150)</button>
<button type="button" onclick="calorieAjax('work', 100)">자전거 (100)</button>

<script>
function calorieAjax(type, value) {

    let nowCal = document.getElementById("calorie").innerText;

    fetch("calorieAjax?type=" + type + "&value=" + value + "&nowCal=" + nowCal)
        .then(function(response) {
            return response.json();
        })
        .then(function(data) {

            document.getElementById("calorie").innerText = data.calorie;

            if (data.calorie > 1000) {
                document.getElementById("msg").innerText = "운동하세요!";
            } else {
                document.getElementById("msg").innerText = "";
            }
        });
}
</script>

</body>
</html>