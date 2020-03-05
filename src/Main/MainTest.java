package Main;

import java.util.ArrayList;
import java.util.List;

import dao.FormationDao;
import dao.IFormationDao;
import dao.ILieuDAO;
import dao.LieuDAO;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public class MainTest {

	public static void main(String[] args) {
//		Formation form = new Formation();
//		Formation form1 = new Formation();
//		form.setTheme("Base de la programmation Java");
//		form1.setTheme("Hibernate ");
		
	IFormationDao dao = new FormationDao();
//		dao.addFormation(form);
//		dao.addFormation(form1);
		
		
		List<Formation> f = new ArrayList<Formation>();
		f = dao.listFormation();
		System.out.println(f);
		
//		FormationDao lien = new FormationDao();
//		List<Formation> tab = new ArrayList<Formation>();
//		tab = lien.getformation();
//		
//		System.out.println(tab);
		
//		Lieu l1 = new Lieu("Montparnasse", "PARIS 14");
//		
	ILieuDAO dao1 = new LieuDAO();
//		
//		dao.addLieu(l1);
		
	List<Lieu> f1 = new ArrayList<Lieu>();
		
		f1=dao1.listeLieux();
		
		System.out.println(f1);
		
		

	}

}
