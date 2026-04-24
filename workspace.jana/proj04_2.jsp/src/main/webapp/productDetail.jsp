<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String pNo = request.getParameter("p_no"); // 목록에서 넘어온 번호

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@125.181.132.133:51521:xe", "SCOTT1_14", "tkaenddl@123");

        // [SELECT] 특정 번호의 상품만 가져옴
        String sql = "SELECT * FROM product WHERE p_no = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, pNo);
        ResultSet rs = pstmt.executeQuery();

        if(rs.next()) {
%>
            <h2>상품 상세 보기</h2>
            <p>상품명: <%= rs.getString("p_name") %></p>
            <p>가격: <%= rs.getInt("p_price") %>원</p>
            <button onclick="location.href='cartInsert.jsp?p_no=<%= pNo %>'">장바구니 담기</button>
<%
        }
        rs.close(); pstmt.close(); conn.close();
    } catch(Exception e) { out.println("조회 실패: " + e.getMessage()); }
%>