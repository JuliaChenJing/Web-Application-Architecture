package lab1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logon")
public class LogonServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form method='post'>");
		out.println("Username=<input type=text name=username> <br>");
		out.println("Password=<input type=text name=password>");
		out.println("<input type=submit value='Logon'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		System.out.print(sess.getAttribute("username"));//null
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Test</title></head><body>");
		out.print("<p>Wrong user id or password! Please try again </p>");
		out.print("<h1>Basic Get Post Demo</h1>");
		out.print("<a href='GuessNumber'> Start the Guess Number app</a>");
		out.print("</body></html>");
	}
}
