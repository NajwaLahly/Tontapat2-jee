package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Proposition;

public interface PropositionIDAO extends GenericIDAO<Proposition> {
	public List<Proposition> getAllByPrestationId(int id);
}
