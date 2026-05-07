<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp</title>
</head>

<body>

<a href="http://localhost:8080/human4/join.do">가입</a>

<hr>

<select id="type">
	<option value="ename">ename</option>
	<option value="sal">sal</option>
	<option value="job">job</option>
</select>

<input type="text" id="keyword">

<input type="button" value="검색" onclick="searchAjax()">

<hr>

<input type="button" value="emp 전체보기" onclick="listAjax()">

<table border="1">

	<thead>

		<tr>
			<th>선택</th>
			<th>empno</th>
			<th>ename</th>
			<th>job</th>
			<th>mgr</th>
			<th>hiredate</th>
			<th>sal</th>
			<th>comm</th>
			<th>deptno</th>
			<th>삭제</th>
		</tr>

	</thead>

	<tbody>

	</tbody>

</table>


<script>

	function drawTable(data) {

		const tbody = document.querySelector("tbody");

		tbody.replaceChildren();

		for(let i = 0; i < data.length; i++) {

			const tr = document.createElement("tr");


			let td = document.createElement("td");

			const chk = document.createElement("input");

			chk.type = "checkbox";

			chk.name = "empnos";

			chk.value = data[i].empno;

			td.appendChild(chk);

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].empno;

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].ename;

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].job;

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].mgr;

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].hiredate;

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].sal;

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].comm;

			tr.appendChild(td);


			td = document.createElement("td");

			td.innerText = data[i].deptno;

			tr.appendChild(td);


			td = document.createElement("td");

			const btn = document.createElement("button");

			btn.type = "button";

			btn.innerText = "삭제";

			btn.onclick = function() {

				location.href = "delete?empno=" + data[i].empno;
			}

			td.appendChild(btn);

			tr.appendChild(td);


			tbody.appendChild(tr);
		}
	}



	function listAjax() {

		const xhr = new XMLHttpRequest();

		xhr.open("get", "/human4/listAjax");

		xhr.send();

		xhr.onreadystatechange = function() {

			if(xhr.readyState == 4
					&& xhr.status == 200) {

				const data =
					JSON.parse(xhr.responseText);

				drawTable(data);
			}
		}
	}



	function searchAjax() {

		const type =
			document.querySelector("#type").value;

		const keyword =
			document.querySelector("#keyword").value;


		const xhr = new XMLHttpRequest();

		xhr.open(
			"get",
			"/human4/searchAjax?type="
			+ type
			+ "&keyword="
			+ keyword
		);

		xhr.send();


		xhr.onreadystatechange = function() {

			if(xhr.readyState == 4
					&& xhr.status == 200) {

				const data =
					JSON.parse(xhr.responseText);

				drawTable(data);
			}
		}
	}

</script>

</body>
</html>