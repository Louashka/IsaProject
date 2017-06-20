package servlets;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.DAO;
import models.User;

/**
 * Servlet implementation class Registration
 */
@WebServlet(name = "Registration", urlPatterns = "/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/registration.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UUID id = UUID.randomUUID();
		String nickname = request.getParameter("nickname");
		String password = request.getParameter("password");
		String repeat = request.getParameter("repeat");
		String email = request.getParameter("email");
		if(password.equals(repeat)){
			User user=new User(String.valueOf(id), nickname, password, email,0,0);
			//DAO.addUser(user);
			response.sendRedirect("content");
		}
		
	}

}
