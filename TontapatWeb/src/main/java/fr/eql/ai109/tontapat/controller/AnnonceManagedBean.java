package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.AnnonceIBusiness;

@ManagedBean(name = "mbAnnonce")
@RequestScoped
public class AnnonceManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;
	
	@EJB
	private AnnonceIBusiness annonceIBusiness;
	
	public List<Annonce> ShowAll(){
		return annonceIBusiness.findAll();
	}
	
	public String mesAnnonces() {
		return "/utilisateur/annonces/index.xhtml";
	}
	
	public List<Annonce> ShowAllbyCurrentUser(){
		return annonceIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}
	
	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}

}
