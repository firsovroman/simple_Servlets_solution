import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("init() сработал!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("сработал гет");

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");


        PrintWriter pw = resp.getWriter();

        pw.println("<html>");
        pw.println("<h1></h1>");
        pw.println("<h1>Hello my friend "+ name +" " + surname +"</h1>");

        pw.println("</html>");


        resp.sendRedirect("https://www.vk.com");

    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy() Сработал!");
    }
}
