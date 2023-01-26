package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Majeur;
import model.Mineur;
import repository.MajeurRepo;
import repository.MineurRepo;

/**
 * Servlet implementation class admin
 */
@WebServlet("/homeAdmin")
public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		if (request.getParameter("error") != null) {
//			System.out.println("erreur d'affichage param");
//		}else {
			MajeurRepo majRepo=new MajeurRepo();	
			List<Majeur> majeurs=majRepo.read();
			request.setAttribute("majeurs", majeurs);
			
			MineurRepo minRepo = new MineurRepo();
			List<Mineur> mineurs = minRepo.read();
			request.setAttribute("mineurs", mineurs);
			//HttpSession session = request.getSession();
			request.getRequestDispatcher("/WEB-INF/visiteur/homeAdmin.jsp").forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//ici, si on souhaite supprimer ou ajouter/modifier des profils visiteurs
		// response.sendRedirect("admin/homeAdmin");
	}

}
