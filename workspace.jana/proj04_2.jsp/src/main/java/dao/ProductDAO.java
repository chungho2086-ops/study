package dao;

import java.sql.*;
import java.util.ArrayList; 
import dto.ProductDTO;
import util.DBConn;

public class ProductDAO {
    // 1. 공통 변수 (DB 연결용)
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    // 2. 상품 등록 메서드 (productInsertAction.jsp 에러 해결)
    public int insertProduct(ProductDTO dto) {
        int result = 0;
        try {
            conn = DBConn.getConnection();
            String sql = "INSERT INTO product VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dto.getProductId());
            ps.setString(2, dto.getProductName());
            ps.setInt(3, dto.getProductPrice());
            ps.setString(4, dto.getProductDescription());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }

    // 3. 상품 전체 리스트 조회 메서드 (productList.jsp 에러 해결)
    public ArrayList<ProductDTO> selectAllProducts() {
        ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
        try {
            conn = DBConn.getConnection();
            String sql = "SELECT * FROM product ORDER BY productId DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                ProductDTO dto = new ProductDTO();
                dto.setProductId(rs.getInt("productId"));
                dto.setProductName(rs.getString("productName"));
                dto.setProductPrice(rs.getInt("productPrice"));
                dto.setProductDescription(rs.getString("productDescription"));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return list;
    }

    // 4. 상품 상세 정보 조회 메서드 (productDetail.jsp 에러 해결)
    public ProductDTO getProductDetail(int pid) {
        ProductDTO dto = null;
        try {
            conn = DBConn.getConnection();
            String sql = "SELECT * FROM product WHERE productId = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            if(rs.next()) {
                dto = new ProductDTO();
                dto.setProductId(rs.getInt("productId"));
                dto.setProductName(rs.getString("productName"));
                dto.setProductPrice(rs.getInt("productPrice"));
                dto.setProductDescription(rs.getString("productDescription"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return dto;
    }

    // 5. 자원 해제 공통 메서드
    private void close() {
        try {
            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} // 이 중괄호가 클래스의 끝입니다.