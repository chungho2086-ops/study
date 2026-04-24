<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("userId");
    String pw = request.getParameter("userPw");

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("사용자님주소", "SCOTT1_14", "tkaenddl@123");

        String sql = "SELECT user_name FROM member WHERE user_id = ? AND user_pw = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pw);
        ResultSet rs = pstmt.executeQuery();

        if(rs.next()) {
            session.setAttribute("userName", rs.getString("user_name"));
            response.sendRedirect("main.jsp"); // 성공 시 메인으로
        } else {
            out.println("<script>alert('Fail'); history.back();</script>");
        }
        rs.close(); pstmt.close(); conn.close();
    } catch(Exception e) { e.printStackTrace(); }
%>