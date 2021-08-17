package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.TypeAbri;

public interface TypeAbriIDAO extends GenericIDAO<TypeAbri> {

		
		List<TypeAbri> getAll(TypeAbri typeAbri);


	}
