package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.ibusiness.OffreIBusiness;

@ManagedBean(name = "mbOffre")
@SessionScoped
public class OffreManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private OffreIBusiness offreIBusiness;
	
	public List<Offre> ShowAll() {
		return offreIBusiness.findAll();
	}
}
