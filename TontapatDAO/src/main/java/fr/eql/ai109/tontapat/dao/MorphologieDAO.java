package fr.eql.ai109.tontapat.dao;


import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Morphologie;
import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.idao.MorphologieIDAO;

@Remote(MorphologieIDAO.class)
@Stateless
public class MorphologieDAO extends GenericDAO<Morphologie> implements MorphologieIDAO {

	@Override
	public List<Morphologie> getAll(Morphologie morphologie) {
		List<Morphologie> morphologies = null;
		Query query = em.createQuery("SELECT a FROM Morphologie a");
		morphologies = query.getResultList();
		return morphologies;
	}



}
