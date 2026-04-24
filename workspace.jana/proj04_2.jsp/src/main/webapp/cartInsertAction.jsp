<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String userId = (String)session.getAttribute("userId");
    if(userId == null) {
        out.println("<script>alert('로그인하세요'); location.href='login.jsp';</script>");
    } else {
        String pid = request.getParameter("productId");
        String count = request.getParameter("productCount");
        System.out.println("장바구니 추가 로그 - 사용자:" + userId + ", 상품:" + pid);
        out.println("<script>alert('담기 완료!'); location.href='productList.jsp';</script>");
    }
%>