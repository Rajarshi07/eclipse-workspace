package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;
//	public void service(HttpServletRequest req,HttpServletResponse res) {
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int sum=i+j;
//		System.out.println("Res: 	"+sum);
//		try {
//			PrintWriter resout = res.getWriter();
//			resout.println("Res: "+sum);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		}
//	}
//	public void doGet(HttpServletRequest req,HttpServletResponse res) {
//		System.out.println("GET");
//	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		Integer sum=i+j;
		System.out.println("Res: "+sum);
//		try {
//			PrintWriter resout = res.getWriter();
//			resout.println("Res: "+sum);
//			res.getWriter().append("Res"+sum);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		}
//		
//	forwarding
//		req.setAttribute("sum", sum);
//		RequestDispatcher reqdis = req.getRequestDispatcher("SquareServlet");
//		try {
//			reqdis.forward(req, res);
//		} catch (ServletException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//	url rewriting - redirect
//		try {
//			res.sendRedirect("SquareServlet/?sum="+sum);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		Cookies
		Cookie sumCookie = new Cookie("sum",sum+""); //sum+"" converts to string
		res.addCookie(sumCookie);

//		session storage
			HttpSession ses = req.getSession();
			ses.setAttribute("sum", sum);
			try {
				res.sendRedirect("SquareServlet/");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	


	public AddServlet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
