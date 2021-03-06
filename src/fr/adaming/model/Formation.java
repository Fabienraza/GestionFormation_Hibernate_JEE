package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue
	private int id;
	private String theme;
	
	@JoinColumn (name="idLieu")
	@ManyToOne
	private Lieu lieu;
	
	
	
	
									/**************
									 * Constructeurs
									 **************/
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(int id, String theme) {
		super();
		this.id = id;
		this.theme = theme;
	}

	
										/******************
										 * Getter et Setter
										 ******************/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
								
	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}



									/*******************
									 * Methode to string
									 *******************/
	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + ", lieu=" + lieu + "]";
	}

	
	
}
