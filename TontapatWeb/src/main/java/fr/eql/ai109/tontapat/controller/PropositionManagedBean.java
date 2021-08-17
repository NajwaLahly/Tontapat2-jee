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

@ManagedBean(name = "mbProposition")
@SessionScoped
public class PropositionManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private PropositionIBusiness propositionIBusiness;

	public Prestation getCurrentPrestation() {
		return currentPrestation;
	}

	private int id;

	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;

	private Proposition proposition = new Proposition();
	private Date dateDebut;
	private Date dateFin;
	private int typeInstallation;
	private float prixTotal;
	private String description;

	@ManagedProperty(value = "#{mbPrestation.prestation}")
	private Prestation currentPrestation;

	public List<Proposition> showAllByPrestationId(int id) {
		System.out.println("PRESTATION ID MB : " + id);
		return propositionIBusiness.findAllByPrestationId(id);
	}

	public String send() {
		Proposition proposition = new Proposition();
		System.out.println("SEND SEND SEND SEND CURRENT PRESTATION id : " + currentPrestation.getId());
		System.out.println("SEND SEND SEND SEND CURRENT PRESTATION date debut : " + currentPrestation.getDateDebut());
		if (dateDebut != null) {
			proposition.setDateDebutPrestation(dateDebut);
		} else {
			proposition.setDateDebutPrestation(currentPrestation.getDateDebut());
		}
		if (dateFin != null) {
			proposition.setDateFinPrestation(dateFin);
		} else {
			proposition.setDateFinPrestation(currentPrestation.getDateFin());
		}
		if (prixTotal > 0) {
			proposition.setPrixPropose(prixTotal);
		} else {
			proposition.setPrixPropose(currentPrestation.getPrixTotal());
		}
		if (typeInstallation == 1) {
			proposition.setTypeInstallation(true);
		} else {
			proposition.setTypeInstallation(false);
		}
		proposition.setDescription(description);
		proposition.setUtilisateur(utilisateurConnecte);
		proposition.setDateCreation(new Date());
		proposition.setPrestation(currentPrestation);
		propositionIBusiness.send(proposition);
		return "/utilisateur/prestations/details.xhtml?id=" + currentPrestation.getId() + "&send";
	}

	public Proposition showById(int id) {
		return propositionIBusiness.findById(id);
	}

	public Proposition showLatestByCurrentPrestation() {
		System.out.println("*************************** CURRENT PRESTATION : " + currentPrestation.getId());
		proposition = propositionIBusiness.findLatestFromPrestationId(currentPrestation.getId());
		return proposition;
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

	public int getTypeInstallation() {
		return typeInstallation;
	}

	public void setTypeInstallation(int typeInstallation) {
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

	public Proposition getProposition() {
		return proposition;
	}

	public void setProposition(Proposition proposition) {
		this.proposition = proposition;
	}

	public void setCurrentPrestation(Prestation currentPrestation) {
		this.currentPrestation = currentPrestation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}
}