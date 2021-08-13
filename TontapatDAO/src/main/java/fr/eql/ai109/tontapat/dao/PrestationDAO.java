package fr.eql.ai109.tontapat.dao;

import java.util.List;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Terrain;

import fr.eql.ai109.tontapat.idao.PrestationIDAO;
@Remote(PrestationIDAO.class)
@Stateless
public class PrestationDAO  extends GenericDAO<Prestation> implements PrestationIDAO{

	private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;

	@Override
	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix) {
		Prestation prestation = new Prestation(); 
		prestation.setOffre(offre);
		prestation.setTroupeau(offre.getTroupeau());
		prestation.setDateDebut(debut);
		prestation.setDateFin(fin);
		prestation.setDateReservation(new Date());
		Terrain terrain = new Terrain();
		terrain.setId(idTerrain);
		prestation.setTerrain(terrain);
		prestation.setPrixConvenu(prix);

		prestation.setDateDebutInstallation(new Date(debut.getTime() - (MILLIS_IN_A_DAY * 2)));
		prestation.setDateDebutDesinstallation(new Date(fin.getTime() - (MILLIS_IN_A_DAY * 2)));
		
		prestation.setDateApportTroupeau(new Date(debut.getTime() - MILLIS_IN_A_DAY));
		add(prestation);	
	}

}
