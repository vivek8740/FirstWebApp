package com.oracle.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.service.LoginService;


@WebServlet(urlPatterns = "/welcome.do")
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginService service = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
}