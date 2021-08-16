package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TroupeauIBusiness;


@ManagedBean(name = "mbTroupeau")
@RequestScoped
public class TroupeauManagedBean implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;
	
	@EJB
	private TroupeauIBusiness troupeauIBusiness;
	
	//Ajout Elodie
	private Troupeau troupeau;
	
	//* Fin Ajout Elodie *
	
	//@EJB
	//private UtilisateurManagedBean utilisateurManganedBean;
	
	//@PostConstruct
	//public void init () {
		//FacesContext fc = FacesContext.getCurrentInstance();
		//HttpSession session  = (HttpSession) fc.getExternalContext().getSession(false);
		//utilisateurConnecte = (Utilisateur) session.getAttribute("utilisateurConnecte");
		//System.out.println(utilisateurConnecte.geNom());
		//utilisateurConnecte = utilisateurManganedBean.getUtilisateur();
		//System.out.println(utilisateurConnecte.getNom());
	//}
	
	public String mesTroupeaux() {
		return "/utilisateur/troupeaux/index.xhtml";
	}
	
	public List<Troupeau> ShowAll(){
		return troupeauIBusiness.findAll();
	}
	
	public List<Troupeau> ShowAllbyCurrentUser(){
		return troupeauIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}
	
	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}
	
	// Ajout Elodie : Retourner un utilisateur non connecté à partir d'un troupeau
	public Utilisateur getUtilisateurByTroupeau() {
		Utilisateur utilisateurNonConnecte = new Utilisateur();
		utilisateurNonConnecte = troupeau.getUtilisateur(); //Utiliser le IBusiness pour aller chercher dans le DAO		
		return utilisateurNonConnecte;
		
	}

	
	//Ajout troupeau
	
	public TroupeauIBusiness getTroupeauIBusiness() {
		return troupeauIBusiness;
	}

	public void setTroupeauIBusiness(TroupeauIBusiness troupeauIBusiness) {
		this.troupeauIBusiness = troupeauIBusiness;
	}

	public Troupeau getTroupeau() {
		return troupeau;
	}

	public void setTroupeau(Troupeau troupeau) {
		this.troupeau = troupeau;
	}

	public Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

}

