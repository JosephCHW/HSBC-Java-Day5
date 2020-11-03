

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimesTable
 */
@WebServlet("/timestable")
public class TimesTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
    public TimesTable() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		for(int i=1;i<=10;i++)
		{
			out.write(2+" x "+i+" = "+(i*2));
			out.write("<br>");
		}
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("T"));
		
		for(int i=1;i<=10;i++)
		{
			out.write(num+" x "+i+" = "+(i*num));
			out.write("<br>");
		}
		out.close();
	}

}
