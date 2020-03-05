package dao;

import java.util.ArrayList;
import java.util.List;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public interface IFormationDao {
	public int addFormation(Formation f);
	public ArrayList<Formation> listFormation();
	public List<Formation>findByLocation(Lieu lieu);
}
