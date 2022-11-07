import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class helloworld
 */
@WebServlet("/helloworld")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest ,request HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
		PrintWriter Out=response.getWriter();
		Out.print("<html><body>");
		Out.print("<h1>HELLO</h1>");
		Out.print("<h2>How are you?</h2>");
		Out.print("<h3>This is Sri divya darshini </h3>");
		Out.print("</body></html>");
	}
}
