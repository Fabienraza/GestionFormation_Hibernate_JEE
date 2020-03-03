package dao;

import java.util.ArrayList;
import fr.adaming.model.Formation;

public interface IFormationDao {
	public int addFormation(Formation f);
	public ArrayList<Formation> listFormation();
}
