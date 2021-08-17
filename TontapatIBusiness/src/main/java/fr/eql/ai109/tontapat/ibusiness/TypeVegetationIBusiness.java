package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.TypeVegetation;


public interface TypeVegetationIBusiness {
	
	TypeVegetation findById(int id);
	List<TypeVegetation> findAll();

}
