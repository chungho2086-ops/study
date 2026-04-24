package emp.dao; // 패키지 경로 확인!

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import emp.dto.EmpDTO; // DTO 패키지 경로 확인

public class EmpDAO {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
    String id = "scott1_14";
    String pw = "tiger";

    public ArrayList<EmpDTO> selectEmpList() {
        ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, pw);
            
            // SQL 문장 연결 시 앞뒤 공백을 명시적으로 추가
            String sql = " SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno ";
            sql += " FROM emp ";
            sql += " ORDER BY empno ";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                EmpDTO dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setJob(rs.getString("job"));
                dto.setMgr(rs.getInt("mgr"));
                
                // [수정] rs.getString -> rs.getDate (타입 불일치 해결)
                dto.setHiredate(rs.getDate("hiredate")); 
                
                dto.setSal(rs.getInt("sal"));
                dto.setComm(rs.getInt("comm"));
                dto.setDeptno(rs.getInt("deptno"));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (ps != null) ps.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
        return list;
    }
}