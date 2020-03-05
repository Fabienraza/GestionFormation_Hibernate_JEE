package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Lieu;

public class LieuDAO implements ILieuDAO{

	
	SessionFactory sf = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	
	
	
						/********************************************
						 * Methode pour ajouter un lieu de formation
						 ********************************************/
	@Override
	public int addLieu(Lieu L) {
		try {
			Session s = sf.openSession();
			s.beginTransaction();
			s.save(L);
			s.getTransaction().commit();
			return 1;
			}
		catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}

	
	
						/********************************************
						 * Methode pour lister les lieux de formation
						 ********************************************/
	
	
	@Override
	public List<Lieu> listeLieux() {
		try {
			List<Lieu> list = new ArrayList<Lieu>();
			Session s = sf.openSession();
			s.beginTransaction();
			list = s.createQuery("from Lieu").list();
			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
