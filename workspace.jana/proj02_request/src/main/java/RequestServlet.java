

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



// /request 요청 처리
@WebServlet("/request")
public class RequestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // JSON 타입 설정
        response.setContentType("application/json;charset=UTF-8");

        PrintWriter out = response.getWriter();

        // JSON 출력
        out.print("{");
        out.print("\"name\":\"송상민\",");
        out.print("\"age\":25");
        out.print("}");
    }
}
