package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Morphologie;

public interface MorphologieIBusiness {
	
	Morphologie findById(int id);
	List<Morphologie> findAll();

}
