<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("userId");
    String pw = request.getParameter("userPw");
    String name = request.getParameter("userName");
    String email = "chungho2086@gmail.com"; 

    // 💡 주소를 직접 쓰지 않고 '변수'에 담았습니다. 
    // 이 줄이 있어야 아래 15행의 'url' 빨간 줄과 500 에러가 사라집니다.
    String url = "jdbc:oracle:thin:@localhost:1521:xe"; 

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // 주소 대신 변수명(url)만 사용하여 코드가 깔끔해집니다.
        Connection conn = DriverManager.getConnection(url, "SCOTT1_14", "tkaenddl@123");

        String sql = "INSERT INTO member VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pw);
        pstmt.setString(3, name);
        pstmt.setString(4, email);

        pstmt.executeUpdate();
        pstmt.close(); 
        conn.close();

        // ✅ 가입 성공! 이제 로그인 페이지로 자동 이동합니다.
        response.sendRedirect("login.jsp"); 
    } catch(Exception e) {
        out.println("가입 실패 이유: " + e.getMessage()); 
    }
%>