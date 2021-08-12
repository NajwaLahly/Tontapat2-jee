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

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainMorphologie;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainMorphologieIBusiness;

@ManagedBean(name = "mbTerrain")
@RequestScoped
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
	private int morphologieId1;
	private int morphologieId2;
	private int morphologieId3;
	private int morphologieId4;
	//private Terrain terrainNew;
	
	
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
		Terrain terrainNew = new Terrain ();
		addNewTerrain (terrainNew);
		System.out.println("add new terrain dans la methode gene");
		System.out.println(terrainNew.getId());
		selectLastTerrainInsert (terrainNew);
		System.out.println("select last terrain dans la methode gene");
		System.out.println(terrainNew.getId());
		addNewTerrainMorphologie(terrainNew);
	}
	
	public Terrain addNewTerrain (Terrain terrainNew) {
		terrainNew.setUtilisateur(utilisateurConnecte);
		terrainNew.setNom(nom);
		terrainNew.setAdresseVoie(adresse);
		terrainNew.setDescription(description);
		terrainNew.setSuperficie(superficie);
		terrainNew.setDateAjout(dateAjout = new Date());
		terrainIBusiness.addNewTerrain(terrainNew);
		System.out.println("add new terrain");
		System.out.println(terrainNew.getId());
		//TerrainMorphologie terrainMophologieNew = new TerrainMorphologie ();
		//terrainMophologieNew.setTerrain(terrainNew);
		//terrainMophologieNew.setMorphologie(morphologieId1);
		//terrainMophologieNew.setPourcentage(pourcentageId1);
		return terrainNew;
	}
	
	public Terrain selectLastTerrainInsert (Terrain terrain) {
		terrainIBusiness.selectLastIdTerrain(terrain);
		System.out.println("select last terrain");
		return terrain;
	}
	
	public void addNewTerrainMorphologie(Terrain terrainNew) {
		System.out.println("add new terrainMorphologie");
		System.out.println(terrainNew.getId());
		TerrainMorphologie terrainMophologieNew = new TerrainMorphologie ();
		terrainMophologieNew.setTerrain(terrainNew);
		//terrainMophologieNew.setMorphologie(morphologieId1);
		terrainMophologieNew.setPourcentage(pourcentageId1);
		
	}
	
	//public addNewTerrain() {
		
	//	return idNewTerrain
	//}



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

	public int getMorphologieId1() {
		return morphologieId1;
	}

	public void setMorphologieId1(int morphologieId1) {
		this.morphologieId1 = morphologieId1;
	}

	public int getMorphologieId2() {
		return morphologieId2;
	}

	public void setMorphologieId2(int morphologieId2) {
		this.morphologieId2 = morphologieId2;
	}

	public int getMorphologieId3() {
		return morphologieId3;
	}

	public void setMorphologieId3(int morphologieId3) {
		this.morphologieId3 = morphologieId3;
	}

	public int getMorphologieId4() {
		return morphologieId4;
	}

	public void setMorphologieId4(int morphologieId4) {
		this.morphologieId4 = morphologieId4;
	}

	public float getPourcentageId1() {
		return pourcentageId1;
	}

	public void setPourcentageId1(float pourcentageId1) {
		this.pourcentageId1 = pourcentageId1;
	}


}
