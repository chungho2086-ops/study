<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp</title>
</head>
<body>

    ${emplist}
    ${empDTO}
    ${empMap}

    <br><br>

    <a href="${pageContext.request.contextPath}/list">
        <button>emp 전체보기</button>
    </a>

    <a href="${pageContext.request.contextPath}/one">
        <button>emp 하나</button>
    </a>

    <a href="${pageContext.request.contextPath}/map">
        <button>emp map</button>
    </a>

</body>
</html>