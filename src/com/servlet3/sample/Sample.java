package com.servlet3.sample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet3.to.TOSample;

/**
 * Servlet implementation class Sample
 */

@WebServlet("/Sample")
@WebInitParam(name = "ServletConfigParam", value = "Value1")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Sample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Session Attributes - scoped to session
		HttpSession session = request.getSession();
		TOSample tS = new TOSample("StringParam", 34);
		session.setAttribute("sa", tS);

		// Cookie
		response.addCookie(new Cookie("UserCookie", "CookieValue"));
		
		RequestDispatcher rD = request.getRequestDispatcher("/SampleJSP.jsp");
		request.setAttribute("InitParams", getServletConfig().getInitParameter("ServletConfigParam"));
		rD.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
