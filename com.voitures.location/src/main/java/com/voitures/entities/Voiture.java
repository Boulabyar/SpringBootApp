package com.voitures.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="serie")
	private String serie;
	
	@Column(name="date_Mise_en_Marche")
	private Date dateMiseEnMarche;
	
	@Column(name="modele")
	private String modele;
	
	@OneToMany(mappedBy = "voiture")
	private List<Voiture> location;

	//getters setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Date getDateMiseEnMarche() {
		return dateMiseEnMarche;
	}

	public void setDateMiseEnMarche(Date dateMiseEnMarche) {
		this.dateMiseEnMarche = dateMiseEnMarche;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public List<Voiture> getLocation() {
		return location;
	}

	public void setLocation(List<Voiture> location) {
		this.location = location;
	}

}
