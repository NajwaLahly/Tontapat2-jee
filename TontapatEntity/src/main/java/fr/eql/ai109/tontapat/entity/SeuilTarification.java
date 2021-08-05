package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seuil_tarification")
public class SeuilTarification implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_seuil", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prix_km")
	private float prixKm;
	@Column(name = "prix_bete_jour")
	private float prixBeteJour;
	@Column(name = "coef_intervention")
	private float coefIntervention;
	@Column(name = "coef_installation")
	private float coefInstallation;
	
	public SeuilTarification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeuilTarification(int id, String nom, float prixKm, float prixBeteJour, float coefIntervention,
			float coefInstallation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixKm = prixKm;
		this.prixBeteJour = prixBeteJour;
		this.coefIntervention = coefIntervention;
		this.coefInstallation = coefInstallation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrixKm() {
		return prixKm;
	}

	public void setPrixKm(float prixKm) {
		this.prixKm = prixKm;
	}

	public float getPrixBeteJour() {
		return prixBeteJour;
	}

	public void setPrixBeteJour(float prixBeteJour) {
		this.prixBeteJour = prixBeteJour;
	}

	public float getCoefIntervention() {
		return coefIntervention;
	}

	public void setCoefIntervention(float coefIntervention) {
		this.coefIntervention = coefIntervention;
	}

	public float getCoefInstallation() {
		return coefInstallation;
	}

	public void setCoefInstallation(float coefInstallation) {
		this.coefInstallation = coefInstallation;
	}

	

}