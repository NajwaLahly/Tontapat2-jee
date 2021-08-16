package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Proposition;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.PropositionIBusiness;

/**
 * @author Val
 *
 */
@ManagedBean(name = "mbProposition")
@SessionScoped
public class PropositionManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private PropositionIBusiness propositionIBusiness;

	private Date dateDebut;
	public Prestation getCurrentPrestation() {
		return currentPrestation;
	}

	public void setCurrentPrestation(Prestation currentPrestation) {
		this.currentPrestation = currentPrestation;
	}
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Date dateFin;
	private boolean typeInstallation;
	private float prixTotal;
	private String description;

	@ManagedProperty(value = "#{mbPrestation.prestation}")
	private Prestation currentPrestation;
	
	public List<Proposition> showAllByPrestationId(int id) {
		System.out.println("PRESTATION ID MB : " + id);
		return propositionIBusiness.findAllByPrestationId(id);
	}
	
	public Proposition showById(int id) {
		return propositionIBusiness.findById(id);
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

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
