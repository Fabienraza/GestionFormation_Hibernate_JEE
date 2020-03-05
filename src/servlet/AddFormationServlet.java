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


@WebServlet("/ajoutformation")
public class AddFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
    public AddFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		List<Lieu> tab = new ArrayList<Lieu>();
		ILieuDAO dao = new LieuDAO();
		tab = dao.listeLieux();
		request.setAttribute("listeLieu", tab);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/ajout.jsp").forward(request,response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation form = new Formation();
		IFormationDao dao = new FormationDao();
		form.setTheme(request.getParameter("theme"));
		Lieu l1 = new Lieu();
			l1.setIdLieu(Integer.parseInt(request.getParameter("lieuFormation")));
		form.setLieu(l1);
		dao.addFormation(form);
		
		this.getServletContext().getRequestDispatcher("/AjoutReussi").forward(request, response);
	}

}
