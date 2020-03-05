package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDao;
import dao.IFormationDao;
import dao.ILieuDAO;
import dao.LieuDAO;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;


@WebServlet("/liste")
public class ShowListeFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ShowListeFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Formation> tab = new ArrayList<Formation>();
		IFormationDao dao = new FormationDao();
		tab = dao.listFormation();
		request.setAttribute("listeForm", tab);
		
		List<Lieu> tab1= new ArrayList<Lieu>();
		ILieuDAO dao1 = new LieuDAO();
		tab1 = dao1.listeLieux();
		request.setAttribute("listeLieu", tab1);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/afficheliste.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		List<Lieu> tab= new ArrayList<Lieu>();
		ILieuDAO dao = new LieuDAO();
		tab = dao.listeLieux();
		request.setAttribute("listeLieu", tab);
		
		Lieu l1 = new Lieu();
			l1.setIdLieu(Integer.parseInt(request.getParameter("lieuF")));
		
		List<Formation> tab1 = new ArrayList<Formation>();
		IFormationDao dao1 = new FormationDao();
		tab1 = dao1.findByLocation(l1);
		request.setAttribute("listeForm", tab1);
		

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/afficheliste.jsp").forward(request, response);
	}

}
