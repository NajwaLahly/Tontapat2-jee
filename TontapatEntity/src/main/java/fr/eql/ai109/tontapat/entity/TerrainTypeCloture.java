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
@Table(name = "terrain_type_cloture")
public class TerrainTypeCloture implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terrain_type_clot", nullable = false)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_terrain")
	private Terrain terrain;
	
	@ManyToOne
	@JoinColumn(name = "id_type_cloture")
	private TypeCloture typeCloture;

	public TerrainTypeCloture() {
		super();
	}

	public TerrainTypeCloture(int id, Terrain terrain, TypeCloture typeCloture) {
		super();
		this.id = id;
		this.terrain = terrain;
		this.typeCloture = typeCloture;
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

	public TypeCloture getTypeCloture() {
		return typeCloture;
	}

	public void setTypeCloture(TypeCloture typeCloture) {
		this.typeCloture = typeCloture;
	}
	
	
	
	
	
}