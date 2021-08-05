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
@Table(name = "evaluation")
public class Evaluation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evaluation", nullable = false)
	private int id;
	@Column(name = "note")
	private int note;
	@Column(name = "commentaire")
	private String commentaire;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_prestation")
	private Prestation prestation;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateurSource;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_utilisateur")
	private Utilisateur utilisateurCible;
	
	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evaluation(int id, int note, String commentaire, Prestation prestation, Utilisateur utilisateurSource,
			Utilisateur utilisateurCible) {
		super();
		this.id = id;
		this.note = note;
		this.commentaire = commentaire;
		this.prestation = prestation;
		this.utilisateurSource = utilisateurSource;
		this.utilisateurCible = utilisateurCible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	public Utilisateur getUtilisateurSource() {
		return utilisateurSource;
	}

	public void setUtilisateurSource(Utilisateur utilisateurSource) {
		this.utilisateurSource = utilisateurSource;
	}

	public Utilisateur getUtilisateurCible() {
		return utilisateurCible;
	}

	public void setUtilisateurCible(Utilisateur utilisateurCible) {
		this.utilisateurCible = utilisateurCible;
	}
	
	
	
}