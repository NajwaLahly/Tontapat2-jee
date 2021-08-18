package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Evaluation;

public interface EvaluationIDAO extends GenericIDAO<Evaluation> {

	List<Evaluation> getAllByOffreId(int id);

}
