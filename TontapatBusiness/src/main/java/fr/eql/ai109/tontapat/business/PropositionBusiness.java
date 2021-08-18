package fr.eql.ai109.tontapat.business;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Proposition;
import fr.eql.ai109.tontapat.ibusiness.PropositionIBusiness;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;
import fr.eql.ai109.tontapat.idao.PropositionIDAO;

@Remote(PropositionIBusiness.class)
@Stateless
public class PropositionBusiness implements PropositionIBusiness {

	@EJB
	private PropositionIDAO propositionIDAO;
	
	@EJB
	private PrestationIDAO prestationIDAO;
	
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

	@Override
	public Proposition findLatestFromPrestationId(int id) {
		return propositionIDAO.getLatestFromPrestationId(id);
	}

	@Override
	public void accept(Proposition proposition) {
		proposition.setDateValidation(new Date());
		
		Prestation prestation = proposition.getPrestation();
		
		if(prestation.getDateDebut() != proposition.getDateDebutPrestation())
			prestation.setDateDebut(proposition.getDateDebutPrestation());
		
		if(prestation.getDateFin() != proposition.getDateFinPrestation())
			prestation.setDateFin(proposition.getDateFinPrestation());
		
		if(prestation.isTypeInstallation() != proposition.isTypeInstallation())
			prestation.setTypeInstallation(proposition.isTypeInstallation());
		
		if(prestation.getPrixTotal() != proposition.getPrixPropose())
			prestation.setPrixTotal(proposition.getPrixPropose());
		
		prestationIDAO.update(prestation);
		propositionIDAO.update(proposition);
		
	}

	@Override
	public void refuse(Proposition proposition) {
		proposition.setDateRefus(new Date());
		propositionIDAO.update(proposition);
	}

}
