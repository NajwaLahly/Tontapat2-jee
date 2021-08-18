package fr.eql.ai109.tontapat.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Proposition;
import fr.eql.ai109.tontapat.idao.PropositionIDAO;

@Remote(PropositionIDAO.class)
@Stateless
public class PropositionDAO extends GenericDAO<Proposition> implements PropositionIDAO {

	@Override
	public List<Proposition> getAllByPrestationId(int id) {
		System.out.println("PROPOSITION ID DAO : " + id);
		List<Proposition> propositions = new ArrayList<>();

		Query query = em.createQuery("SELECT p FROM Proposition p WHERE p.prestation.id=:prestationParam");
		query.setParameter("prestationParam", id);
		
		propositions = query.getResultList();
		
		System.out.println("PROPOSITIONS : " + propositions.size());
		return propositions;
	}

	@Override
	public Proposition getLatestFromPrestationId(int id) {
		System.out.println();
		List<Proposition> propositions = null;		
		Query query = em.createQuery("SELECT p FROM Proposition p WHERE p.prestation.id=:prestationParam");
		query.setParameter("prestationParam", id);
		propositions = query.getResultList();
		if (propositions.size() > 0) return propositions.get(propositions.size() - 1);
		else return null;
	}

}
