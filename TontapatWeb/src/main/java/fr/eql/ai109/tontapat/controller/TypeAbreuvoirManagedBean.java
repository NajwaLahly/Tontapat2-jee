package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.TypeAbreuvoir;
import fr.eql.ai109.tontapat.ibusiness.TypeAbreuvoirIBusiness;

@ManagedBean(name = "mbTypeAbreuvoir")
@SessionScoped
public class TypeAbreuvoirManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int typeAbreuvoirId;
	private List<TypeAbreuvoir> typeAbreuvoirs;
	
	@EJB
	private TypeAbreuvoirIBusiness typeAbreuvoirIBusiness;
	
	@PostConstruct
	public void init() {
		setTypeAbreuvoirs(showAll());
	}
	
	public List<TypeAbreuvoir> showAll(){
		return typeAbreuvoirIBusiness.findAll();		
	}


	//public TypeAbreuvoir showById(int id) {
	//	return typeAbreuvoirIBusiness.findById(id);
	//}
	
	

	//*********Getter Setter*********
	public int getTypeAbreuvoirId() {
		return typeAbreuvoirId;
	}

	public void setTypeAbreuvoirId(int typeAbreuvoirId) {
		this.typeAbreuvoirId = typeAbreuvoirId;
	}

	public List<TypeAbreuvoir> getTypeAbreuvoirs() {
		return typeAbreuvoirs;
	}

	public void setTypeAbreuvoirs(List<TypeAbreuvoir> typeAbreuvoirs) {
		this.typeAbreuvoirs = typeAbreuvoirs;
	}

	public TypeAbreuvoirIBusiness getTypeAbreuvoirIBusiness() {
		return typeAbreuvoirIBusiness;
	}

	public void setTypeAbreuvoirIBusiness(TypeAbreuvoirIBusiness typeAbreuvoirIBusiness) {
		this.typeAbreuvoirIBusiness = typeAbreuvoirIBusiness;
	}
	
}
