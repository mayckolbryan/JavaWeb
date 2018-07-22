package com.mayckol.exampleweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(description = "Clase para administrar Login", urlPatterns = { "/abc123" })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Entro al GET.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//System.out.println("Entro al POST.");
		
		//(1)Establecemos el tipo de respuesta
		response.setContentType("text/html");
		
		//Recuperar los valores
		String username = request.getParameter("username");
		
		if (!username.equals("")) {
			
			//(2)Recuperar el escritor
			PrintWriter escritor = response.getWriter();
			
			//(3)Generar el contenido dinamico
			escritor.println("<h3>Bienbenidos</h3>" + "<br> Sistema Contable <br>");
			escritor.println("<label>Usuario: </label>" + username);
			
			//(4)Cerrar el escritor
			escritor.close();			
		}
		else {
			response.sendRedirect("servletError?codigoError=104");
		}
	}

}
