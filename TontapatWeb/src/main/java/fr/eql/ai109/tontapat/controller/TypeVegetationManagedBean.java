package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.eql.ai109.tontapat.entity.TypeVegetation;
import fr.eql.ai109.tontapat.ibusiness.TypeVegetationIBusiness;

@ManagedBean(name = "mbTypeVegetation")
@SessionScoped
public class TypeVegetationManagedBean implements Serializable {

	private static final long serialVersionUID = 1L; 
		
		private int typeVegetationId;
		private List<TypeVegetation> typeVegetations;
		
		@EJB
		private TypeVegetationIBusiness typeVegetationIBusiness;
		
		@PostConstruct
		public void init() {
			setTypeVegetations(showAll());
		}
		
		public List<TypeVegetation> showAll(){
			return typeVegetationIBusiness.findAll();		
		}

		public TypeVegetation showById(int id) {
			return typeVegetationIBusiness.findById(id);
		}
		
		

		//*********Getter Setter*********
		public void setTypeVegetations(List<TypeVegetation> typeVegetations) {
			this.typeVegetations = typeVegetations;
		}
		
		public List<TypeVegetation> getTypeVegetations() {
			return typeVegetations;
		}

		public int getTypeVegetationId() {
			return typeVegetationId;
		}

		public void setTypeVegetationId(int typeVegetationId) {
			this.typeVegetationId = typeVegetationId;
		}

		

	}