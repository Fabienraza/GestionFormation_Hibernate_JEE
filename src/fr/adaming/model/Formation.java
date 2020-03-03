package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue
	private int id;
	private String theme;
	
	
	
		//Constructeur
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(int id, String theme) {
		super();
		this.id = id;
		this.theme = theme;
	}

	
		// Getter et Setter
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
	
	
	

	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + "]";
	}
	
	
}
