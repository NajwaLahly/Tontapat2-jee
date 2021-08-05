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
@Table(name = "offre")
public class Offre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_offre", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "date_debut")
	private Date dateDebut;
	@Column(name = "date_fin")
	private Date dateFin;
	@Column(name = "description")
	private String description;
	@Column(name = "installation_assuree")
	private boolean installationAssuree;
	@Column(name = "prix_km")
	private float prixKm;
	@Column(name = "prix_installation")
	private float prixInstallation;
	@Column(name = "prix_intervention")
	private float prixIntervention;
	@Column(name = "prix_bete_jour")
	private float prixBeteJour;
	@Column(name = "zone_couverture")
	private int zoneCouverture;
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@Column(name = "frequence_intervention")
	private int frequenceIntervention;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_troupeau")
	private Troupeau troupeau;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_condition_annulation")
	private ConditionAnnulation conditionAnnulation;
	@OneToMany(mappedBy = "offre", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
	
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offre(int id, String nom, Date dateAjout, Date dateDebut, Date dateFin, String description,
			boolean installationAssuree, float prixKm, float prixInstallation, float prixIntervention,
			float prixBeteJour, int zoneCouverture, Date dateRetrait, int frequenceIntervention, Troupeau troupeau,
			ConditionAnnulation conditionAnnulation, Set<Prestation> prestations) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateAjout = dateAjout;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.description = description;
		this.installationAssuree = installationAssuree;
		this.prixKm = prixKm;
		this.prixInstallation = prixInstallation;
		this.prixIntervention = prixIntervention;
		this.prixBeteJour = prixBeteJour;
		this.zoneCouverture = zoneCouverture;
		this.dateRetrait = dateRetrait;
		this.frequenceIntervention = frequenceIntervention;
		this.troupeau = troupeau;
		this.conditionAnnulation = conditionAnnulation;
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

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isInstallationAssuree() {
		return installationAssuree;
	}

	public void setInstallationAssuree(boolean installationAssuree) {
		this.installationAssuree = installationAssuree;
	}

	public float getPrixKm() {
		return prixKm;
	}

	public void setPrixKm(float prixKm) {
		this.prixKm = prixKm;
	}

	public float getPrixInstallation() {
		return prixInstallation;
	}

	public void setPrixInstallation(float prixInstallation) {
		this.prixInstallation = prixInstallation;
	}

	public float getPrixIntervention() {
		return prixIntervention;
	}

	public void setPrixIntervention(float prixIntervention) {
		this.prixIntervention = prixIntervention;
	}

	public float getPrixBeteJour() {
		return prixBeteJour;
	}

	public void setPrixBeteJour(float prixBeteJour) {
		this.prixBeteJour = prixBeteJour;
	}

	public int getZoneCouverture() {
		return zoneCouverture;
	}

	public void setZoneCouverture(int zoneCouverture) {
		this.zoneCouverture = zoneCouverture;
	}

	public Date getDateRetrait() {
		return dateRetrait;
	}

	public void setDateRetrait(Date dateRetrait) {
		this.dateRetrait = dateRetrait;
	}

	public int getFrequenceIntervention() {
		return frequenceIntervention;
	}

	public void setFrequenceIntervention(int frequenceIntervention) {
		this.frequenceIntervention = frequenceIntervention;
	}

	public Troupeau getTroupeau() {
		return troupeau;
	}

	public void setTroupeau(Troupeau troupeau) {
		this.troupeau = troupeau;
	}

	public ConditionAnnulation getConditionAnnulation() {
		return conditionAnnulation;
	}

	public void setConditionAnnulation(ConditionAnnulation conditionAnnulation) {
		this.conditionAnnulation = conditionAnnulation;
	}

	public Set<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}
	
	
	
	
}