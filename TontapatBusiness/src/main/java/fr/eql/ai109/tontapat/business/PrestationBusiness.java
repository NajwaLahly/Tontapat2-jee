package fr.eql.ai109.tontapat.business;


import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIBusiness.class)
@Stateless
public class PrestationBusiness implements PrestationIBusiness {

	@EJB
	private PrestationIDAO prestationIDAO;

	@Override
	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix) {
		prestationIDAO.createPrestationOffer(offre,idTerrain,debut, fin, prix);	
	}
}
