package dao;

import java.sql.*;
import util.DBConn; 
import dto.MemberDTO;

public class MemberDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // [회원 정보 수정] 메서드
    public int updateMember(MemberDTO dto) {
        int result = 0;
        try {
            conn = DBConn.getConnection();
            String sql = "UPDATE member SET user_pw=?, user_name=?, user_email=? WHERE user_id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, dto.getPw());
            ps.setString(2, dto.getName());
            ps.setString(3, dto.getEmail());
            ps.setString(4, dto.getId());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }

    // [회원 탈퇴] 메서드
    public int deleteMember(String userId) {
        int result = 0;
        try {
            conn = DBConn.getConnection();
            String sql = "DELETE FROM member WHERE user_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userId);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }

    // [로그인 체크] 메서드
    public boolean loginCheck(String id, String pw) {
        boolean isUser = false;
        try {
            conn = DBConn.getConnection();
            String sql = "SELECT * FROM member WHERE user_id = ? AND user_pw = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pw);
            rs = ps.executeQuery();
            if(rs.next()) isUser = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return isUser;
    }

    // [이름 조회] 메서드
    public String getUserName(String userId) {
        String userName = "";
        try {
            conn = DBConn.getConnection();
            String sql = "SELECT user_name FROM member WHERE user_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userId);
            rs = ps.executeQuery();
            if(rs.next()) userName = rs.getString("user_name");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return userName;
    }

    // [자원 해제] 메서드
    private void close() {
        try {
            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} // 클래스 닫는 중괄호 확인 필수!
