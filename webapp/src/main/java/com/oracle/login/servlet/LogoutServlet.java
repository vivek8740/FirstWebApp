/*******************************************************
 * Class: 			LogoutServlet.java
 * Purpose:			LogoutServlet Servlet 
 * Author:			Vivek Kumar
 *******************************************************/

package com.oracle.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.service.LoginService;


@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginService service = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getSession().invalidate();
		request.getRequestDispatcher("/WEB-INF/views/login/login.jsp").forward(request, response);
	}

}