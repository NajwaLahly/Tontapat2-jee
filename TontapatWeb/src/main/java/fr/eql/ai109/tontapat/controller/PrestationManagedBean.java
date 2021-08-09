package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.OffreIBusiness;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;

public class PrestationManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private PrestationIBusiness prestationIBusiness;

	public void createPrestation() {
		Prestation prestation = new Prestation(); 
		Offre offre = new Offre(); 
		offre.getId(); 
		prestation.setOffre(offre);
		prestation.setDateReservation(new Date());
	}
}
