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
@Table(name = "race")
public class Race implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_race", nullable = false)
	private int id;
	@Column(name = "nom")
	private String nom;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_espece")
	private Espece espece;
	
	public Race() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Race(int id, String nom, Espece espece) {
		super();
		this.id = id;
		this.nom = nom;
		this.espece = espece;
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

	public Espece getEspece() {
		return espece;
	}

	public void setEspece(Espece espece) {
		this.espece = espece;
	}
	
	
}
