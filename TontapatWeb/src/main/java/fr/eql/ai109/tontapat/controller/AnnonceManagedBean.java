package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.ibusiness.AnnonceIBusiness;

@ManagedBean(name = "mbAnnonce")
@SessionScoped
public class AnnonceManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private AnnonceIBusiness annonceIBusiness;
	
	public List<Annonce> ShowAll(){
		return annonceIBusiness.findAll();
	}

}
