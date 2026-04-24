<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    request.setCharacterEncoding("UTF-8");
    String id = "SCOTT1_14"; // 보통은 세션에서 가져옴
    String newName = request.getParameter("userName");

    String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(url, "SCOTT1_14", "tkaenddl@123");

        // [UPDATE] 특정 아이디의 이름을 변경함
        String sql = "UPDATE member SET user_name = ? WHERE user_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, newName);
        pstmt.setString(2, id);

        pstmt.executeUpdate();
        
        pstmt.close(); conn.close();
        response.sendRedirect("main.jsp");
    } catch(Exception e) { out.println("수정 실패: " + e.getMessage()); }
%>