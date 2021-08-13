package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.TypeVegetation;


public interface TypeVegetationIDAO extends GenericIDAO<TypeVegetation> {
	
	List<TypeVegetation> getAll(TypeVegetation typeVegetation);

}
