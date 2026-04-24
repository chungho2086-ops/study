<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head><title>상품목록</title></head>
<body>
    <h2>상품 목록</h2>
    <table border="1">
        <tr>
            <th>번호</th><th>상품명</th><th>가격</th>
        </tr>
<%
    // DB 접속 정보
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String dbId = "SCOTT1_14";
    String dbPw = "tkaenddl@123";

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(url, dbId, dbPw);

        // [SELECT] 모든 상품 정보 가져오기
        String sql = "SELECT p_no, p_name, p_price FROM product";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        // 데이터가 있는 만큼 반복(while)해서 행 생성
        while(rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("p_no") %></td>
            <td><%= rs.getString("p_name") %></td>
            <td><%= rs.getInt("p_price") %></td>
        </tr>
<%
        }
        // 자원 닫기
        rs.close(); pstmt.close(); conn.close();
    } catch (Exception e) {
        out.println("데이터 읽기 실패: " + e.getMessage());
    }
%>
    </table>
</body>
</html>