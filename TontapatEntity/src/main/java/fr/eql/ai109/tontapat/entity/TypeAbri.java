package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "type_abri")
public class TypeAbri implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_abri", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "typeAbri")
	Set<TerrainTypeAbri> terrainsTypeAbri;
	//private Set<Terrain> terrains;
	
	public TypeAbri() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeAbri(int id, String nom, Set<TerrainTypeAbri> terrainsTypeAbri, Set<Terrain> terrains) {
		super();
		this.id = id;
		this.nom = nom;
		this.terrainsTypeAbri = terrainsTypeAbri;
	//	this.terrains = terrains;
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

	public Set<TerrainTypeAbri> getTerrainsTypeAbri() {
		return terrainsTypeAbri;
	}

	public void setTerrainsTypeAbri(Set<TerrainTypeAbri> terrainsTypeAbri) {
		this.terrainsTypeAbri = terrainsTypeAbri;
	}

	//public Set<Terrain> getTerrains() {
	//	return terrains;
	//}

	//public void setTerrains(Set<Terrain> terrains) {
	//	this.terrains = terrains;
	//}


	
}
