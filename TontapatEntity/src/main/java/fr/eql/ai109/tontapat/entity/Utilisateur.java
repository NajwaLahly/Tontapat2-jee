package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utilisateur", nullable = false)
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "mot_de_passe")
	private String motDePasse;
	@Column(name = "date_naissance")
	private Date dateNaissance;
	@Column(name = "date_inscription")
	private Date dateInscription;
	@Column(name = "photo_profil")
	private String photoProfil;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "raison_sociale")
	private String raisonSociale;
	@Column(name = "adresse_voie")
	private String adresseVoie;
	@Column(name = "adresse_long")
	private float adresseLong;
	@Column(name = "adresse_lat")
	private float adresseLat;
	@Column(name = "carte_numero")
	private String carteNumero;
	@Column(name = "carte_expiration")
	private Date carteExpiration;
	@Column(name = "carte_cvc")
	private String carteCVC;
	@Column(name = "virement_iban")
	private String virementIBAN;
	@Column(name = "virement_bic")
	private String virementBIC;
	@Column(name = "paypal_email")
	private String paypalEmail;
	@Column(name = "date_desactivation")
	private Date dateDesactivation;
	@Column(name = "date_modification")
	private Date dateModification;
	@Column(name = "texte_presentation")
	private String textePresentation;
	@Column(name = "numero_telephone")
	private String numeroTelephone;
	@ManyToOne
	@JoinColumn(referencedColumnName = "id_type_utilisateur")
	private TypeUtilisateur typeUtilisateur;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Terrain> terrains;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Troupeau> troupeaux;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Proposition> propositions;
	@OneToMany(mappedBy = "utilisateurSource", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Evaluation> evaluationsFaites;
	@OneToMany(mappedBy = "utilisateurCible", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Evaluation> evaluationsRecues;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Reclamation> reclamations;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(int id, String email, String motDePasse, Date dateNaissance, Date dateInscription,
			String photoProfil, String nom, String prenom, String raisonSociale, String adresseVoie, float adresseLong,
			float adresseLat, String carteNumero, Date carteExpiration, String carteCVC, String virementIBAN,
			String virementBIC, String paypalEmail, Date dateDesactivation, Date dateModification,
			String textePresentation, String numeroTelephone, TypeUtilisateur typeUtilisateur, Set<Terrain> terrains,
			Set<Troupeau> troupeaux, Set<Proposition> propositions, Set<Evaluation> evaluationsFaites,
			Set<Evaluation> evaluationsRecues, Set<Reclamation> reclamations) {
		super();
		this.id = id;
		this.email = email;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
		this.dateInscription = dateInscription;
		this.photoProfil = photoProfil;
		this.nom = nom;
		this.prenom = prenom;
		this.raisonSociale = raisonSociale;
		this.adresseVoie = adresseVoie;
		this.adresseLong = adresseLong;
		this.adresseLat = adresseLat;
		this.carteNumero = carteNumero;
		this.carteExpiration = carteExpiration;
		this.carteCVC = carteCVC;
		this.virementIBAN = virementIBAN;
		this.virementBIC = virementBIC;
		this.paypalEmail = paypalEmail;
		this.dateDesactivation = dateDesactivation;
		this.dateModification = dateModification;
		this.textePresentation = textePresentation;
		this.numeroTelephone = numeroTelephone;
		this.typeUtilisateur = typeUtilisateur;
		this.terrains = terrains;
		this.troupeaux = troupeaux;
		this.propositions = propositions;
		this.evaluationsFaites = evaluationsFaites;
		this.evaluationsRecues = evaluationsRecues;
		this.reclamations = reclamations;
	}
	
	public Utilisateur (int id, String email, String motDePasse) {
		super();
		this.id = id;
		this.email = email;
		this.motDePasse = motDePasse;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getPhotoProfil() {
		return photoProfil;
	}

	public void setPhotoProfil(String photoProfil) {
		this.photoProfil = photoProfil;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getAdresseVoie() {
		return adresseVoie;
	}

	public void setAdresseVoie(String adresseVoie) {
		this.adresseVoie = adresseVoie;
	}

	public float getAdresseLong() {
		return adresseLong;
	}

	public void setAdresseLong(float adresseLong) {
		this.adresseLong = adresseLong;
	}

	public float getAdresseLat() {
		return adresseLat;
	}

	public void setAdresseLat(float adresseLat) {
		this.adresseLat = adresseLat;
	}

	public String getCarteNumero() {
		return carteNumero;
	}

	public void setCarteNumero(String carteNumero) {
		this.carteNumero = carteNumero;
	}

	public Date getCarteExpiration() {
		return carteExpiration;
	}

	public void setCarteExpiration(Date carteExpiration) {
		this.carteExpiration = carteExpiration;
	}

	public String getCarteCVC() {
		return carteCVC;
	}

	public void setCarteCVC(String carteCVC) {
		this.carteCVC = carteCVC;
	}

	public String getVirementIBAN() {
		return virementIBAN;
	}

	public void setVirementIBAN(String virementIBAN) {
		this.virementIBAN = virementIBAN;
	}

	public String getVirementBIC() {
		return virementBIC;
	}

	public void setVirementBIC(String virementBIC) {
		this.virementBIC = virementBIC;
	}

	public String getPaypalEmail() {
		return paypalEmail;
	}

	public void setPaypalEmail(String paypalEmail) {
		this.paypalEmail = paypalEmail;
	}

	public Date getDateDesactivation() {
		return dateDesactivation;
	}

	public void setDateDesactivation(Date dateDesactivation) {
		this.dateDesactivation = dateDesactivation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public String getTextePresentation() {
		return textePresentation;
	}

	public void setTextePresentation(String textePresentation) {
		this.textePresentation = textePresentation;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public Set<Terrain> getTerrains() {
		return terrains;
	}

	public void setTerrains(Set<Terrain> terrains) {
		this.terrains = terrains;
	}

	public Set<Troupeau> getTroupeaux() {
		return troupeaux;
	}

	public void setTroupeaux(Set<Troupeau> troupeaux) {
		this.troupeaux = troupeaux;
	}

	public Set<Proposition> getPropositions() {
		return propositions;
	}

	public void setPropositions(Set<Proposition> propositions) {
		this.propositions = propositions;
	}

	public Set<Evaluation> getEvaluationsFaites() {
		return evaluationsFaites;
	}

	public void setEvaluationsFaites(Set<Evaluation> evaluationsFaites) {
		this.evaluationsFaites = evaluationsFaites;
	}

	public Set<Evaluation> getEvaluationsRecues() {
		return evaluationsRecues;
	}

	public void setEvaluationsRecues(Set<Evaluation> evaluationsRecues) {
		this.evaluationsRecues = evaluationsRecues;
	}

	public Set<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}
	
	
	
	
}