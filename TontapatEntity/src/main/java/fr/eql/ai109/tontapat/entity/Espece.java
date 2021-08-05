package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "espece")
public class Espece implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_espece", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@ManyToMany
	@JoinTable(
			name = "espece_type_vegetation",
			joinColumns = @JoinColumn(name = "id_espece"),
			inverseJoinColumns = @JoinColumn(name = "id_type_vegetation"))
	Set<TypeVegetation> typesVegetation;
	@ManyToMany
	@JoinTable(
			name = "espece_morphologie",
			joinColumns = @JoinColumn(name = "id_espece"),
			inverseJoinColumns = @JoinColumn(name = "id_morphologie"))
	Set<Morphologie> morphologies;
	@OneToMany(mappedBy = "espece", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Race> races;
	
	public Espece() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Espece(int id, String nom, Set<TypeVegetation> typesVegetation, Set<Morphologie> morphologies,
			Set<Race> races) {
		super();
		this.id = id;
		this.nom = nom;
		this.typesVegetation = typesVegetation;
		this.morphologies = morphologies;
		this.races = races;
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

	public Set<TypeVegetation> getTypesVegetation() {
		return typesVegetation;
	}

	public void setTypesVegetation(Set<TypeVegetation> typesVegetation) {
		this.typesVegetation = typesVegetation;
	}

	public Set<Morphologie> getMorphologies() {
		return morphologies;
	}

	public void setMorphologies(Set<Morphologie> morphologies) {
		this.morphologies = morphologies;
	}

	public Set<Race> getRaces() {
		return races;
	}

	public void setRaces(Set<Race> races) {
		this.races = races;
	}
	
	
	
}
