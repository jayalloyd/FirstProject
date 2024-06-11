package com.meenuscuisines;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException,NumberFormatException {
        
        int number1=Integer.parseInt(request.getParameter("num1"));
        int number2=Integer.parseInt(request.getParameter("num2"));
        int k=number1+number2;
//		int  k=sum*sum;
//		HttpSession session=request.getSession();//httpsession management -session management
//		session.setAttribute("k", k);
        
        Cookie cookie=new Cookie("k",k+"");
        response.addCookie(cookie);
        
		response.sendRedirect("SqServlet");//URL Redirecting
//		request.setAttribute("k", k);
//		RequestDispatcher rd=request.getRequestDispatcher("/SqServlet");
//		rd.forward(request, response);
//        // Write result to the response
       
    }
}
