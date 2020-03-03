package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDao;
import dao.IFormationDao;
import fr.adaming.model.Formation;


@WebServlet("/ajout")
public class AddFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
    public AddFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/ajout.jsp").forward(request,response);
	}


	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation form = new Formation();
		IFormationDao dao = new FormationDao();
		form.setTheme(request.getParameter("theme"));
		dao.addFormation(form);
		
		this.getServletContext().getRequestDispatcher("/liste").forward(request, response);
	}

}
