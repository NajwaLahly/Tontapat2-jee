package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.ibusiness.OffreSearchIBusiness;

@ManagedBean(name = "mbOffreSearch")
@RequestScoped
public class OffreSearchManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private OffreSearchIBusiness offreSearchIBusiness;

	@ManagedProperty(value = "#{mbTerrain}")
	private TerrainManagedBean mbTerrain;

	@ManagedProperty(value = "#{mbEspece}")
	private EspeceManagedBean mbEspece;

	private int searchIdTerrain;
	private Date searchDateDebut;
	private Date searchDateFin;

	private int searchIdEspece;
	private Boolean searchInstallationAssuree;
	private float searchPrixMaximum;
	private List<OffreDTO> searchResults;

	private OffreSearch offreSearch = new OffreSearch();

	@PostConstruct
	public void init() {
		searchDateDebut = new Date();
		searchDateFin = new Date();
	}

	public String showSearchResults() {
		FacesMessage facesDateMessage = new FacesMessage(FacesMessage.SEVERITY_WARN, "Veuillez entrer une date valide",
				"Veuillez entrer une date valide");
		FacesContext.getCurrentInstance().addMessage("loginForm:inpDateDebut", facesDateMessage);
		FacesContext.getCurrentInstance().addMessage("loginForm:inpDateFin", facesDateMessage);

		// forward = "/offres/resultats.xhtml?faces-redirection=true";

		// return forward;
		offreSearch.setDateDebut(searchDateDebut);
		offreSearch.setDateFin(searchDateFin);
		offreSearch.setInstallationAssuree(searchInstallationAssuree);
		offreSearch.setEspece(mbEspece.showById(searchIdEspece));
		offreSearch.setPrixMaximum(searchPrixMaximum);
		offreSearch.setTerrain(mbTerrain.showById(searchIdTerrain));

		setSearchResults(offreSearchIBusiness.findSearchResults(offreSearch));

		return offreSearchResultPage();
	}

	public String offreSearchResultPage() {
		return "/offres/resultats.xhtml";
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

	public TerrainManagedBean getMbTerrain() {
		return mbTerrain;
	}

	public void setMbTerrain(TerrainManagedBean mbTerrain) {
		this.mbTerrain = mbTerrain;
	}

	public EspeceManagedBean getMbEspece() {
		return mbEspece;
	}

	public void setMbEspece(EspeceManagedBean mbEspece) {
		this.mbEspece = mbEspece;
	}
}
