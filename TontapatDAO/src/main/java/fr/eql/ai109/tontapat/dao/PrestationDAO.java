package fr.eql.ai109.tontapat.dao;





import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIDAO.class)
@Stateless
public class PrestationDAO  extends GenericDAO<Prestation> implements PrestationIDAO{

	@Override
	public void createPrestationOffer() {
		Prestation prestation = new Prestation(); 
		add(prestation);	
	}



}
