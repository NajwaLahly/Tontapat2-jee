package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Proposition;

public interface PropositionIBusiness {
	
	public List<Proposition> findAllByPrestationId(int id);

	public Proposition findById(int id);

	public void send(Proposition proposition);

}
