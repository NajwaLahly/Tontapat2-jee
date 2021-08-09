package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.OffreIBusiness;

@ManagedBean(name = "mbOffre")
@RequestScoped
public class OffreManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;
	
	private int id;
	
	@EJB
	private OffreIBusiness offreIBusiness;
	
	public List<Offre> ShowAll() {
		return offreIBusiness.findAll();
	}
	
	public Offre ShowById(int id) {
		return offreIBusiness.getById(id);
	}
	
	public List<Offre> ShowAllbyCurrentUser(){
		return offreIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}
	
	public String mesOffres() {
		return "/utilisateur/offres/index.xhtml?faces-redirection=false";
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
}
