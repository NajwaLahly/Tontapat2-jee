package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Morphologie;

public interface MorphologieIDAO extends GenericIDAO<Morphologie> {
	
	List<Morphologie> getAll(Morphologie morphologie);

}
