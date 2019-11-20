package classwork.Server.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String operator = req.getParameter("operator");
        PrintWriter writer = resp.getWriter();
        int result = 0;

        if (Integer.parseInt(y) == 0 && operator == "/") {
         throw new IllegalAccessError("You are trying divide by zero");

        } else {
            switch (operator) {

                case "plus":
                    result = Integer.parseInt(x) + Integer.parseInt(y);
                    break;
                case "-":
                    result = Integer.parseInt(x) - Integer.parseInt(y);
                    break;
                case "/":
                    result = Integer.parseInt(x) / Integer.parseInt(y);
                    break;
                case "*":
                    result = Integer.parseInt(x) * Integer.parseInt(y);
                    break;
                default:
                    throw new IllegalAccessError();
            }
            writer.printf("Operator is %s and result is %d", operator, result);
            writer.close();
        }
    }

}


