package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prestation")
public class Prestation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestation", nullable = false)
	private int id;
	@Column(name = "date_reservation")
	private Date dateReservation;
	@Column(name = "date_validation")
	private Date dateValidation;
	@Column(name = "num_reservation")
	private String numReservation;
	@Column(name = "date_refus")
	private Date dateRefus;
	@Column(name = "date_annulation")
	private Date dateAnnulation;
	@Column(name = "description_annulation")
	private String descriptionAnnulation;
	@Column(name = "nombre_betes")
	private int nombreBetes;
	public int getNombreBetes() {
		return nombreBetes;
	}



	public void setNombreBetes(int nombreBetes) {
		this.nombreBetes = nombreBetes;
	}

	@Column(name = "frais_installation")
	private float fraisInstallation;
	@Column(name = "frais_intervention")
	private float fraisIntervention;
	@Column(name = "frais_betail")
	private float fraisBetail;
	@Column(name = "frais_service")
	private float fraisService;
	@Column(name = "tva")
	private float TVA;
	@Column(name = "prix_total")
	private float prixTotal;
	@Column(name = "statut")
	private Integer statut;
	@Column(name = "date_debut")
	private Date dateDebut;
	@Column(name = "date_fin")
	private Date dateFin;
	@Column(name = "type_installation")
	private boolean typeInstallation;
	@Column(name = "date_debut_installation")
	private Date dateDebutInstallation;
	@Column(name = "date_fin_installation")
	private Date dateFinInstallation;
	@Column(name = "date_apport_troupeau")
	private Date dateApportTroupeau;
	@Column(name = "date_recuperation_troupeau")
	private Date dateRecuperationTroupeau;
	@Column(name = "date_debut_desinstallation")
	private Date dateDebutDesinstallation;
	@Column(name = "date_fin_desinstallation")
	private Date dateFinDesinstallation;
	@Column(name = "frequence_intervention")
	private int frequenceIntervention;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_terrain")
	private Terrain terrain;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_troupeau")
	private Troupeau troupeau;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_offre")
	private Offre offre;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_annonce", referencedColumnName = "id_annonce")
	private Annonce annonce;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_refus")
	private MotifRefusReservation motifRefusReservation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_annulation")
	private MotifAnnulation motifAnnulation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_condition_annulation")
	private ConditionAnnulation conditionAnnulation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_reclamation")
	private MotifReclamation motifReclamation;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Proposition> propositions;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Reclamation> reclamations;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Intervention> interventions;
	@OneToMany(mappedBy = "prestation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Evaluation> evaluations;
	
	public Prestation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Prestation(int id, Date dateReservation, Date dateValidation, String numReservation, Date dateRefus,
			Date dateAnnulation, String descriptionAnnulation, float fraisInstallation, float fraisIntervention,
			float fraisBetail, float fraisService, float tVA, float prixTotal, Date dateDebut, Date dateFin,
			boolean typeInstallation, Date dateDebutInstallation, Date dateFinInstallation, Date dateApportTroupeau,
			Date dateRecuperationTroupeau, Date dateDebutDesinstallation, Date dateFinDesinstallation,
			int frequenceIntervention, Terrain terrain, Troupeau troupeau, Offre offre, Annonce annonce,
			MotifRefusReservation motifRefusReservation, MotifAnnulation motifAnnulation,
			ConditionAnnulation conditionAnnulation, MotifReclamation motifReclamation, List<Proposition> propositions,
			List<Reclamation> reclamations, List<Intervention> interventions, List<Evaluation> evaluations) {
		super();
		this.id = id;
		this.dateReservation = dateReservation;
		this.dateValidation = dateValidation;
		this.numReservation = numReservation;
		this.dateRefus = dateRefus;
		this.dateAnnulation = dateAnnulation;
		this.descriptionAnnulation = descriptionAnnulation;
		this.fraisInstallation = fraisInstallation;
		this.fraisIntervention = fraisIntervention;
		this.fraisBetail = fraisBetail;
		this.fraisService = fraisService;
		TVA = tVA;
		this.prixTotal = prixTotal;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.typeInstallation = typeInstallation;
		this.dateDebutInstallation = dateDebutInstallation;
		this.dateFinInstallation = dateFinInstallation;
		this.dateApportTroupeau = dateApportTroupeau;
		this.dateRecuperationTroupeau = dateRecuperationTroupeau;
		this.dateDebutDesinstallation = dateDebutDesinstallation;
		this.dateFinDesinstallation = dateFinDesinstallation;
		this.frequenceIntervention = frequenceIntervention;
		this.terrain = terrain;
		this.troupeau = troupeau;
		this.offre = offre;
		this.annonce = annonce;
		this.motifRefusReservation = motifRefusReservation;
		this.motifAnnulation = motifAnnulation;
		this.conditionAnnulation = conditionAnnulation;
		this.motifReclamation = motifReclamation;
		this.propositions = propositions;
		this.reclamations = reclamations;
		this.interventions = interventions;
		this.evaluations = evaluations;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	public String getNumReservation() {
		return numReservation;
	}

	public void setNumReservation(String numReservation) {
		this.numReservation = numReservation;
	}

	public Date getDateRefus() {
		return dateRefus;
	}

	public void setDateRefus(Date dateRefus) {
		this.dateRefus = dateRefus;
	}

	public Date getDateAnnulation() {
		return dateAnnulation;
	}

	public void setDateAnnulation(Date dateAnnulation) {
		this.dateAnnulation = dateAnnulation;
	}

	public String getDescriptionAnnulation() {
		return descriptionAnnulation;
	}

	public void setDescriptionAnnulation(String descriptionAnnulation) {
		this.descriptionAnnulation = descriptionAnnulation;
	}

	public float getFraisInstallation() {
		return fraisInstallation;
	}

	public void setFraisInstallation(float fraisInstallation) {
		this.fraisInstallation = fraisInstallation;
	}

	public float getFraisIntervention() {
		return fraisIntervention;
	}

	public void setFraisIntervention(float fraisIntervention) {
		this.fraisIntervention = fraisIntervention;
	}

	public float getFraisBetail() {
		return fraisBetail;
	}

	public void setFraisBetail(float fraisBetail) {
		this.fraisBetail = fraisBetail;
	}

	public float getFraisService() {
		return fraisService;
	}

	public void setFraisService(float fraisService) {
		this.fraisService = fraisService;
	}

	public float getTVA() {
		return TVA;
	}

	public void setTVA(float tVA) {
		TVA = tVA;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
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

	public boolean isTypeInstallation() {
		return typeInstallation;
	}

	public void setTypeInstallation(boolean typeInstallation) {
		this.typeInstallation = typeInstallation;
	}

	public Date getDateDebutInstallation() {
		return dateDebutInstallation;
	}

	public void setDateDebutInstallation(Date dateDebutInstallation) {
		this.dateDebutInstallation = dateDebutInstallation;
	}

	public Date getDateFinInstallation() {
		return dateFinInstallation;
	}

	public void setDateFinInstallation(Date dateFinInstallation) {
		this.dateFinInstallation = dateFinInstallation;
	}

	public Date getDateApportTroupeau() {
		return dateApportTroupeau;
	}

	public void setDateApportTroupeau(Date dateApportTroupeau) {
		this.dateApportTroupeau = dateApportTroupeau;
	}

	public Date getDateRecuperationTroupeau() {
		return dateRecuperationTroupeau;
	}

	public void setDateRecuperationTroupeau(Date dateRecuperationTroupeau) {
		this.dateRecuperationTroupeau = dateRecuperationTroupeau;
	}

	public Date getDateDebutDesinstallation() {
		return dateDebutDesinstallation;
	}

	public void setDateDebutDesinstallation(Date dateDebutDesinstallation) {
		this.dateDebutDesinstallation = dateDebutDesinstallation;
	}

	public Date getDateFinDesinstallation() {
		return dateFinDesinstallation;
	}

	public void setDateFinDesinstallation(Date dateFinDesinstallation) {
		this.dateFinDesinstallation = dateFinDesinstallation;
	}

	public int getFrequenceIntervention() {
		return frequenceIntervention;
	}

	public void setFrequenceIntervention(int frequenceIntervention) {
		this.frequenceIntervention = frequenceIntervention;
	}

	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public Troupeau getTroupeau() {
		return troupeau;
	}

	public void setTroupeau(Troupeau troupeau) {
		this.troupeau = troupeau;
	}

	public Offre getOffre() {
		return offre;
	}

	public void setOffre(Offre offre) {
		this.offre = offre;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public MotifRefusReservation getMotifRefusReservation() {
		return motifRefusReservation;
	}

	public void setMotifRefusReservation(MotifRefusReservation motifRefusReservation) {
		this.motifRefusReservation = motifRefusReservation;
	}

	public MotifAnnulation getMotifAnnulation() {
		return motifAnnulation;
	}

	public void setMotifAnnulation(MotifAnnulation motifAnnulation) {
		this.motifAnnulation = motifAnnulation;
	}

	public ConditionAnnulation getConditionAnnulation() {
		return conditionAnnulation;
	}

	public void setConditionAnnulation(ConditionAnnulation conditionAnnulation) {
		this.conditionAnnulation = conditionAnnulation;
	}

	public MotifReclamation getMotifReclamation() {
		return motifReclamation;
	}

	public void setMotifReclamation(MotifReclamation motifReclamation) {
		this.motifReclamation = motifReclamation;
	}

	public List<Proposition> getPropositions() {
		return propositions;
	}

	public void setPropositions(List<Proposition> propositions) {
		this.propositions = propositions;
	}

	public List<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public List<Intervention> getInterventions() {
		return interventions;
	}

	public void setInterventions(List<Intervention> interventions) {
		this.interventions = interventions;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}
	
	public Integer getStatut() {
		return statut;
	}

	public void setStatut(Integer statut) {
		this.statut = statut;
	}
}