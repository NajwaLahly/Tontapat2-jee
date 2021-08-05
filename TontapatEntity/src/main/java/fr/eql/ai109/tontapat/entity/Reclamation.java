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
@Table(name = "reclamation")
public class Reclamation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reclamation", nullable = false)
	private int id;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "date_traitement")
	private Date dateTraitement;
	@Column(name = "descriptif")
	private String descriptif;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_motif_reclamation")
	private MotifReclamation motifReclamation;
	
	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reclamation(int id, Date dateAjout, Date dateTraitement, String descriptif, Prestation prestation,
			Utilisateur utilisateur, MotifReclamation motifReclamation) {
		super();
		this.id = id;
		this.dateAjout = dateAjout;
		this.dateTraitement = dateTraitement;
		this.descriptif = descriptif;
		this.prestation = prestation;
		this.utilisateur = utilisateur;
		this.motifReclamation = motifReclamation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public Date getDateTraitement() {
		return dateTraitement;
	}

	public void setDateTraitement(Date dateTraitement) {
		this.dateTraitement = dateTraitement;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public MotifReclamation getMotifReclamation() {
		return motifReclamation;
	}

	public void setMotifReclamation(MotifReclamation motifReclamation) {
		this.motifReclamation = motifReclamation;
	}
		
	
}