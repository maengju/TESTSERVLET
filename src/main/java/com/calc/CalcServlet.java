package com.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int myX = Integer.parseInt(request.getParameter("myX"));
		int myY = Integer.parseInt(request.getParameter("myY"));
		
		
		//응답
		response.setContentType("text/html;charset=UTF-8"); //응답에게만 한글처리 한거
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<script type='text/javascript'>");
		out.println("function back() {window.history.back();}");
		
		out.println("</script>");
		
		
		out.println("</head>");
		out.println("<body>");
		out.println(myX+"+"+myY+"="+(myX+myY));
		out.println("<br>");
		out.println(myX+"-"+myY+"="+(myX-myY));
		out.println("<br>");
		out.println(myX+"*"+myY+"="+(myX*myY));
		out.println("<br>");
		out.println(myX+"/"+myY+"="+((double)myX/myY));
		out.println("<br>");
		out.println("<input type='button' value='back' onclick='back()'>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
