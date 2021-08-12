package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import java.util.Date;

public class OffreDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Offre offre;
	private OffreSearch search;
	private Date dateApportTroupeau;
	private Date dateRetraitTroupeau;
	private Date dateDebutInstallation;
	private Date dateFinInstallation;
	private Date dateDebutDesinstallation;
	private Date dateFinDesinstallation;
	private int nombreBetes;
	private float fraisInstallation;
	private float fraisIntervention;
	private float fraisBetail;
	private float fraisService;
	private float TVA;
	private float prixTotal;
	private int id;
	
	public Date getDateApportTroupeau() {
		return dateApportTroupeau;
	}
	public void setDateApportTroupeau(Date dateApportTroupeau) {
		this.dateApportTroupeau = dateApportTroupeau;
	}
	public Date getDateRetraitTroupeau() {
		return dateRetraitTroupeau;
	}
	public void setDateRetraitTroupeau(Date dateRetraitTroupeau) {
		this.dateRetraitTroupeau = dateRetraitTroupeau;
	}
	public Date getDateDebutInstallation() {
		return dateDebutInstallation;
	}
	public void setDateDebutInstallation(Date dateDebutInstallation) {
		this.dateDebutInstallation = dateDebutInstallation;
	}
	public Date getDateFinInstallation() {
		return dateFinInstallation;
	}
	public void setDateFinInstallation(Date dateFinInstallation) {
		this.dateFinInstallation = dateFinInstallation;
	}
	public Date getDateDebutDesinstallation() {
		return dateDebutDesinstallation;
	}
	public void setDateDebutDesinstallation(Date dateDebutDesinstallation) {
		this.dateDebutDesinstallation = dateDebutDesinstallation;
	}
	public Date getDateFinDesinstallation() {
		return dateFinDesinstallation;
	}
	public void setDateFinDesinstallation(Date dateFinDesinstallation) {
		this.dateFinDesinstallation = dateFinDesinstallation;
	}
	public float getFraisInstallation() {
		return fraisInstallation;
	}
	public void setFraisInstallation(float fraisInstallation) {
		this.fraisInstallation = fraisInstallation;
	}
	public float getFraisIntervention() {
		return fraisIntervention;
	}
	public void setFraisIntervention(float fraisIntervention) {
		this.fraisIntervention = fraisIntervention;
	}
	public float getFraisBetail() {
		return fraisBetail;
	}
	public void setFraisBetail(float fraisBetail) {
		this.fraisBetail = fraisBetail;
	}
	public float getFraisService() {
		return fraisService;
	}
	public void setFraisService(float fraisService) {
		this.fraisService = fraisService;
	}
	public float getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}
	public Offre getOffre() {
		return offre;
	}
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
	public OffreSearch getSearch() {
		return search;
	}
	public void setSearch(OffreSearch search) {
		this.search = search;
	}
	public int getNombreBetes() {
		return nombreBetes;
	}
	public void setNombreBetes(int nombreBetes) {
		this.nombreBetes = nombreBetes;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTVA() {
		return TVA;
	}
	public void setTVA(float tVA) {
		TVA = tVA;
	}
}
