package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;

@ManagedBean(name = "mbPrestation")
@SessionScoped
public class PrestationManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;

	@ManagedProperty(value = "#{mbOffreSearch.searchResult}")
	private OffreDTO offreDTO;

	@ManagedProperty(value = "#{mbOffreSearch.id}")
	private int searchResultId;

	private Prestation prestation;

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	private Date today = new Date();

	public int getSearchResultId() {
		return searchResultId;
	}

	public void setSearchResultId(int searchResultId) {
		this.searchResultId = searchResultId;
	}
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@EJB
	private PrestationIBusiness prestationIBusiness;

	public String createPrestationOffer(Offre offre, int idTerrain, Date debut, Date fin, OffreDTO prix) {
		prestationIBusiness.createPrestationOffer(offre, idTerrain, debut, fin, prix.getPrixTotal());
		return "/reservation/template_recapitulatif.xhtml";

	}

//	public String createFromOffreDTO() {
//		
//		
//		System.out.println("OFFRE DTO : " + offreDTO);
//		System.out.println("SEARCH RESULT ID " + searchResultId);
//		
//		prestationIBusiness.createFromOffreDTO(offreDTO);
//		return addedPrestationPage();
//	}

	public Prestation showById(int id) {
		prestation = prestationIBusiness.findById(id);
		return prestation;
	}
 
	public String validate() {
		System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIID " + id);
		prestation = prestationIBusiness.findById(id);
		prestationIBusiness.validate(prestation);
		return "/utilisateur/prestations/details.xhtml?id=" + prestation.getId();
	}
	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}


	public OffreDTO getOffreDTO() {
		return offreDTO;
	}

	public void setOffreDTO(OffreDTO offreDTO) {
		this.offreDTO = offreDTO;
	}

	public List<Prestation> ShowAllbyCurrentUser() {
		return prestationIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}

	public String mesPrestations() {
		return "/utilisateur/prestations/index.xhtml?faces-redirection=true";
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}
}
