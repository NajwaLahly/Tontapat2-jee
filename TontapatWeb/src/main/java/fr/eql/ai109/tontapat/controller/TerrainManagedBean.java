package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainMorphologie;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainMorphologieIBusiness;

@ManagedBean(name = "mbTerrain")
@SessionScoped
public class TerrainManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private TerrainIBusiness terrainIBusiness;
	
	@EJB
	private TerrainMorphologieIBusiness terrainMorphologieIBusiness;

	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;

	@ManagedProperty(value = "#{mbMorphologie}")
	private MorphologieManagedBean mbMorphologie;
	
	private int terrainId;
	private Terrain terrain;
	private List<Terrain> terrains;
	private String nom;
	private String adresse;
	private float superficie;
	private String description;
	private Date dateAjout;
	
	private int searchIdMorphologie;
	
	private TerrainMorphologie terrainMorphologie;
	private float pourcentageId1;
	private float pourcentageId2;
	private float pourcentageId3;
	private float pourcentageId4;
	public TerrainMorphologieIBusiness getTerrainMorphologieIBusiness() {
		return terrainMorphologieIBusiness;
	}

	public void setTerrainMorphologieIBusiness(TerrainMorphologieIBusiness terrainMorphologieIBusiness) {
		this.terrainMorphologieIBusiness = terrainMorphologieIBusiness;
	}

	public float getPourcentageId2() {
		return pourcentageId2;
	}

	public void setPourcentageId2(float pourcentageId2) {
		this.pourcentageId2 = pourcentageId2;
	}

	public float getPourcentageId3() {
		return pourcentageId3;
	}

	public void setPourcentageId3(float pourcentageId3) {
		this.pourcentageId3 = pourcentageId3;
	}

	public float getPourcentageId4() {
		return pourcentageId4;
	}

	public void setPourcentageId4(float pourcentageId4) {
		this.pourcentageId4 = pourcentageId4;
	}

	public Terrain getTerrainNew() {
		return terrainNew;
	}

	public void setTerrainNew(Terrain terrainNew) {
		this.terrainNew = terrainNew;
	}

	private Terrain terrainNew;
	
	
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

	public void addNew () {
		
		//addNewTerrain ();
		terrainNew = new Terrain ();
		terrainNew.setUtilisateur(utilisateurConnecte);
		terrainNew.setNom(nom);
		terrainNew.setAdresseVoie(adresse);
		terrainNew.setDescription(description);
		terrainNew.setSuperficie(superficie);
		terrainNew.setDateAjout(dateAjout = new Date());
		
		terrainNew = terrainIBusiness.addNewTerrain(terrainNew);
		
		TerrainMorphologie terrainMophologieNew = new TerrainMorphologie ();
		terrainMophologieNew.setTerrain(terrainNew);
		terrainMophologieNew.setMorphologie(mbMorphologie.showAll().get(0));
		terrainMophologieNew.setPourcentage(pourcentageId1);
		terrainMorphologieIBusiness.addNewTerrainMorphologie(terrainMophologieNew);
		
		terrainMophologieNew.setTerrain(terrainNew);
		terrainMophologieNew.setMorphologie(mbMorphologie.showAll().get(1));
		terrainMophologieNew.setPourcentage(pourcentageId2);
		terrainMorphologieIBusiness.addNewTerrainMorphologie(terrainMophologieNew);
		
		terrainMophologieNew.setTerrain(terrainNew);
		terrainMophologieNew.setMorphologie(mbMorphologie.showAll().get(2));
		terrainMophologieNew.setPourcentage(pourcentageId3);
		terrainMorphologieIBusiness.addNewTerrainMorphologie(terrainMophologieNew);
		
		terrainMophologieNew.setTerrain(terrainNew);
		terrainMophologieNew.setMorphologie(mbMorphologie.showAll().get(3));
		terrainMophologieNew.setPourcentage(pourcentageId4);
		terrainMorphologieIBusiness.addNewTerrainMorphologie(terrainMophologieNew);
	}
	
	



	//*********Getter Setter*********
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public MorphologieManagedBean getMbMorphologie() {
		return mbMorphologie;
	}

	public void setMbMorphologie(MorphologieManagedBean mbMorphologie) {
		this.mbMorphologie = mbMorphologie;
	}

	public TerrainIBusiness getTerrainIBusiness() {
		return terrainIBusiness;
	}

	public void setTerrainIBusiness(TerrainIBusiness terrainIBusiness) {
		this.terrainIBusiness = terrainIBusiness;
	}

	public Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

	public int getSearchIdMorphologie() {
		return searchIdMorphologie;
	}

	public void setSearchIdMorphologie(int searchIdMorphologie) {
		this.searchIdMorphologie = searchIdMorphologie;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date datAjout) {
		this.dateAjout = datAjout;
	}

	public TerrainMorphologie getTerrainMorphologie() {
		return terrainMorphologie;
	}

	public void setTerrainMorphologie(TerrainMorphologie terrainMorphologie) {
		this.terrainMorphologie = terrainMorphologie;
	}

	public float getPourcentageId1() {
		return pourcentageId1;
	}

	public void setPourcentageId1(float pourcentageId1) {
		this.pourcentageId1 = pourcentageId1;
	}


}
