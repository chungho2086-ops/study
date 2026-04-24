package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
    // 1. 연결 객체를 보관할 변수
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            // 2. 오라클 드라이버 로딩 (Class.forName 부분 오타 확인 필수!)
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // 3. 사용자님 계정 정보 (SCOTT1_14)
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String id = "SCOTT1_14";
            String pw = "tkaenddl@123";
            
            // 4. DriverManager를 통해 연결 시도
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("DB 연결 성공!"); 
            
        } catch (Exception e) {
            // 에러가 나면 콘솔에 이유를 찍어줌
            System.out.println("DB 연결 실패 : " + e.getMessage());
            e.printStackTrace();
        }
        return conn; // 연결된 객체 반환
    }
}