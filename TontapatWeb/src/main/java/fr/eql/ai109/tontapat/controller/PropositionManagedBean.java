package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Proposition;
import fr.eql.ai109.tontapat.ibusiness.PropositionIBusiness;

/**
 * @author Val
 *
 */
@ManagedBean(name = "mbProposition")
@SessionScoped
public class PropositionManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private PropositionIBusiness propositionIBusiness;

	public List<Proposition> showAllByPrestationId(int id) {
		System.out.println("PRESTATION ID MB : " + id);
		return propositionIBusiness.findAllByPrestationId(id);
	}
	
	public Proposition showById(int id) {
		return propositionIBusiness.findById(id);
	}

}
