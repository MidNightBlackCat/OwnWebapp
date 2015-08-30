import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Test extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        response.sendRedirect("test");
        //Just test
        response.addHeader("Location", "http://www.baidu.com");
        response.setStatus(HttpServletResponse.SC_FOUND);

    }
}
