package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.TypeCloture;


public interface TypeClotureIDAO extends GenericIDAO<TypeCloture> {
	
	List<TypeCloture> getAll(TypeCloture typeCloture);


}
