package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;


import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;

@ManagedBean(name = "mbPrestation")
@RequestScoped
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="#{mbOffreSearch.searchResults.get(mbOffreSearch.id)}")
	private OffreDTO offreDTO;
 
	private float prixTotalOffre;
	private String terrainNom; 
	private String adresseTerrain; 
	private float fraisInstallationOffre; 
	private float fraisInterventionOffre; 
	private float fraisBetailOffre; 
	private float fraisServiceOffre;
	private float tvaOffre; 
	

	private float fraisTotauxOffre; 


	
	public OffreDTO getOffreDTO() {
		return offreDTO;
	}

	public void setOffreDTO(OffreDTO offreDTO) {
		this.offreDTO = offreDTO;
	}

	@EJB
	private PrestationIBusiness prestationIBusiness;

	public String createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, List<Terrain>  terrains) {
		Terrain terrainResult = new Terrain();
		for(Terrain terrain : terrains) { 
			   if(terrain.getId() == idTerrain) { 
				   terrainResult = terrain;
				   break;
			   }
			}
		float price = calculatePrice(offre, terrainResult);
        prestationIBusiness.createPrestationOffer(offre,idTerrain,debut, fin, price);
		return "/reservation/template_recapitulatif.xhtml";

	}

	public String createFromOffreDTO() {
		prestationIBusiness.createFromOffreDTO(offreDTO);
		return addedPrestationPage();
	}

	private String addedPrestationPage() {
		return "offres/demandeEnvoyee.xhtml?faces-redirection=false";
	}
	
	private float calculatePrice(Offre offre, Terrain terrain) {
		float prixBeteJour = offre.getPrixBeteJour();
		float prixInstallation = offre.getPrixInstallation();
		float prixIntervention = offre.getPrixIntervention();
		float prixKm = offre.getPrixKm();

		float distance = 55;
		int duree = 15;
		
		int nombreBetes = (int) (terrain.getSuperficie() * 10000 / (duree * 10));

		float fraisInstallation = Math.round((prixKm * prixInstallation * distance) * 2 * 100) / 100;
		float fraisBetail = Math.round((prixBeteJour * nombreBetes * duree) * 100) / 100;
		float fraisIntervention = Math.round((duree / offre.getFrequenceIntervention() * prixIntervention) * 100) / 100;
		float fraisTotaux = Math.round((fraisInstallation + fraisBetail + fraisIntervention) * 100) / 100;
		float fraisService = (float) Math.round((fraisTotaux * 0.1) * 100) / 100;
		float TVA = (float) Math.round(((fraisTotaux + fraisService) * 0.2) * 100) / 100;
		float prixTotal = Math.round((fraisTotaux + fraisService + TVA) * 100) / 100;
		prixTotalOffre = prixTotal;
		terrainNom = terrain.getNom(); 
		adresseTerrain = terrain.getAdresseVoie(); 
		fraisInstallationOffre = fraisInstallation; 
		fraisInterventionOffre = fraisIntervention; 
		fraisBetailOffre = fraisBetail; 
		fraisServiceOffre = fraisService; 	
		tvaOffre = TVA; 
		fraisTotauxOffre = fraisTotaux; 
		
		return prixTotal;
	}
	public float getPrixTotal()
	{
		return prixTotalOffre;
	}
	public float getPrixTotalOffre() {
		return prixTotalOffre;
	}
	public String getTerrainNom() {
		return terrainNom;
	}
	public String getAdresseTerrain() {
		return adresseTerrain;
	}
	public float getFraisInstallationOffre() {
		return fraisInstallationOffre;
	}
	public float getFraisInterventionOffre() {
		return fraisInterventionOffre;
	}
	public float getFraisBetailOffre() {
		return fraisBetailOffre;
	}
	public float getFraisServiceOffre() {
		return fraisServiceOffre;
	}

	public float getTvaOffre() {
		return tvaOffre; 
	}
	public float getFraisTotauxOffre() {
		return fraisTotauxOffre;
	}
	
}
