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
@Table(name = "terrain_morphologie")
public class TerrainMorphologie implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terrain_morph", nullable = false)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_terrain")
	private Terrain terrain;
	
	@ManyToOne
	@JoinColumn(name = "id_morphologie")
	private Morphologie morphologie;
	
	@Column(name = "pourcentage")
	private float pourcentage;

	public TerrainMorphologie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TerrainMorphologie(int id, Terrain terrain, Morphologie morphologie, float pourcentage) {
		super();
		this.id = id;
		this.terrain = terrain;
		this.morphologie = morphologie;
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

	public Morphologie getMorphologie() {
		return morphologie;
	}

	public void setMorphologie(Morphologie morphologie) {
		this.morphologie = morphologie;
	}

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	
}