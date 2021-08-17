package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.TypeAbreuvoir;

public interface TypeAbreuvoirIBusiness {
	
	List<TypeAbreuvoir> findAll();
	TypeAbreuvoir findById(int id);

}
