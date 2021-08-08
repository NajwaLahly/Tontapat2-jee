package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.EspeceIBusiness;
import fr.eql.ai109.tontapat.ibusiness.OffreIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;

@ManagedBean(name = "mbOffre")
@SessionScoped
public class OffreManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;

	private OffreSearch offreSearch;
	private int searchIdTerrain;
	private Date searchDateDebut;
	private Date searchDateFin;

	private int searchIdEspece;
	private Boolean searchInstallationAssuree;
	private float searchPrixMaximum;

	private TerrainIBusiness terrainIBusiness;
	private EspeceIBusiness especeIBusiness;
	private int id;

	private List<OffreDTO> searchResults;
	
	@EJB
	private OffreIBusiness offreIBusiness;

	@PostConstruct
	public void init() {
		searchDateDebut = new Date();
		searchDateFin = new Date();	}
	public List<Offre> ShowAll() {
		return offreIBusiness.findAll();
	}

	public Offre ShowById(int id) {
		return offreIBusiness.findById(id);
	}

	public List<Offre> ShowAllbyCurrentUser() {
		return offreIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}

	public String mesOffres() {
		return "/utilisateur/offres/index.xhtml?faces-redirection=false";
	}

	public String showSearchResults() {
		String forward = null;
		FacesMessage facesDateMessage = new FacesMessage(FacesMessage.SEVERITY_WARN, "Veuillez entrer une date valide",
				"Veuillez entrer une date valide");
		FacesContext.getCurrentInstance().addMessage("loginForm:inpDateDebut", facesDateMessage);
		FacesContext.getCurrentInstance().addMessage("loginForm:inpDateFin", facesDateMessage);

		forward = "/offres/resultats.xhtml?faces-redirection=true";

		//return forward;
		offreSearch.setTerrain(terrainIBusiness.findById(searchIdTerrain));
		offreSearch.setDateDebut(searchDateDebut);
		offreSearch.setDateFin(searchDateFin);
		offreSearch.setInstallationAssuree(searchInstallationAssuree);
		offreSearch.setEspece(especeIBusiness.findById(searchIdEspece));
		offreSearch.setPrixMaximum(searchPrixMaximum);
		setSearchResults(offreIBusiness.findSearchResults(offreSearch));
	return offreSearchResultPage();
	}
	
	public String offreSearchResultPage() {
		return "/offres/resultats.xhtml";
	}

	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSearchIdTerrain() {
		return searchIdTerrain;
	}

	public void setSearchIdTerrain(int searchIdTerrain) {
		this.searchIdTerrain = searchIdTerrain;
	}

	public Date getSearchDateDebut() {
		return searchDateDebut;
	}

	public void setSearchDateDebut(Date searchDateDebut) {
		this.searchDateDebut = searchDateDebut;
	}

	public Date getSearchDateFin() {
		return searchDateFin;
	}

	public void setSearchDateFin(Date searchDateFin) {
		this.searchDateFin = searchDateFin;
	}

	public int getSearchIdEspece() {
		return searchIdEspece;
	}

	public void setSearchIdEspece(int searchIdEspece) {
		this.searchIdEspece = searchIdEspece;
	}

	public Boolean getSearchInstallationAssuree() {
		return searchInstallationAssuree;
	}

	public void setSearchInstallationAssuree(Boolean searchInstallationAssuree) {
		this.searchInstallationAssuree = searchInstallationAssuree;
	}

	public float getSearchPrixMaximum() {
		return searchPrixMaximum;
	}

	public void setSearchPrixMaximum(float searchPrixMaximum) {
		this.searchPrixMaximum = searchPrixMaximum;
	}

	public OffreSearch getOffreSearch() {
		return offreSearch;
	}

	public void setOffreSearch(OffreSearch offreSearch) {
		this.offreSearch = offreSearch;
	}
	public List<OffreDTO> getSearchResults() {
		return searchResults;
	}
	public void setSearchResults(List<OffreDTO> searchResults) {
		this.searchResults = searchResults;
	}
}
