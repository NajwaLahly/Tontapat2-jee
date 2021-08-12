package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import fr.eql.ai109.tontapat.entity.Morphologie;
import fr.eql.ai109.tontapat.ibusiness.MorphologieIBusiness;

@ManagedBean(name = "mbMorphologie")
@RequestScoped
public class MorphologieManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int morphologieId;
	private List<Morphologie> morphologies;
	
	@EJB
	private MorphologieIBusiness morphologieIBusiness;
	
	@PostConstruct
	public void init() {
		setMorphologies(showAll());
	}
	
	public List<Morphologie> showAll(){
		return morphologieIBusiness.findAll();		
	}

	public Morphologie showById(int id) {
		return morphologieIBusiness.findById(id);
	}
	
	

	//*********Getter Setter*********
	public void setMorphologies(List<Morphologie> morphologies) {
		this.morphologies = morphologies;
	}
	
	public List<Morphologie> getMorphologies() {
		return morphologies;
	}

	public int getMorphologieId() {
		return morphologieId;
	}

	public void setMorphologieId(int morphologieId) {
		this.morphologieId = morphologieId;
	}

	

}
