package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Evaluation;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.EvaluationIBusiness;

@ManagedBean(name = "mbEvaluation")
@SessionScoped
public class EvaluationManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private EvaluationIBusiness evaluationIBusiness;
	
	@ManagedProperty(value = "#{mbUtilisateur.utilisateur}")
	private Utilisateur utilisateurConnecte;
	
	@ManagedProperty(value = "#{mbPrestation.prestation}")
	private Prestation currentPrestation;
	
	Evaluation evaluation = new Evaluation();
	private int note;
	private String commentaire;
	
	public String add() {
		Evaluation evaluation = new Evaluation();
		
		evaluation.setPrestation(currentPrestation);
		evaluation.setUtilisateurSource(utilisateurConnecte);
		
		if(currentPrestation.getTerrain().getUtilisateur().getId() == utilisateurConnecte.getId())
		evaluation.setUtilisateurCible(currentPrestation.getTroupeau().getUtilisateur());
		
		else if(currentPrestation.getTroupeau().getUtilisateur().getId() == utilisateurConnecte.getId())
			evaluation.setUtilisateurCible(currentPrestation.getTerrain().getUtilisateur());
	
		else return null;
		
		evaluation.setNote(note);
		evaluation.setCommentaire(commentaire);
		
		evaluationIBusiness.add(evaluation);
		return "/utilisateur/prestations/details.xhtml?id=" + currentPrestation.getId();
	}
	
	public List<Evaluation> showAllByOffreId(int id) {
		return evaluationIBusiness.findAllByOffreId(id);
	}

	public Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}

	public Prestation getCurrentPrestation() {
		return currentPrestation;
	}

	public void setCurrentPrestation(Prestation currentPrestation) {
		this.currentPrestation = currentPrestation;
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
	
}
