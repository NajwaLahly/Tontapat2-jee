package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "morphologie")
public class Morphologie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_morphologie", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "morphologie")
	Set<TerrainMorphologie> terrainsMorphologie;
	@ManyToMany(mappedBy = "morphologies")
	Set<Espece> especes;
	
	public Morphologie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Morphologie(int id, String nom, Set<TerrainMorphologie> terrainsMorphologie, Set<Espece> especes) {
		super();
		this.id = id;
		this.nom = nom;
		this.terrainsMorphologie = terrainsMorphologie;
		this.especes = especes;
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

	public Set<TerrainMorphologie> getTerrainsMorphologie() {
		return terrainsMorphologie;
	}

	public void setTerrainsMorphologie(Set<TerrainMorphologie> terrainsMorphologie) {
		this.terrainsMorphologie = terrainsMorphologie;
	}

	public Set<Espece> getEspeces() {
		return especes;
	}

	public void setEspeces(Set<Espece> especes) {
		this.especes = especes;
	}
	
	
}
