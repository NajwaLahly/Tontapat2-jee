package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;

@ManagedBean(name = "mbTerrain")
@SessionScoped
public class TerrainManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int terrainId;
	private List<Terrain> terrains;
	
	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;

	@EJB
	private TerrainIBusiness terrainIBusiness;

	@PostConstruct
	public void init() {
		terrains = ShowAllbyCurrentUser();
	}

	public String mesTerrains() {
		return "/utilisateur/terrains/index.xhtml?faces-redirection=false";
	}

	public List<Terrain> ShowAll() {
		return terrainIBusiness.findAll();
	}

	public List<Terrain> ShowAllbyCurrentUser() {
		return terrainIBusiness.findAllByCurrentUser(utilisateurConnecte);
	}

	public List<String> ShowAllbyCurrentUserAsList() {
		return terrainIBusiness.findAllByCurrentUserAsList(utilisateurConnecte);
	}

	public Terrain showById(int id) {
		return terrainIBusiness.findById(id);
	}

	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}

	public List<Terrain> getTerrains() {
		return terrains;
	}

	public void setTerrains(List<Terrain> terrains) {
		this.terrains = terrains;
	}

	public int getTerrainId() {
		return terrainId;
	}

	public void setTerrainId(int terrainId) {
		this.terrainId = terrainId;
	}

}
