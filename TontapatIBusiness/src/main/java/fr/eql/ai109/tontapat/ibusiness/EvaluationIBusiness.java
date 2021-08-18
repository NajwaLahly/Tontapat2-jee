package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Evaluation;

public interface EvaluationIBusiness {

	List<Evaluation> findAllByOffreId(int id);

	void add(Evaluation evaluation);

}
