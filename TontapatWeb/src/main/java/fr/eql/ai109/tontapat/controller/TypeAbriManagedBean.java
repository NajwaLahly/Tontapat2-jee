package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.TypeAbri;
import fr.eql.ai109.tontapat.ibusiness.TypeAbriIBusiness;

@ManagedBean(name = "mbTypeAbri")
@SessionScoped
public class TypeAbriManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int typeAbriId;
	private List<TypeAbri> typeAbris;
	
	@EJB
	private TypeAbriIBusiness typeAbriIBusiness;
	
	@PostConstruct
	public void init() {
		setTypeAbris(showAll());
	}
	
	public List<TypeAbri> showAll(){
		return typeAbriIBusiness.findAll();		
	}



	//public TypeAbri showById(int id) {
	//	return typeAbriIBusiness.findById(id);
	//}
	
	

	//*********Getter Setter*********

	public int getTypeAbriId() {
		return typeAbriId;
	}

	public void setTypeAbriId(int typeAbriId) {
		this.typeAbriId = typeAbriId;
	}

	public List<TypeAbri> getTypeAbris() {
		return typeAbris;
	}

	public void setTypeAbris(List<TypeAbri> typeAbris) {
		this.typeAbris = typeAbris;
	}

	public TypeAbriIBusiness getTypeAbriIBusiness() {
		return typeAbriIBusiness;
	}

	public void setTypeAbriIBusiness(TypeAbriIBusiness typeAbriIBusiness) {
		this.typeAbriIBusiness = typeAbriIBusiness;
	}

	
}
