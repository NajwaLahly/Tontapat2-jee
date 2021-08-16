package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.TypeCloture;
import fr.eql.ai109.tontapat.ibusiness.TypeClotureIBusiness;

@ManagedBean(name = "mbTypeCloture")
@SessionScoped
public class TypeClotureManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int typeClotureId;
	private List<TypeCloture> typeClotures;
	
	@EJB
	private TypeClotureIBusiness typeClotureIBusiness;
	
	@PostConstruct
	public void init() {
		setTypeClotures(showAll());
	}
	
	public List<TypeCloture> showAll(){
		return typeClotureIBusiness.findAll();		
	}



	//public TypeCloture showById(int id) {
	//	return typeClotureIBusiness.findById(id);
	//}
	
	

	//*********Getter Setter*********
	
	public int getTypeClotureId() {
		return typeClotureId;
	}

	public void setTypeClotureId(int typeClotureId) {
		this.typeClotureId = typeClotureId;
	}

	public List<TypeCloture> getTypeClotures() {
		return typeClotures;
	}

	public void setTypeClotures(List<TypeCloture> typeClotures) {
		this.typeClotures = typeClotures;
	}

	public TypeClotureIBusiness getTypeClotureIBusiness() {
		return typeClotureIBusiness;
	}

	public void setTypeClotureIBusiness(TypeClotureIBusiness typeClotureIBusiness) {
		this.typeClotureIBusiness = typeClotureIBusiness;
	}
}
