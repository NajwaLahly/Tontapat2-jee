package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;


@ManagedBean(name = "mbPrestation")
@RequestScoped
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private PrestationIBusiness prestationIBusiness;
	

    public String createPrestationOffer() {
        prestationIBusiness.createPrestationOffer();
        return "/utilisateur/offres/index.xhtml?faces-redirection=false";

    }
    
}
