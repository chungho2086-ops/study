<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>
	<tiles:insertAttribute name="title" />
</title>
<style>
	div {
		border: 1px solid red;
	}
	.wrapper{
		display: flex;
	}
	.wrapper .aside{
		flex-grow: 2;
	}
	.wrapper .content{
		flex-grow: 8;
	}
</style>
<script>
	window.onload = function() {
		alert(1)
	}
	window.addEventListener('load',function(){
		alert(11)		
	})
		
</script>
</head>
<body>

<%-- <%@ import %> --%>
<%--<jsp:include page=""> --%>

<header>
	헤더
	<tiles:insertAttribute name="header" />
	<nav>메뉴1, 메뉴2</nav>
</header>

<!-- main START -->
<section class="wrapper">
	<!-- adide -->
	<aside class="side">
	aside
	<tiles:insertAttribute name="side" />
	</aside>
	<article calss="content">
		article
		<tiles:insertAttribute name="content" />
	</article>
</section>

<footer>
	footer
	<tiles:insertAttribute name="footer" />
</footer>

</body>
</html>