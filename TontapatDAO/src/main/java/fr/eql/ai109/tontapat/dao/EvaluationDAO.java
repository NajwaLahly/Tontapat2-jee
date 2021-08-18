package fr.eql.ai109.tontapat.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Evaluation;
import fr.eql.ai109.tontapat.idao.EvaluationIDAO;

@Remote(EvaluationIDAO.class)
@Stateless
public class EvaluationDAO extends GenericDAO<Evaluation> implements EvaluationIDAO {

	@Override
	public List<Evaluation> getAllByOffreId(int id) {
		List<Evaluation> evaluations = new ArrayList<>();
		
		Query query = em.createQuery("SELECT e FROM Evaluation e WHERE e.prestation.offre.id=:offreParam");
		query.setParameter("offreParam",id);
		
		evaluations = query.getResultList();
		
		return evaluations;
	}

}
