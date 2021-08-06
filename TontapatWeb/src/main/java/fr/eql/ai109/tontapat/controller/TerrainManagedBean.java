package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;

@ManagedBean(name = "mbTerrain")
@RequestScoped
public class TerrainManagedBean implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;
	
	@EJB
	private TerrainIBusiness terrainIBusiness;
	
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
	
	
	
	public List<Terrain> ShowAll(){
		return terrainIBusiness.findAll();
	}
	
	public List<Terrain> ShowAllbyCurrentUser(){
		return terrainIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}
	
	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}

}
