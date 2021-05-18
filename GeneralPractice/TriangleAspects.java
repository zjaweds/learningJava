import java.io.*;
import java.servlet.*;
import java.servlet.Http.*;
import java.lang.Math.*;

public class TriangleAspects extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res)
					throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		int a= Integer.parseInt(res.getParameter("a"));
		int b= Integer.parseInt(res.getParameter("b"));
		int c= Integer.parseInt(res.getParameter("c"));
        double s= a+b+c;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double perimeter= a+b+c;
        Out.println("Perimeter: "+perimeter);
        Out.println("Area: " +area);
		out.close();		
	}	
}