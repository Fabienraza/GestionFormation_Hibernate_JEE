package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ILieuDAO;
import dao.LieuDAO;
import fr.adaming.model.Lieu;



@WebServlet("/ajoutlieu")
public class AddLieuFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
    public AddLieuFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/ajoutlieu.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");
		Lieu lieu1 = new Lieu();
			lieu1.setAdresse(adresse);
			lieu1.setVille(ville);
		ILieuDAO dao = new LieuDAO();
		dao.addLieu(lieu1);
		
		this.getServletContext().getRequestDispatcher("/AjoutReussi").forward(request, response);
	}

}
