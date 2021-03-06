package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainMorphologie;
import fr.eql.ai109.tontapat.entity.TerrainTypeAbreuvoir;
import fr.eql.ai109.tontapat.entity.TerrainTypeAbri;
import fr.eql.ai109.tontapat.entity.TerrainTypeCloture;
import fr.eql.ai109.tontapat.entity.TerrainTypeVegetation;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainMorphologieIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeAbreuvoirIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeAbriIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeClotureIBusiness;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeVegetationIBusiness;

@ManagedBean(name = "mbTerrain")
@SessionScoped
public class TerrainManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private TerrainIBusiness terrainIBusiness;
	
	@EJB
	private TerrainMorphologieIBusiness terrainMorphologieIBusiness;
	
	@EJB
	private TerrainTypeVegetationIBusiness terrainTypeVegetationIBusiness;
	
	@EJB
	private TerrainTypeClotureIBusiness terrainTypeClotureIBusiness;
	
	@EJB
	private TerrainTypeAbriIBusiness terrainTypeAbriIBusiness;
	
	@EJB
	private TerrainTypeAbreuvoirIBusiness terrainTypeAbreuvoirIBusiness;

	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;

	@ManagedProperty(value = "#{mbMorphologie}")
	private MorphologieManagedBean mbMorphologie;
	
	@ManagedProperty(value = "#{mbTypeVegetation}")
	private TypeVegetationManagedBean mbTypeVegetation;
	
	@ManagedProperty(value = "#{mbTypeCloture}")
	private TypeClotureManagedBean mbTypeCloture;
	
	@ManagedProperty(value = "#{mbTypeAbri}")
	private TypeAbriManagedBean mbTypeAbri;
	
	@ManagedProperty(value = "#{mbTypeAbreuvoir}")
	private TypeAbreuvoirManagedBean mbTypeAbreuvoir;
	
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
	private List<TerrainMorphologie> terrainMorphologies;
	
	private int searchIdTypeVegetation;
	private TerrainTypeVegetation terrainTypeVegetation;
	private float pourcentageTypeVegetationId1;
	private float pourcentageTypeVegetationId2;
	private float pourcentageTypeVegetationId3;
	private float pourcentageTypeVegetationId4;
	private float pourcentageTypeVegetationId5;
	private List<TerrainTypeVegetation> terrainTypeVegetations;
	
	private TerrainTypeCloture terrainTypeCloture;
	private TerrainTypeAbri terrainTypeAbri;
	private TerrainTypeAbreuvoir terrainTypeAbreuvoir;
	

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
	
	public List<TerrainTypeVegetation> showAllTypeVegetationThisTerrain (Terrain terrain) {
		terrainTypeVegetations = terrainTypeVegetationIBusiness.findAllTypeVegetationThisTerrain(terrain);
		return terrainTypeVegetations;
	}
	
	public List<TerrainMorphologie> showAllMorphologieThisTerrain (Terrain terrain) {
		 terrainMorphologies = terrainMorphologieIBusiness.findAllMorphologieThisTerrain(terrain);
		return  terrainMorphologies;
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
		
		
		TerrainTypeVegetation terrainTypeVegetationNew = new TerrainTypeVegetation ();
		terrainTypeVegetationNew.setTerrain(terrainNew);
		terrainTypeVegetationNew.setTypeVegetation(mbTypeVegetation.showAll().get(0));
		terrainTypeVegetationNew.setPourcentage(pourcentageTypeVegetationId1);
		terrainTypeVegetationIBusiness.addNewTerrainTypeVegetation(terrainTypeVegetationNew);
		
		terrainTypeVegetationNew.setTerrain(terrainNew);
		terrainTypeVegetationNew.setTypeVegetation(mbTypeVegetation.showAll().get(1));
		terrainTypeVegetationNew.setPourcentage(pourcentageTypeVegetationId2);
		terrainTypeVegetationIBusiness.addNewTerrainTypeVegetation(terrainTypeVegetationNew);
		
		terrainTypeVegetationNew.setTerrain(terrainNew);
		terrainTypeVegetationNew.setTypeVegetation(mbTypeVegetation.showAll().get(2));
		terrainTypeVegetationNew.setPourcentage(pourcentageTypeVegetationId3);
		terrainTypeVegetationIBusiness.addNewTerrainTypeVegetation(terrainTypeVegetationNew);
		
		terrainTypeVegetationNew.setTerrain(terrainNew);
		terrainTypeVegetationNew.setTypeVegetation(mbTypeVegetation.showAll().get(3));
		terrainTypeVegetationNew.setPourcentage(pourcentageTypeVegetationId4);
		terrainTypeVegetationIBusiness.addNewTerrainTypeVegetation(terrainTypeVegetationNew);
		
		terrainTypeVegetationNew.setTerrain(terrainNew);
		terrainTypeVegetationNew.setTypeVegetation(mbTypeVegetation.showAll().get(4));
		terrainTypeVegetationNew.setPourcentage(pourcentageTypeVegetationId5);
		terrainTypeVegetationIBusiness.addNewTerrainTypeVegetation(terrainTypeVegetationNew);
		
		TerrainTypeCloture terrainTypeClotureNew = new TerrainTypeCloture();
		terrainTypeClotureNew.setTerrain(terrainNew);
		terrainTypeClotureNew.setTypeCloture(mbTypeCloture.showById(mbTypeCloture.getTypeClotureId()));
		terrainTypeClotureIBusiness.addNewTerrainTypeCloture(terrainTypeClotureNew );
		
		TerrainTypeAbri terrainTypeAbriNew = new TerrainTypeAbri();
		terrainTypeAbriNew.setTerrain(terrainNew);
		terrainTypeAbriNew.setTypeAbri(mbTypeAbri.showById(mbTypeAbri.getTypeAbriId()));
		terrainTypeAbriIBusiness.addNewTerrainTypeAbri(terrainTypeAbriNew );
	
		TerrainTypeAbreuvoir terrainTypeAbreuvoirNew = new TerrainTypeAbreuvoir();
		terrainTypeAbreuvoirNew.setTerrain(terrainNew);
		terrainTypeAbreuvoirNew.setTypeAbreuvoir(mbTypeAbreuvoir.showById(mbTypeAbreuvoir.getTypeAbreuvoirId()));
		terrainTypeAbreuvoirIBusiness.addNewTerrainTypeAbreuvoir(terrainTypeAbreuvoirNew );
	
	
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

	public TerrainTypeVegetationIBusiness getTerrainTypeVegetationIBusiness() {
		return terrainTypeVegetationIBusiness;
	}

	public void setTerrainTypeVegetationIBusiness(TerrainTypeVegetationIBusiness terrainTypeVegetationIBusiness) {
		this.terrainTypeVegetationIBusiness = terrainTypeVegetationIBusiness;
	}

	public TypeVegetationManagedBean getMbTypeVegetation() {
		return mbTypeVegetation;
	}

	public void setMbTypeVegetation(TypeVegetationManagedBean mbTypeVegetation) {
		this.mbTypeVegetation = mbTypeVegetation;
	}

	public int getSearchIdTypeVegetation() {
		return searchIdTypeVegetation;
	}

	public void setSearchIdTypeVegetation(int searchIdTypeVegetation) {
		this.searchIdTypeVegetation = searchIdTypeVegetation;
	}

	public TerrainTypeVegetation getTerrainTypeVegetation() {
		return terrainTypeVegetation;
	}

	public void setTerrainTypeVegetation(TerrainTypeVegetation terrainTypeVegetation) {
		this.terrainTypeVegetation = terrainTypeVegetation;
	}

	public float getPourcentageTypeVegetationId1() {
		return pourcentageTypeVegetationId1;
	}

	public void setPourcentageTypeVegetationId1(float pourcentageTypeVegetationId1) {
		this.pourcentageTypeVegetationId1 = pourcentageTypeVegetationId1;
	}

	public float getPourcentageTypeVegetationId2() {
		return pourcentageTypeVegetationId2;
	}

	public void setPourcentageTypeVegetationId2(float pourcentageTypeVegetationId2) {
		this.pourcentageTypeVegetationId2 = pourcentageTypeVegetationId2;
	}

	public float getPourcentageTypeVegetationId3() {
		return pourcentageTypeVegetationId3;
	}

	public void setPourcentageTypeVegetationId3(float pourcentageTypeVegetationId3) {
		this.pourcentageTypeVegetationId3 = pourcentageTypeVegetationId3;
	}

	public float getPourcentageTypeVegetationId4() {
		return pourcentageTypeVegetationId4;
	}

	public void setPourcentageTypeVegetationId4(float pourcentageTypeVegetationId4) {
		this.pourcentageTypeVegetationId4 = pourcentageTypeVegetationId4;
	}

	public List<TerrainMorphologie> getTerrainMorphologies() {
		return terrainMorphologies;
	}

	public void setTerrainMorphologies(List<TerrainMorphologie> terrainMorphologies) {
		this.terrainMorphologies = terrainMorphologies;
	}

	public float getPourcentageTypeVegetationId5() {
		return pourcentageTypeVegetationId5;
	}

	public void setPourcentageTypeVegetationId5(float pourcentageTypeVegetationId5) {
		this.pourcentageTypeVegetationId5 = pourcentageTypeVegetationId5;
	}

	public List<TerrainTypeVegetation> getTerrainTypeVegetations() {
		return terrainTypeVegetations;
	}

	public void setTerrainTypeVegetations(List<TerrainTypeVegetation> terrainTypeVegetations) {
		this.terrainTypeVegetations = terrainTypeVegetations;
	}

	public TerrainTypeClotureIBusiness getTerrainTypeClotureIBusiness() {
		return terrainTypeClotureIBusiness;
	}

	public void setTerrainTypeClotureIBusiness(TerrainTypeClotureIBusiness terrainTypeClotureIBusiness) {
		this.terrainTypeClotureIBusiness = terrainTypeClotureIBusiness;
	}

	public TerrainTypeAbriIBusiness getTerrainTypeAbriIBusiness() {
		return terrainTypeAbriIBusiness;
	}

	public void setTerrainTypeAbriIBusiness(TerrainTypeAbriIBusiness terrainTypeAbriIBusiness) {
		this.terrainTypeAbriIBusiness = terrainTypeAbriIBusiness;
	}

	public TerrainTypeAbreuvoirIBusiness getTerrainTypeAbreuvoirIBusiness() {
		return terrainTypeAbreuvoirIBusiness;
	}

	public void setTerrainTypeAbreuvoirIBusiness(TerrainTypeAbreuvoirIBusiness terrainTypeAbreuvoirIBusiness) {
		this.terrainTypeAbreuvoirIBusiness = terrainTypeAbreuvoirIBusiness;
	}

	public TerrainTypeCloture getTerrainTypeCloture() {
		return terrainTypeCloture;
	}

	public void setTerrainTypeCloture(TerrainTypeCloture terrainTypeCloture) {
		this.terrainTypeCloture = terrainTypeCloture;
	}

	public TerrainTypeAbri getTerrainTypeAbri() {
		return terrainTypeAbri;
	}

	public void setTerrainTypeAbri(TerrainTypeAbri terrainTypeAbri) {
		this.terrainTypeAbri = terrainTypeAbri;
	}

	public TerrainTypeAbreuvoir getTerrainTypeAbreuvoir() {
		return terrainTypeAbreuvoir;
	}

	public void setTerrainTypeAbreuvoir(TerrainTypeAbreuvoir terrainTypeAbreuvoir) {
		this.terrainTypeAbreuvoir = terrainTypeAbreuvoir;
	}

	public TypeClotureManagedBean getMbTypeCloture() {
		return mbTypeCloture;
	}

	public void setMbTypeCloture(TypeClotureManagedBean mbTypeCloture) {
		this.mbTypeCloture = mbTypeCloture;
	}

	public TypeAbriManagedBean getMbTypeAbri() {
		return mbTypeAbri;
	}

	public void setMbTypeAbri(TypeAbriManagedBean mbTypeAbri) {
		this.mbTypeAbri = mbTypeAbri;
	}

	public TypeAbreuvoirManagedBean getMbTypeAbreuvoir() {
		return mbTypeAbreuvoir;
	}

	public void setMbTypeAbreuvoir(TypeAbreuvoirManagedBean mbTypeAbreuvoir) {
		this.mbTypeAbreuvoir = mbTypeAbreuvoir;
	}


}
