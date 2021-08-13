package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import javax.faces.context.FacesContext;


import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;

@ManagedBean(name = "mbPrestation")
@RequestScoped
public class PrestationManagedBean  implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private PrestationIBusiness prestationIBusiness;

	public String createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin,OffreDTO prix) {
		prestationIBusiness.createPrestationOffer(offre,idTerrain,debut, fin, prix.getPrixTotal());
		return "/reservation/template_recapitulatif.xhtml";

	}
}
