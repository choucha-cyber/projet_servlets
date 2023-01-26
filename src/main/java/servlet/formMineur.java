package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Mineur;
import repository.MineurRepo;




/**
 * Servlet implementation class formMineur
 */
@WebServlet("/formMineur")
public class formMineur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public formMineur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/visiteur/formMineur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("je suis dans le post du formMineur");

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int annee = Integer.parseInt(request.getParameter("annee"));
		String cookies = request.getParameter("cookie");
		String lait = request.getParameter("lait");
		System.out.println("nom : " +nom+ "\n prenom : "  +prenom+ "annee naissance : " +annee+ "cookies : " +cookies+ "avec " +lait);
		
		//nom, prenom, annee, cookies, lait
		Mineur mineur = new Mineur(nom, prenom, annee, cookies, lait);
		MineurRepo mineurRepo = new MineurRepo();
		mineurRepo.create(mineur);
		
		System.out.println("form validé");
		response.sendRedirect("index");
		
		//verif si champs ni vide ni null -->parse le int date 

//		if ((!nom.equals("") || nom != null) && (!prenom.equals("") || prenom != null)
//				&& (annee != 0) && (!cookies.equals("") || cookies != null)
//				&& (!lait.equals("") || lait != null)) {
//			HttpSession session = request.getSession();
//			//session.setAttribute("visiteur", visiteurRepo.login(email, password));
//			
//			response.sendRedirect("/index");
//		} else {
//			request.getRequestDispatcher("/index.jsp").forward(request, response);
//		}
		
	}

}
