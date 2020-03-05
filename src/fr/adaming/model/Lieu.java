package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lieu {
	
	@Id
	@GeneratedValue
	private int idLieu;
	private String adresse;
	private String ville;
	
	
									/****************
									 * CONSTRUCTEURS
									 ***************/
	public Lieu() {
	}

	public Lieu(int idLieu, String adresse, String ville) {
		super();
		this.idLieu = idLieu;
		this.adresse = adresse;
		this.ville = ville;
	}

	public Lieu(String adresse, String ville) {
		super();
		this.adresse = adresse;
		this.ville = ville;
	}

	
								
								
								/******************
								 * GETTER ET SETTER
								 ******************/
								
	public int getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(int idLieu) {
		this.idLieu = idLieu;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Lieu [idLieu=" + idLieu + ", adresse=" + adresse + ", ville=" + ville + "]";
	}
	
	
	
	
	
	
	
}
