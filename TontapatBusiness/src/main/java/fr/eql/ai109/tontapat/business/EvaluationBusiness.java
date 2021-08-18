package fr.eql.ai109.tontapat.business;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Evaluation;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.EvaluationIBusiness;
import fr.eql.ai109.tontapat.idao.EvaluationIDAO;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(EvaluationIBusiness.class)
@Stateless
public class EvaluationBusiness implements EvaluationIBusiness {

	@EJB
	private EvaluationIDAO evaluationIDAO;

	@EJB
	private PrestationIDAO prestationIDAO;
	
	@Override
	public List<Evaluation> findAllByOffreId(int id) {
		return evaluationIDAO.getAllByOffreId(id);
	}

	@Override
	public void add(Evaluation evaluation) {
		evaluation.setDateCreation(new Date());
		
		Prestation prestation = evaluation.getPrestation();
		prestation.setStatut(4);
		prestationIDAO.update(prestation);
		
		evaluationIDAO.add(evaluation);
	}
	
}
