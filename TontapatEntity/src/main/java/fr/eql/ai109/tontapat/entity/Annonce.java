package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "annonce")
public class Annonce implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_annonce", nullable = false)
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
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_terrain")
	private Terrain terrain;
	@OneToOne(mappedBy = "annonce", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Prestation prestation;
	
	
	public Annonce() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Annonce(int id, String nom, Date dateAjout, Date dateDebut, Date dateFin, String description,
			boolean installationAssuree, Date dateRetrait, Terrain terrain, Prestation prestation) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateAjout = dateAjout;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.description = description;
		this.installationAssuree = installationAssuree;
		this.dateRetrait = dateRetrait;
		this.terrain = terrain;
		this.prestation = prestation;
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


	public Date getDateRetrait() {
		return dateRetrait;
	}


	public void setDateRetrait(Date dateRetrait) {
		this.dateRetrait = dateRetrait;
	}


	public Terrain getTerrain() {
		return terrain;
	}


	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}


	public Prestation getPrestation() {
		return prestation;
	}


	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}
	
}
