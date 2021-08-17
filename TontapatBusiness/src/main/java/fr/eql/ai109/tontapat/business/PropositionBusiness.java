package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Proposition;
import fr.eql.ai109.tontapat.ibusiness.PropositionIBusiness;
import fr.eql.ai109.tontapat.idao.PropositionIDAO;

@Remote(PropositionIBusiness.class)
@Stateless
public class PropositionBusiness implements PropositionIBusiness {

	@EJB
	private PropositionIDAO propositionIDAO;
	
	@Override
	public List<Proposition> findAllByPrestationId(int id) {
		return propositionIDAO.getAllByPrestationId(id);
	}

	@Override
	public Proposition findById(int id) {
		return propositionIDAO.getById(id);
	}

	@Override
	public void send(Proposition proposition) {
		propositionIDAO.add(proposition);
		
	}

}
