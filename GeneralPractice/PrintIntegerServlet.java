
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PrintIntegerServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res)
					throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		for(int i=1; i<=500; i++)
			out.println(i);
	
		out.close();		
	}	
}