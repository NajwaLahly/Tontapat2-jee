package fr.eql.ai109.tontapat.ibusiness;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;

public interface PrestationIBusiness {

	public void createPrestationOffer(Offre offre);

	public Prestation createFromOffreDTO(OffreDTO offreDTO);

}
