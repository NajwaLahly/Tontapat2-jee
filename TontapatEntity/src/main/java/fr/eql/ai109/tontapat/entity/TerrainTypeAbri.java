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
@Table(name = "terrain_type_abri")
public class TerrainTypeAbri implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_terrain_type_abri", nullable = false)
	private int id;

	@ManyToOne
	@JoinColumn(name = "id_terrain")
	private Terrain terrain;

	@ManyToOne
	@JoinColumn(name = "id_type_abri")
	private TypeAbri typeAbri;

	public TerrainTypeAbri() {
		super();
	}

	public TerrainTypeAbri(int id, Terrain terrain, TypeAbri typeAbri) {
		super();
		this.id = id;
		this.terrain = terrain;
		this.typeAbri = typeAbri;
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

	public TypeAbri getTypeAbri() {
		return typeAbri;
	}

	public void setTypeAbri(TypeAbri typeAbri) {
		this.typeAbri = typeAbri;
	}



}
