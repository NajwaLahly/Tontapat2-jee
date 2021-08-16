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
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;
	
	@ManagedProperty(value="#{mbOffreSearch.searchResults.get(mbOffreSearch.id)}")
	private OffreDTO offreDTO;
	
	private int id;

	@EJB
	private PrestationIBusiness prestationIBusiness;
	
	//Ajout Elodie
	private Prestation prestationReservee = new Prestation();
	private OffreSearch offreSearch = new OffreSearch();
	String notif = null;

	public String createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin,OffreDTO prix) {
		if (prix == null) 
			prix = new OffreDTO(); 
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


	public Prestation showById(int id) {
		return prestationIBusiness.findById(id);
	}


	public List<Prestation> ShowAllNotificationsbyCurrentUser() { //Ajout Elodie
		return prestationIBusiness.findAllNotificationsByCurrentUser(utilisateurConnecte);
	}

	//	public List<String> acceptedNotifs() { //Ajout Elodie
	//		List<Prestation> prestations = ShowAllNotificationsbyCurrentUser();
	//		System.out.println("******** PRESTATIONS ********* :" + prestations);
	//		List<String> notifs = new ArrayList<String>();
	//		
	//		for (Prestation prestation : prestations) {
	//			Troupeau troupeau = prestation.getTroupeau();
	//			Utilisateur utlisateurNonConnecte = troupeau.getUtilisateur();
	//			String nom = utlisateurNonConnecte.getNom();
	//			String prenom = utlisateurNonConnecte.getPrenom();
	//			String notif = nom + " " + prenom + " " + "a accepté votre demande de réservation";
	//			System.out.println("******** NOTIFICATION ********* :" + notif);
	//			System.out.println("******** DATE DE RESERVATION ********* :" + prestation.getDateReservation());
	//			notifs.add(notif);
	//			System.out.println("******** NOTIFICATIONS ********* :" + notifs);
	//		}		
	//		return notifs;
	//	}

	
	@PostConstruct
	public void init() { // ajout Elodie
		notif = demandeNotifs();
	}
	
	public String acceptedNotifs() { //Ajout Elodie
		List<Prestation> prestations = ShowAllNotificationsbyCurrentUser();
		System.out.println("******** PRESTATIONS ********* :" + prestations.size());
		
		if(prestations.size()>0) {
			for (Prestation prestation : prestations) {
				Troupeau troupeau = prestation.getTroupeau();
				Utilisateur utlisateurNonConnecte = troupeau.getUtilisateur();
				String nom = utlisateurNonConnecte.getNom();
				String prenom = utlisateurNonConnecte.getPrenom();
				notif = nom + " " + prenom + " " + "a accepté votre demande de réservation";
			}	
		}
		return notif;
	}
	

	
	public String demandeNotifs() { //Ajout Elodie
		List<Prestation> prestations = ShowAllNotificationsbyCurrentUser();
		System.out.println("******** PRESTATIONS ********* :" + prestations.size());
		String notif = null;

		if(prestations.size()>0) {
			for (Prestation prestation : prestations) {
				Offre offre = prestation.getOffre();
				String titre = offre.getNom();
				notif = "Vous avez une demande de réservation pour l'offre '" + titre + "'" ;
			}	
		}
		return notif;
	}
	
	public int lastReservation() { //Ajout Elodie
		List<Prestation> prestations = ShowAllNotificationsbyCurrentUser();
		System.out.println("******** PRESTATIONS ********* :" + prestations.size());

		int idLastPrestation = 0;
		
		if(prestations.size()>0) {
			for (Prestation prestation : prestations) {
				idLastPrestation = prestation.getId();
			}	
		}
		return idLastPrestation;
		
	}
	public Prestation showLastPrestationReserved() {
		id = lastReservation();
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public List<Prestation> ShowAllbyCurrentUser() {
		return prestationIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}
	
	public String mesPrestations() {
		return "/utilisateur/prestations/index.xhtml?faces-redirection=false";
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
}
