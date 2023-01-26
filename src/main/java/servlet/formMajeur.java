package servlet;

import java.io.IOException;
import java.util.EnumSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Boissons;
import model.Majeur;
import repository.MajeurRepo;


/**
 * Servlet implementation class formMajeur
 */
@WebServlet("/formMajeur")
public class formMajeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formMajeur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/visiteur/formMajeur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("je suis dans le post du formMajeur");
		
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		int annee = Integer.parseInt(request.getParameter("annee"));
		String alcool= request.getParameter("alcool");	
		System.out.println(alcool);
		String vote=request.getParameter("vote");
		System.out.println(vote);
		System.out.println("nom : " +nom+ "prenom : " +prenom+ "anee : " +annee+ "boissons préférés :"+alcool);
			
		//nom, prenom, annee, cookies, lait
				Majeur majeur = new Majeur(nom, prenom, annee, alcool, vote);
				System.out.println(majeur);
				MajeurRepo majeurRepo = new MajeurRepo();
				System.out.println(majeurRepo);
				majeurRepo.create(majeur);
		
		//verif si champs ni vide ni null
//				if ((nom.equals("") || nom != null) && (prenom.equals("") || prenom != null)
//						&& (annee != 0) && (alcool.equals("") || alcool != null)
//						&& (vote.equals("") || vote != null)) {
//					HttpSession session = request.getSession();
//					// session.setAttribute("visiteur", visiteurRepo.login(email, password));
//					response.sendRedirect("/index");
//				} else {
//					request.setAttribute("failed", "failed");
//					request.getRequestDispatcher("/index.jsp").forward(request, response);
//				}
		//System.out.println("form validé");
		response.sendRedirect("index");
	}

}
