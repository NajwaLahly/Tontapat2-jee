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
@Table(name = "type_vegetation")
public class TypeVegetation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_vegetation", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "typeVegetation")
	Set<TerrainTypeVegetation> terrainsTypeVegetation;
	@ManyToMany(mappedBy = "typesVegetation")
	Set<Espece> especes;
	
	public TypeVegetation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeVegetation(int id, String nom, Set<TerrainTypeVegetation> terrainsTypeVegetation, Set<Espece> especes) {
		super();
		this.id = id;
		this.nom = nom;
		this.terrainsTypeVegetation = terrainsTypeVegetation;
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

	public Set<TerrainTypeVegetation> getTerrainsTypeVegetation() {
		return terrainsTypeVegetation;
	}

	public void setTerrains(Set<TerrainTypeVegetation> terrainsTypeVegetation) {
		this.terrainsTypeVegetation = terrainsTypeVegetation;
	}

	public Set<Espece> getEspeces() {
		return especes;
	}

	public void setEspeces(Set<Espece> especes) {
		this.especes = especes;
	}
	
	
	
}
