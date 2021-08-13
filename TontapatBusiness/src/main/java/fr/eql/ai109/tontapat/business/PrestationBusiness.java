package fr.eql.ai109.tontapat.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIBusiness.class)
@Stateless
public class PrestationBusiness implements PrestationIBusiness {

	@EJB
	private PrestationIDAO prestationIDAO;

	@Override
	public void createPrestationOffer(Offre offre) {
		prestationIDAO.createPrestationOffer(offre);
	}

	@Override
	public Prestation createFromOffreDTO(OffreDTO offreDTO) {
		return prestationIDAO.createFromOffreDTO(offreDTO);
	}

}
