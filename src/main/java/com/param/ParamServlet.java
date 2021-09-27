package com.param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ParamServlet") //어노테이션
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()" );
	}//init

	
	public void destroy() {
		System.out.println("destroy()");
	}//destroy

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet()");
		
		//데이터
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		//응답
		response.setContentType("text/html;charset=UTF-8"); //응답에게만 한글처리 한거
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("HelloServlet!!!");
		out.println("<p>");
		out.println("Hi Servlet!!!");
		out.println("</p><br><br>");
		
		out.println(name+"님의 나이는"+age+"살 이므로");
		if(age>=19)out.println(" 성인입니다.");
		else out.println("청소년입니다.");
		
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}//doGet

}
