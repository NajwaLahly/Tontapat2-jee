package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "terrain_type_vegetation")
public class TerrainTypeVegetation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terrain_type_vege", nullable = false)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_terrain")
	private Terrain terrain;
	
	@ManyToOne
	@JoinColumn(name = "id_type_vegetation")
	private TypeVegetation typeVegetation;
	
	@Column(name = "pourcentage")
	private float pourcentage;

	public TerrainTypeVegetation() {
		super();
	}

	public TerrainTypeVegetation(int id, Terrain terrain, TypeVegetation typeVegetation, float pourcentage) {
		super();
		this.id = id;
		this.terrain = terrain;
		this.typeVegetation = typeVegetation;
		this.pourcentage = pourcentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public TypeVegetation getTypeVegetation() {
		return typeVegetation;
	}

	public void setTypeVegetation(TypeVegetation typeVegetation) {
		this.typeVegetation = typeVegetation;
	}

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}

	
	
	
}
	