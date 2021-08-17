package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "terrain")
@Entity
public class Terrain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terrain", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "superficie")
	private float superficie;
	@Column(name = "description")
	private String description;
	@Column(name = "date_ajout")
	private Date dateAjout;
	@Column(name = "adresse_lat")
	private float adresseLat;
	@Column(name = "adresse_long")
	private float adresseLong;
	@Column(name = "adresse_voie")
	private String adresseVoie;
	@Column(name = "date_retrait")
	private Date dateRetrait;
	@OneToMany(mappedBy = "terrain", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Annonce> annonces;
	@OneToMany(mappedBy = "terrain", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Prestation> prestations;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateur;
//	@ManyToMany
//	@JoinTable(
//			name = "terrain_morphologie",
//			joinColumns = @JoinColumn(name = "id_terrain"),
//			inverseJoinColumns = @JoinColumn(name = "id_morphologie"))
	@OneToMany(mappedBy = "terrain")
	Set<TerrainMorphologie> terrainMorphologies;
	//@ManyToMany(fetch = FetchType.EAGER)
	//@JoinTable(
	//		name = "terrain_type_vegetation",
	//		joinColumns = @JoinColumn(name = "id_terrain"),
	//		inverseJoinColumns = @JoinColumn(name = "id_type_vegetation"))
	@OneToMany(mappedBy = "terrain")
	Set<TerrainTypeVegetation> terrainTypesVegetation;
	//Set<TypeVegetation> typesVegetation;
	@ManyToMany
	@JoinTable(
			name = "terrain_type_cloture",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_type_cloture"))
	Set<TypeCloture> typesCloture;
	@ManyToMany
	@JoinTable(
			name = "terrain_type_abri",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_type_abri"))
	Set<TypeAbri> typesAbri;
	@ManyToMany
	@JoinTable(
			name = "terrain_type_abreuvoir",
			joinColumns = @JoinColumn(name = "id_terrain"),
			inverseJoinColumns = @JoinColumn(name = "id_type_abreuvoir"))
	Set<TypeAbreuvoir> typesAbreuvoir;
	
	public Terrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Terrain(int id, String nom, float superficie, String description, Date dateAjout, float adresseLat,
			float adresseLong, String adresseVoie, Date dateRetrait, Set<Annonce> annonces, Set<Prestation> prestations,
			Utilisateur utilisateur, Set<TerrainMorphologie> terrainMorphologies,
			Set<TerrainTypeVegetation> terrainTypesVegetation,
			Set<TypeCloture> typesCloture, Set<TypeAbri> typesAbri, Set<TypeAbreuvoir> typesAbreuvoir) {
		super();
		this.id = id;
		this.nom = nom;
		this.superficie = superficie;
		this.description = description;
		this.dateAjout = dateAjout;
		this.adresseLat = adresseLat;
		this.adresseLong = adresseLong;
		this.adresseVoie = adresseVoie;
		this.dateRetrait = dateRetrait;
		this.annonces = annonces;
		this.prestations = prestations;
		this.utilisateur = utilisateur;
		this.terrainMorphologies = terrainMorphologies;
		this.terrainTypesVegetation = terrainTypesVegetation;
		//this.typesVegetation = typesVegetation;
		this.typesCloture = typesCloture;
		this.typesAbri = typesAbri;
		this.typesAbreuvoir = typesAbreuvoir;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public float getAdresseLat() {
		return adresseLat;
	}

	public void setAdresseLat(float adresseLat) {
		this.adresseLat = adresseLat;
	}

	public float getAdresseLong() {
		return adresseLong;
	}

	public void setAdresseLong(float adresseLong) {
		this.adresseLong = adresseLong;
	}

	public String getAdresseVoie() {
		return adresseVoie;
	}

	public void setAdresseVoie(String adresseVoie) {
		this.adresseVoie = adresseVoie;
	}

	public Date getDateRetrait() {
		return dateRetrait;
	}

	public void setDateRetrait(Date dateRetrait) {
		this.dateRetrait = dateRetrait;
	}

	public Set<Annonce> getAnnonces() {
		return annonces;
	}

	public void setAnnonces(Set<Annonce> annonces) {
		this.annonces = annonces;
	}

	public Set<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Set<TerrainMorphologie> getTerrainMorphologies() {
		return terrainMorphologies;
	}

	public void setTerrainMorphologies(Set<TerrainMorphologie> terrainMorphologies) {
		this.terrainMorphologies = terrainMorphologies;
	}

	//public Set<TypeVegetation> getTypesVegetation() {
	//	return typesVegetation;
	//}

	//public void setTypesVegetation(Set<TypeVegetation> typesVegetation) {
	//	this.typesVegetation = typesVegetation;
	//}

	public Set<TypeCloture> getTypesCloture() {
		return typesCloture;
	}

	public void setTypesCloture(Set<TypeCloture> typesCloture) {
		this.typesCloture = typesCloture;
	}

	public Set<TypeAbri> getTypesAbri() {
		return typesAbri;
	}

	public void setTypesAbri(Set<TypeAbri> typesAbri) {
		this.typesAbri = typesAbri;
	}

	public Set<TypeAbreuvoir> getTypesAbreuvoir() {
		return typesAbreuvoir;
	}

	public void setTypesAbreuvoir(Set<TypeAbreuvoir> typesAbreuvoir) {
		this.typesAbreuvoir = typesAbreuvoir;
	}

	public Set<TerrainTypeVegetation> getTerrainTypesVegetation() {
		return terrainTypesVegetation;
	}

	public void setTerrainTypesVegetation(Set<TerrainTypeVegetation> terrainTypesVegetation) {
		this.terrainTypesVegetation = terrainTypesVegetation;
	}
	
	
	
}