package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.entity.Utilisateur;

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


	
	//Ajout Elodie
	private Prestation prestationReservee = new Prestation();
	private OffreSearch offreSearch = new OffreSearch();
	String notif = null;
	private Prestation lastReservation = new Prestation();
	



	public String createFromOffreDTO() {
		prestationIBusiness.createFromOffreDTO(offreDTO);
		return addedPrestationPage();
	}

	private String addedPrestationPage() {
		return "/offres/demandeEnvoyee.xhtml?faces-redirection=true";
	}


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



	public List<Prestation> ShowAllNotificationsbyCurrentUser() { //Ajout Elodie
		return prestationIBusiness.findAllNotificationsByCurrentUser(utilisateurConnecte);
	}
	


	@PostConstruct
	public void init() { // ajout Elodie
		notif = demandeNotifs();
	}

	public String acceptedNotifs() { //Ajout Elodie
		List<Prestation> prestations = new ArrayList<Prestation>();
		prestations = prestationIBusiness.findValidatedPrestation(utilisateurConnecte);

		if(prestations.size()>0) {
			for (Prestation prestation : prestations) {
				Troupeau troupeau = prestation.getTroupeau();
				Utilisateur utilisateurNonConnecte = troupeau.getUtilisateur();
				String nom = utilisateurNonConnecte.getNom();
				String prenom = utilisateurNonConnecte.getPrenom();
				Offre offre = prestation.getOffre();
				String nomOffre = offre.getNom();
				notif = nom + " " + prenom + " " + "a accepté votre demande de réservation "
						+ "pour l'offre '" + nomOffre + "'";
			}	
		}
		return notif;
	}



	public String demandeNotifs() { //Ajout Elodie
		List<Prestation> prestations = ShowAllNotificationsbyCurrentUser();
		System.out.println("******** PRESTATIONS ********* :" + prestations.size());
		String notif = null;

			for (Prestation prestation : prestations) {
				Offre offre = prestation.getOffre();
				String titre = offre.getNom();
				notif = "Vous avez une demande de réservation pour l'offre '" + titre + "'" ;
			}	
		
		return notif;
	}

	//	public int lastReservation() { //Ajout Elodie
	//		List<Prestation> prestations = ShowAllNotificationsbyCurrentUser();
	//		System.out.println("******** PRESTATIONS ********* :" + prestations.size());
	//
	//		int idLastReservation = 0;
	//		
	//		if(prestations.size()>0) {
	//			for (Prestation prestation : prestations) {
	//				idLastReservation = prestation.getId();
	//			}	
	//		}
	//		return idLastReservation;		
	//	}


	public Prestation lastReservation() { //Ajout Elodie
		List<Prestation> prestations = ShowAllNotificationsbyCurrentUser();
		System.out.println("******** PRESTATIONS ********* :" + prestations.size());
		for (Prestation prestation : prestations) {
			lastReservation = prestation;	
		}
		return lastReservation;		
	}	
	
	public Prestation showLastPrestationReserved() {
		//		id = lastReservation();
		prestationReservee = prestationIBusiness.findById(id);
		return prestationReservee;
	}

	// Fin ajout Elodie


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


	public PrestationIBusiness getPrestationIBusiness() {
		return prestationIBusiness;
	}


	public void setPrestationIBusiness(PrestationIBusiness prestationIBusiness) {
		this.prestationIBusiness = prestationIBusiness;
	}


	public Prestation getPrestationReservee() {
		return prestationReservee;
	}


	public void setPrestationReservee(Prestation prestationReservee) {
		this.prestationReservee = prestationReservee;
	}


	public Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}


	public OffreSearch getOffreSearch() {
		return offreSearch;
	}


	public void setOffreSearch(OffreSearch offreSearch) {
		this.offreSearch = offreSearch;
	}


	public String getNotif() {
		return notif;
	}


	public void setNotif(String notif) {
		this.notif = notif;
	}


	public Prestation getLastReservation() {
		return lastReservation;
	}


	public void setLastReservation(Prestation lastReservation) {
		this.lastReservation = lastReservation;
	}
}
