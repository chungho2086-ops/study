<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    // 세션이나 폼에서 받은 아이디 (여기서는 테스트용 고정값)
    String userId = "SCOTT1_14"; 

    String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
    String dbId = "SCOTT1_14";
    String dbPw = "tkaenddl@123";

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(url, dbId, dbPw);

        // [DELETE] 회원 삭제 쿼리
        String sql = "DELETE FROM member WHERE user_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, userId);

        int result = pstmt.executeUpdate(); // 삭제는 executeUpdate

        if(result > 0) {
            session.invalidate(); // 세션 만료 (로그아웃 처리)
%>
            <script>alert("탈퇴가 완료되었습니다."); location.href="login.jsp";</script>
<%
        }
        pstmt.close(); conn.close();
    } catch (Exception e) {
        out.println("탈퇴 실패: " + e.getMessage());
    }
%>