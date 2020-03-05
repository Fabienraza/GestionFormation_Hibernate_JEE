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
		
		Lieu l1 = new Lieu();
			l1.setIdLieu(3);
		List<Formation> list = new ArrayList<Formation>();	
		IFormationDao dao = new FormationDao();
		
		list = dao.findByLocation(l1);
		
		System.out.println(list);

	}

}
