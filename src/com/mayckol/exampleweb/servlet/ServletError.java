package com.mayckol.exampleweb.servlet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet implementation class ServletError
 */
@WebServlet(description = "Servelet para configurar errores", urlPatterns = { "/servletError" })
public class ServletError extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ServletError() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("errores del servletError.");
		
		String codigoError = request.getParameter("codigoError");
		if (codigoError.equals("104")) {
			HttpServletRequest requestHttp = (HttpServletRequest)request;
			String empresa = requestHttp.getSession().getAttribute("empresa") + "";
			String baseUrl = getServletContext().getAttribute("baseUrl") + "";
			response.setContentType("text/html");
			response.getWriter().println("Se deben ingresar todos los datos para la empresa: " + empresa + "<br>");
			response.getWriter().println("Contactese con " + baseUrl);
		}
		else {
			request.getRequestDispatcher("./index.html").forward(request, response);
		}
	}

}
