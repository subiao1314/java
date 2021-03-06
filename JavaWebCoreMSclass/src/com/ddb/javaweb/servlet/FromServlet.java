package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FromServlet
 */
@WebServlet("/FromServlet")
public class FromServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FromServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html;charset=UTF-8");	   
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		//用系统时间的总毫秒值，设置三种不同作用域对象的值
		String str=""+new Date().getTime(); //先转化为string类型
		request.setAttribute("fromRequest", str);
		HttpSession session=request.getSession();
        session.setAttribute("fromSession",str);
        ServletContext context=getServletConfig().getServletContext();
        context.setAttribute("fromContext", str);
        context.getRequestDispatcher("/display").forward(request, response);//新增	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
