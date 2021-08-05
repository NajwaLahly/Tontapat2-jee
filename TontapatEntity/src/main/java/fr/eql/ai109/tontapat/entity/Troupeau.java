package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "troupeau")
public class Troupeau implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_troupeau", nullable = false)
	private int id;
	@Column(name = "effectif")
	private int effectif;
	@Column(name = "nom")
	private String nom;
	@Column(name = "description")
	private String description;
	@Column(name = "adresse_voie")
	private String adresseVoie;
	@Column(name = "adresse_long")
	private float adresseLong;
	@Column(name = "adresse_lat")
	private float adresseLat;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "date_disponibilite")
	private Date dateDisponibilite;
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@Column(name = "divisibilite")
	private boolean divisibilite;
	@Column(name = "date_modification")
	private Date dateModification;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_race")
	private Race race;
	@OneToMany(mappedBy = "troupeau", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Offre> offres;
	@OneToMany(mappedBy = "troupeau", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
	@OneToMany(mappedBy = "troupeau", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Proposition> proposition;
	
	public Troupeau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Troupeau(int id, int effectif, String nom, String description, String adresseVoie, float adresseLong,
			float adresseLat, Date dateAjout, Date dateDisponibilite, Date dateRetrait, boolean divisibilite,
			Date dateModification, Utilisateur utilisateur, Race race, Set<Offre> offres, Set<Prestation> prestations,
			Set<Proposition> proposition) {
		super();
		this.id = id;
		this.effectif = effectif;
		this.nom = nom;
		this.description = description;
		this.adresseVoie = adresseVoie;
		this.adresseLong = adresseLong;
		this.adresseLat = adresseLat;
		this.dateAjout = dateAjout;
		this.dateDisponibilite = dateDisponibilite;
		this.dateRetrait = dateRetrait;
		this.divisibilite = divisibilite;
		this.dateModification = dateModification;
		this.utilisateur = utilisateur;
		this.race = race;
		this.offres = offres;
		this.prestations = prestations;
		this.proposition = proposition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEffectif() {
		return effectif;
	}

	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdresseVoie() {
		return adresseVoie;
	}

	public void setAdresseVoie(String adresseVoie) {
		this.adresseVoie = adresseVoie;
	}

	public float getAdresseLong() {
		return adresseLong;
	}

	public void setAdresseLong(float adresseLong) {
		this.adresseLong = adresseLong;
	}

	public float getAdresseLat() {
		return adresseLat;
	}

	public void setAdresseLat(float adresseLat) {
		this.adresseLat = adresseLat;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public Date getDateDisponibilite() {
		return dateDisponibilite;
	}

	public void setDateDisponibilite(Date dateDisponibilite) {
		this.dateDisponibilite = dateDisponibilite;
	}

	public Date getDateRetrait() {
		return dateRetrait;
	}

	public void setDateRetrait(Date dateRetrait) {
		this.dateRetrait = dateRetrait;
	}

	public boolean isDivisibilite() {
		return divisibilite;
	}

	public void setDivisibilite(boolean divisibilite) {
		this.divisibilite = divisibilite;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
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

	public Set<Proposition> getProposition() {
		return proposition;
	}

	public void setProposition(Set<Proposition> proposition) {
		this.proposition = proposition;
	}
	
	
}
