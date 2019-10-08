import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author JinLu
 * @date 2019/10/8
 */
public class ServletDemo extends javax.servlet.http.HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Maven Servlet");
        try {
            Connection conn = DriverManager.getConnection("", "","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
