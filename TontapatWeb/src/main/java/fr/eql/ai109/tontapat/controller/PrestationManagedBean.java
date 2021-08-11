package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;


@ManagedBean(name = "mbPrestation")
@RequestScoped
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private PrestationIBusiness prestationIBusiness;


	public String createPrestationOffer() {
		prestationIBusiness.createPrestationOffer();		
		return "/reservation/template_recapitulatif.xhtml?faces-redirection=false";
	}





}
