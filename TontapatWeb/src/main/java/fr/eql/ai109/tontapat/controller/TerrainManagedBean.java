package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;

@ManagedBean(name = "mbTerrain")
@SessionScoped
public class TerrainManagedBean implements Serializable  {

	private static final long serialVersionUID = 1L;

	
	@EJB
	private TerrainIBusiness terrainIBusiness;
	
	public List<Terrain> ShowAll(){
		return terrainIBusiness.findAll();
	}
	
	public List<Terrain> ShowAllbyCurrentUser(Utilisateur utilisateur){
		return terrainIBusiness.findAllByCurrentUser(utilisateur);
	}

}
