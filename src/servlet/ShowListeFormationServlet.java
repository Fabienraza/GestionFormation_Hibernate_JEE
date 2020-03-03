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
import fr.adaming.model.Formation;


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
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/afficheliste.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
