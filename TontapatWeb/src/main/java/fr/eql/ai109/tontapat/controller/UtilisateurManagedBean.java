package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.UtilisateurIBusiness;



@ManagedBean(name = "mbUtilisateur")
@SessionScoped
public class UtilisateurManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String email;
	private String motDePasse;
	private Utilisateur utilisateur;
	
	@EJB
	private UtilisateurIBusiness utilisateurIBusiness;
	
	public String connect() {
		String forward = null;
		utilisateur = utilisateurIBusiness.connection(email, motDePasse);
		if (utilisateur != null) {
			System.out.println("good");
			forward = "/page_accueil.xhtml?faces-redirection=true";
		} else {
			System.out.println("pas good");
			FacesMessage facesMessage = new FacesMessage(
					FacesMessage.SEVERITY_WARN,
					"Identifiant et/ou mot de passe incorrect(s)",
					"Identifiant et/ou mot de passe incorrect(s)"
					);
			FacesContext.getCurrentInstance().addMessage("loginForm:inpEmail", facesMessage);
			FacesContext.getCurrentInstance().addMessage("loginForm:inpMotDePasse", facesMessage);
			forward = "/connexion.xhtml?faces-redirection=false";
		}
		return forward;
	}
	

	public String disconnect() {
		HttpSession session = (HttpSession) FacesContext
				.getCurrentInstance()
				.getExternalContext()
				.getSession(true);
		session.invalidate();
		email = "";
		motDePasse = "";
		utilisateur = new Utilisateur();
		return "/connexion.xhtml?faces-redirection=true";
	}
	
	
	public List<Utilisateur> showAll(){
		return utilisateurIBusiness.findAll(); 
	}
	
	public void test() {
		System.out.println("test");
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


}

