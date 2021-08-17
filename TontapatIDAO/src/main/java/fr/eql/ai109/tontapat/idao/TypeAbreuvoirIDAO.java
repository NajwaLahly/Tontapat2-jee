package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.TypeAbreuvoir;


public interface TypeAbreuvoirIDAO extends GenericIDAO<TypeAbreuvoir> {

	
	List<TypeAbreuvoir> getAll(TypeAbreuvoir typeAbreuvoir);


}