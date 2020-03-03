package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import fr.adaming.model.Formation;

public class FormationDao implements IFormationDao{
	
	SessionFactory sessionfactory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	
	
	@Override
	public int addFormation(Formation f) {
		try {
			session.beginTransaction();
			session.save(f);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

	@Override
	public ArrayList<Formation> listFormation() {
		ArrayList<Formation> liste = new ArrayList<Formation>();
		
		try {
			session.beginTransaction();
			SQLQuery query = session.createSQLQuery("select * from formation");
			query.addEntity(Formation.class);
			liste = (ArrayList<Formation>) query.list();
			return liste;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/*
	 * AUTRE METHODE PAR UTILISATION LANGAGE HIBERNATE QL POUR L'AFFICHAGE LISTE 
	 */
	
	public List<Formation> getformation() {
		try {
			List<Formation> list = new ArrayList<Formation>();
			session.beginTransaction();
			list = session.createQuery("from Formation").list();
			return list;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
