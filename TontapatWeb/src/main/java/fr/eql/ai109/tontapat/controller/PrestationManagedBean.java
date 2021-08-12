package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.OffreSearchIBusiness;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;


@ManagedBean(name = "mbPrestation")
@RequestScoped
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{mbOffre.id}")
	private int idOffreReservee;
	
	@ManagedProperty(value = "#{mbOffreSearch.searchDateDebut}")
	private Date searchDateDebut;
	
	@ManagedProperty(value = "#{mbOffreSearch.searchDateFin}")
	private Date searchDateFin;
	
	@ManagedProperty(value = "#{mbOffreSearch.searchInstallationAssuree}")
	private Boolean searchInstallationAssuree;
	

	@EJB
	private PrestationIBusiness prestationIBusiness;

	public String createPrestationOffer() {
		
		Prestation prestation = new Prestation(); 
		prestation.setDateReservation(new Date());

		String numRes = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString();
		String idOffreARes = String.valueOf(idOffreReservee);
		prestation.setNumReservation(numRes.concat(idOffreARes));
		
		prestation.setDateApportTroupeau(getSearchDateDebut());
		prestation.setDateRecuperationTroupeau(getSearchDateFin());

		prestationIBusiness.createPrestationOffer(prestation);		
		return "/reservation/template_recapitulatif.xhtml";
	}

	
	public int getIdOffreReservee() {
		return idOffreReservee;
	}


	public void setIdOffreReservee(int idOffreReservee) {
		this.idOffreReservee = idOffreReservee;
	}


	public Date getSearchDateDebut() {
		return searchDateDebut;
	}


	public void setSearchDateDebut(Date searchDateDebut) {
		this.searchDateDebut = searchDateDebut;
	}


	public Date getSearchDateFin() {
		return searchDateFin;
	}


	public void setSearchDateFin(Date searchDateFin) {
		this.searchDateFin = searchDateFin;
	}


	public Boolean getSearchInstallationAssuree() {
		return searchInstallationAssuree;
	}


	public void setSearchInstallationAssuree(Boolean searchInstallationAssuree) {
		this.searchInstallationAssuree = searchInstallationAssuree;
	}
}
