package fr.eql.ai109.tontapat.ibusiness;

import java.util.Date;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;

public interface PrestationIBusiness {

	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix);
}
