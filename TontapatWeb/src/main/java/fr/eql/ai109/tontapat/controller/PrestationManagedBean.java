package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;


@ManagedBean(name = "mbPrestation")
@RequestScoped
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	@ManagedProperty(value="#{mbOffre.offre}")
	private Offre offreReservee; 
	@EJB
	private PrestationIBusiness prestationIBusiness;


	public String createPrestationOffer() {
		System.out.println("ok");
		System.out.println(offreReservee.getDescription());
//		prestationIBusiness.createPrestationOffer(offreReservee);
		return null; 

	}
}
