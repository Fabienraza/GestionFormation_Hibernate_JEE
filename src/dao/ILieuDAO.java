package dao;

import java.util.List;

import fr.adaming.model.Lieu;

public interface ILieuDAO {
	public int addLieu(Lieu L);
	public List<Lieu> listeLieux();
}
