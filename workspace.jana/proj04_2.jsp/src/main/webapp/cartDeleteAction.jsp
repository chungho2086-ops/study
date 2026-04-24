<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String cartId = request.getParameter("cart_id");

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@125.181.132.133:51521:xe", "SCOTT1_14", "tkaenddl@123");

        // [DELETE] 장바구니에서 해당 번호 삭제
        String sql = "DELETE FROM cart WHERE cart_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, cartId);

        pstmt.executeUpdate();
        
        pstmt.close(); conn.close();
        response.sendRedirect("cartList.jsp");
    } catch(Exception e) { out.println("삭제 실패: " + e.getMessage()); }
%>