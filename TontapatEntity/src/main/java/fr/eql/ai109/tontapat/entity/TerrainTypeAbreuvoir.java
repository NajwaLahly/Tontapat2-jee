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
@Table(name = "terrain_type_abreuvoir")
public class TerrainTypeAbreuvoir implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terrain_type_abre", nullable = false)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_terrain")
	private Terrain terrain;
	
	@ManyToOne
	@JoinColumn(name = "id_type_abreuvoir")
	private TypeAbreuvoir typeAbreuvoir;

	public TerrainTypeAbreuvoir() {
		super();
	}

	public TerrainTypeAbreuvoir(int id, Terrain terrain, TypeAbreuvoir typeAbreuvoir) {
		super();
		this.id = id;
		this.terrain = terrain;
		this.typeAbreuvoir = typeAbreuvoir;
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

	public TypeAbreuvoir getTypeAbreuvoir() {
		return typeAbreuvoir;
	}

	public void setTypeAbreuvoir(TypeAbreuvoir typeAbreuvoir) {
		this.typeAbreuvoir = typeAbreuvoir;
	}
	
	
	

}
