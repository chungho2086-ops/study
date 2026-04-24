<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, forward.EmpDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp 목록</title>
<style>
	table {
		border-collapse: collapse;
	}

	th, td {
		border: 1px solid black;
		padding: 5px;
		text-align: center;
	}
</style>
</head>
<body>

	<%
		ArrayList<EmpDTO> empList = (ArrayList<EmpDTO>) request.getAttribute("empList");
	%>

	<table>
		<tr>
			<th>empno</th>
			<th>ename</th>
			<th>job</th>
			<th>mgr</th>
			<th>hiredate</th>
			<th>sal</th>
			<th>comm</th>
			<th>deptno</th>
		</tr>

		<%
			if(empList != null) {
				for(int i = 0; i < empList.size(); i++) {
					EmpDTO dto = empList.get(i);
		%>
		<tr>
			<td><%= dto.getEmpno() %></td>
			<td><%= dto.getEname() %></td>
			<td><%= dto.getJob() %></td>
			<td><%= dto.getMgr() %></td>
			<td><%= dto.getHiredate() %></td>
			<td><%= dto.getSal() %></td>
			<td><%= dto.getComm() %></td>
			<td><%= dto.getDeptno() %></td>
		</tr>
		<%
				}
			}
		%>
	</table>

</body>
</html>