package com.epam.jjp.sjspt;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	private String value;
	private String adminEmail;
	private String pdfFile;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Date oldTime = (Date) session.getAttribute("time");
		request.setAttribute("oldTime", oldTime);
		Date newTime = new Date();
		request.setAttribute("newTime", newTime);
		session.setAttribute("time", newTime);

		Date today = new Date();
		request.setAttribute("time", today);
		request.setAttribute("pdf", pdfFile);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		// PrintWriter writer = response.getWriter();
		// writer.println("<html>");
		// writer.println("<head>");
		// writer.println("  <title>Title</title>");
		// writer.println("</head>");
		// writer.println("<body>");
		// writer.println("  <h1>First Servlet call</h1>");
		// writer.println("  <p>" + today + "</p>");
		// writer.println("<p>" + value + "</p>");
		// writer.println("<p>" + adminEmail + "</p>");
		// writer.println("</body>");
		// writer.println("</html>");
	}

	@Override
	public void init() throws ServletException {
		value = getServletConfig().getInitParameter("NAME");
		adminEmail = getServletContext().getInitParameter("adminEmail");
		// pdfFile = performTask();
	}

	// private String performTask() {
	//
	// String pdfFileName = "eclipse-shortcuts-4.3.0.pdf";
	// String contextPath = getServletContext().getRealPath(File.separator);
	// File pdfFile = new File(contextPath + pdfFileName);
	//
	// FileInputStream fileInputStream = null;
	// try {
	// fileInputStream = new FileInputStream(pdfFile);
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

}
