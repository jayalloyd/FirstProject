

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SqServlet")
public class SqServlet extends HttpServlet {
       
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//        int k=Integer.parseInt(request.getParameter("k"));
//        HttpSession session=request.getSession();
//       int k=(int) session.getAttribute("k");
		int k=0;
	Cookie cookie[]=request.getCookies();// using cookies
	for(Cookie c:cookie) {
		if(c.getName().equals("k")) {
			 k=Integer.parseInt(c.getValue());
		}
		k=k*k;
	

       
	   
           PrintWriter out= response.getWriter();
           out.println("square= "+k);
	}}}

	


