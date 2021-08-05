package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proposition")
public class Proposition implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proposition", nullable = false)
	private int id;
	@Column(name = "date_creation")
	private Date dateCreation;
	@Column(name = "date_annulation")
	private Date dateAnnulation;
	@Column(name = "date_validation")
	private Date dateValidation;
	@Column(name = "date_refus")
	private Date dateRefus;
	@Column(name = "description")
	private String description;
	@Column(name = "date_debut_prestation")
	private Date dateDebutPrestation;
	@Column(name = "date_fin_prestation")
	private Date dateFinPrestation;
	@Column(name = "prix_propose")
	private float prixPropose;
	@Column(name = "type_installation")
	private boolean typeInstallation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_troupeau")
	private Troupeau troupeau;
	
	public Proposition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proposition(int id, Date dateCreation, Date dateAnnulation, Date dateValidation, Date dateRefus,
			String description, Date dateDebutPrestation, Date dateFinPrestation, float prixPropose,
			boolean typeInstallation, Utilisateur utilisateur, Prestation prestation, Troupeau troupeau) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateAnnulation = dateAnnulation;
		this.dateValidation = dateValidation;
		this.dateRefus = dateRefus;
		this.description = description;
		this.dateDebutPrestation = dateDebutPrestation;
		this.dateFinPrestation = dateFinPrestation;
		this.prixPropose = prixPropose;
		this.typeInstallation = typeInstallation;
		this.utilisateur = utilisateur;
		this.prestation = prestation;
		this.troupeau = troupeau;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateAnnulation() {
		return dateAnnulation;
	}

	public void setDateAnnulation(Date dateAnnulation) {
		this.dateAnnulation = dateAnnulation;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	public Date getDateRefus() {
		return dateRefus;
	}

	public void setDateRefus(Date dateRefus) {
		this.dateRefus = dateRefus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebutPrestation() {
		return dateDebutPrestation;
	}

	public void setDateDebutPrestation(Date dateDebutPrestation) {
		this.dateDebutPrestation = dateDebutPrestation;
	}

	public Date getDateFinPrestation() {
		return dateFinPrestation;
	}

	public void setDateFinPrestation(Date dateFinPrestation) {
		this.dateFinPrestation = dateFinPrestation;
	}

	public float getPrixPropose() {
		return prixPropose;
	}

	public void setPrixPropose(float prixPropose) {
		this.prixPropose = prixPropose;
	}

	public boolean isTypeInstallation() {
		return typeInstallation;
	}

	public void setTypeInstallation(boolean typeInstallation) {
		this.typeInstallation = typeInstallation;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	public Troupeau getTroupeau() {
		return troupeau;
	}

	public void setTroupeau(Troupeau troupeau) {
		this.troupeau = troupeau;
	}
	
	
}
