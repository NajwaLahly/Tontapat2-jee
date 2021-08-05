package fr.eql.ai109.tontapat.entity;

import java.util.Date;

public class OffreSearch {
	private Terrain terrain;
	private Date dateDebut;
	private Date dateFin;
	private Espece espece;
	private Boolean installationAssuree;
	private float prixMaximum;
	
	public OffreSearch() {
		super();
	}
	
	public OffreSearch(Terrain terrain, Date dateDebut, Date dateFin, Espece espece, Boolean installationAssuree,
			float prixMaximum) {
		super();
		this.terrain = terrain;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.espece = espece;
		this.installationAssuree = installationAssuree;
		this.prixMaximum = prixMaximum;
	}
	
	public Terrain getTerrain() {
		return terrain;
	}
	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Espece getEspece() {
		return espece;
	}
	public void setEspece(Espece espece) {
		this.espece = espece;
	}
	public Boolean getInstallationAssuree() {
		return installationAssuree;
	}
	public void setInstallationAssuree(Boolean installationAssuree) {
		this.installationAssuree = installationAssuree;
	}
	public float getPrixMaximum() {
		return prixMaximum;
	}
	public void setPrixMaximum(float prixMaximum) {
		this.prixMaximum = prixMaximum;
	}
}
