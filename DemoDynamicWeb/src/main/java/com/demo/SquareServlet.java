package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/SquareServlet/")
public class SquareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SquareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int sum=0;
		Cookie cookies[]=request.getCookies();
		int r=0;
		for(Cookie c:cookies) {
			if(c.getName().equals("sum"))
				r=Integer.parseInt(c.getValue());
		}
//	Using redirect or forwarding
//		try {
//		sum=Integer.parseInt(request.getParameter("sum"));
//		}catch (Exception e) {
//			// TODO: handle exception
//			sum=0;
//		}
		
// session storage handling
		HttpSession ses = request.getSession();
		Object s = ses.getAttribute("sum");
		if(s!=null) sum = (int)s;
		out.println("Sq servlet get"+sum*sum+"   Sum:"+sum+"    (Cookie)r="+r);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int n=Integer.parseInt(request.getParameter("num1"));
		int rs = (Integer)request.getAttribute("sum");
		
		out.println("Sq servlet post"+n*n+"   Sum:"+rs);
	}

}
