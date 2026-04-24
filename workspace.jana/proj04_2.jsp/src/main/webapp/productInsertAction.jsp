<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dao.ProductDAO, dto.ProductDTO" %>
<%
    request.setCharacterEncoding("UTF-8");

    // 1. 파라미터 받기
    int productId = Integer.parseInt(request.getParameter("productId"));
    String productName = request.getParameter("productName");
    int productPrice = Integer.parseInt(request.getParameter("productPrice"));
    String productDescription = request.getParameter("productDescription");

    // 2. DTO 객체 생성
    ProductDTO dto = new ProductDTO();
    dto.setProductId(productId);
    dto.setProductName(productName);
    dto.setProductPrice(productPrice);
    dto.setProductDescription(productDescription);

    // 3. DAO 호출
    ProductDAO dao = new ProductDAO();
    int result = dao.insertProduct(dto);

    if(result > 0) {
        out.println("<script>alert('상품 등록 성공!'); location.href='productList.jsp';</script>");
    } else {
        out.println("<script>alert('등록 실패!'); history.back();</script>");
    }
%>