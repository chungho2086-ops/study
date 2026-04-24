import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);

        int result = num1 + num2;

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><meta charset='UTF-8'><title>결과</title></head>");
        out.println("<body>");
        out.println("<h2>계산 결과</h2>");
        out.println(num1 + " + " + num2 + " = " + result);
        
        out.println("</body>");
        out.println("</html>");
    }
}