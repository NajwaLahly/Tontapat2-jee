package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "condition_annulation")
public class ConditionAnnulation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_condition_annulation", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "delai_jours")
	private int delaiJours;
	@Column(name = "pourcentage_facturation")
	private float pourcentageFacturation;
	@OneToMany(mappedBy = "conditionAnnulation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Offre> offres;
	@OneToMany(mappedBy = "conditionAnnulation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
	
	public ConditionAnnulation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConditionAnnulation(int id, String nom, int delaiJours, float pourcentageFacturation, Set<Offre> offres,
			Set<Prestation> prestations) {
		super();
		this.id = id;
		this.nom = nom;
		this.delaiJours = delaiJours;
		this.pourcentageFacturation = pourcentageFacturation;
		this.offres = offres;
		this.prestations = prestations;
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

	public int getDelaiJours() {
		return delaiJours;
	}

	public void setDelaiJours(int delaiJours) {
		this.delaiJours = delaiJours;
	}

	public float getPourcentageFacturation() {
		return pourcentageFacturation;
	}

	public void setPourcentageFacturation(float pourcentageFacturation) {
		this.pourcentageFacturation = pourcentageFacturation;
	}

	public Set<Offre> getOffres() {
		return offres;
	}

	public void setOffres(Set<Offre> offres) {
		this.offres = offres;
	}

	public Set<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}
	
	
	
}
