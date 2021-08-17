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
@Table(name = "type_cloture")
public class TypeCloture implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_cloture", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "typeCloture")
	Set<TerrainTypeCloture> terrainsTypeCloture;
	//private Set<Terrain> terrains;
	
	public TypeCloture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeCloture(int id, String nom, Set<TerrainTypeCloture> terrainsTypeCloture, Set<Terrain> terrains) {
		super();
		this.id = id;
		this.nom = nom;
		this.terrainsTypeCloture = terrainsTypeCloture;
		//this.terrains = terrains;
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

	public Set<TerrainTypeCloture> getTerrainsTypeCloture() {
		return terrainsTypeCloture;
	}

	public void setTerrainsTypeCloture(Set<TerrainTypeCloture> terrainsTypeCloture) {
		this.terrainsTypeCloture = terrainsTypeCloture;
	}

	//public Set<Terrain> getTerrains() {
	//	return terrains;
	//}

	//public void setTerrains(Set<Terrain> terrains) {
	//	this.terrains = terrains;
	//}

}
