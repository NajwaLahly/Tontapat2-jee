package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.Espece;
import fr.eql.ai109.tontapat.ibusiness.EspeceIBusiness;

@ManagedBean(name = "mbEspece")
@SessionScoped
public class EspeceManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int especeId;
	private List<Espece> especes;

	@EJB
	private EspeceIBusiness especeIBusiness;

	@PostConstruct
	public void init() {
		setEspeces(ShowAll());
	}

	private List<Espece> ShowAll() {
		return especeIBusiness.findAll();
	}
	
	public Espece showById(int id) {
		return especeIBusiness.findById(id);
	}

	
	
	//*********Getter Setter*********
	public List<Espece> getEspeces() {
		return especes;
	}

	public void setEspeces(List<Espece> especes) {
		this.especes = especes;
	}

	public int getEspeceId() {
		return especeId;
	}

	public void setEspeceId(int especeId) {
		this.especeId = especeId;
	}

}