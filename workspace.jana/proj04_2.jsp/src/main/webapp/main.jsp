<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<body>
    <h1>메인 페이지</h1>
<%
    String userName = (String)session.getAttribute("userName");
    if (userName == null) { 
%>
        <button onclick="location.href='login.jsp'">로그인</button>
        <button onclick="location.href='join.jsp'">회원가입</button>
<%
    } else { 
%>
        <p>환영합니다, <b><%= userName %></b>님!</p>
        <button onclick="location.href='logout.jsp'">로그아웃</button>
        <hr>
        <h3>상품 목록</h3>
        <table border="1">
            <tr><th>번호</th><th>상품명</th><th>가격</th></tr>
<%
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
            Connection conn = DriverManager.getConnection(url, "SCOTT1_14", "tkaenddl@123");
            
            String sql = "SELECT p_no, p_name, p_price FROM product";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("p_no") %></td>
                <td><%= rs.getString("p_name") %></td>
                <td><%= rs.getInt("p_price") %>원</td>
            </tr>
<%
            }
            rs.close(); pstmt.close(); conn.close();
        } catch(Exception e) { out.println("조회 오류"); }
%>
        </table>
<% } %>
</body>
</html>