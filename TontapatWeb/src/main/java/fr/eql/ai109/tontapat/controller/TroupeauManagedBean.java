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
		return "/mes_troupeaux.xhtml?faces-redirection=false";
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

}

