package Main;

import java.util.ArrayList;
import java.util.List;

import dao.FormationDao;
import dao.IFormationDao;
import fr.adaming.model.Formation;

public class MainTest {

	public static void main(String[] args) {
//		Formation form = new Formation();
//		Formation form1 = new Formation();
//		form.setTheme("Base de la programmation Java");
//		form1.setTheme("Hibernate ");
		
//		IFormationDao dao = new FormationDao();
//		dao.addFormation(form);
//		dao.addFormation(form1);
		
		
//		ArrayList<Formation> f = new ArrayList<Formation>();
//		f = dao.listFormation();
//		System.out.println(f);
		
		FormationDao lien = new FormationDao();
		List<Formation> tab = new ArrayList<Formation>();
		tab = lien.getformation();
		
		System.out.println(tab);
		
		
		
	}

}
