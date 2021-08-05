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
@Table(name = "intervention")
public class Intervention implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_intervention", nullable = false)
	private int id;
	@Column(name = "descriptif")
	private String descriptif;
	@Column(name = "date_demande")
	private Date dateDemande;
	@Column(name = "date_validation")
	private Date dateValidation;
	@Column(name = "date_intervention")
	private Date dateIntervention;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_type_intervention")
	private TypeIntervention typeIntervention;
	
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intervention(int id, String descriptif, Date dateDemande, Date dateValidation, Date dateIntervention,
			Prestation prestation, TypeIntervention typeIntervention) {
		super();
		this.id = id;
		this.descriptif = descriptif;
		this.dateDemande = dateDemande;
		this.dateValidation = dateValidation;
		this.dateIntervention = dateIntervention;
		this.prestation = prestation;
		this.typeIntervention = typeIntervention;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	public Date getDateIntervention() {
		return dateIntervention;
	}

	public void setDateIntervention(Date dateIntervention) {
		this.dateIntervention = dateIntervention;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	public TypeIntervention getTypeIntervention() {
		return typeIntervention;
	}

	public void setTypeIntervention(TypeIntervention typeIntervention) {
		this.typeIntervention = typeIntervention;
	}
	
}