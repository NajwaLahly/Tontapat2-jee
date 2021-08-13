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
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;
	
	@ManagedProperty(value="#{mbOffreSearch.searchResults.get(mbOffreSearch.id)}")
	private OffreDTO offreDTO;
	

	public OffreDTO getOffreDTO() {
		return offreDTO;
	}

	public void setOffreDTO(OffreDTO offreDTO) {
		this.offreDTO = offreDTO;
	}

	@EJB
	private PrestationIBusiness prestationIBusiness;


	public String createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin,OffreDTO prix) {
		prestationIBusiness.createPrestationOffer(offre,idTerrain,debut, fin, prix.getPrixTotal());
		return "/reservation/template_recapitulatif.xhtml";

	}
	
	public String createFromOffreDTO() {
		prestationIBusiness.createFromOffreDTO(offreDTO);
		return addedPrestationPage();
	}

	private String addedPrestationPage() {
		return "/offres/demandeEnvoyee.xhtml?faces-redirection=true";
	}
	
	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}
	
	public List<Prestation> ShowAllbyCurrentUser() {
		return prestationIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}
	
	public String mesPrestations() {
		return "/utilisateur/prestations/index.xhtml?faces-redirection=false";
	}
}
