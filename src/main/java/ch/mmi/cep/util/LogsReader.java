package ch.mmi.cep.util;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LogsReader extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	String valString;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = new PrintWriter(response.getOutputStream());
		try {
			FileReader dFile = new FileReader("/home/max/servers/tomcat9/logs/catalina.out");
			BufferedReader dataFile = new BufferedReader(dFile);
			valString = dataFile.readLine();
			if (valString != null)
				//System.out.println(" Data is: " + valString);
			dataFile.close();
			RequestDispatcher view = request.getRequestDispatcher("read-logs.jsp");
			view.forward(request, response);
		}
		catch (FileNotFoundException e) {
			System.err.println("FileStreamsTest: " + e);
		}
		out.println("<html>");
		out.println("<head><title>Logs</title>");
		out.println("</head><body>");
		out.println("<b>Catalina Logs: " + valString + "</b><br>");
		out.println("</body></html>");
		out.close();
	}

}