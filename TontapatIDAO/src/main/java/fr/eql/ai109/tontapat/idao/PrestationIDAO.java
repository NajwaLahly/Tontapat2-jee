package fr.eql.ai109.tontapat.idao;

import java.util.Date;
import java.util.List;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Prestation;

public interface PrestationIDAO extends GenericIDAO<Prestation> {

	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix);
	 


}
