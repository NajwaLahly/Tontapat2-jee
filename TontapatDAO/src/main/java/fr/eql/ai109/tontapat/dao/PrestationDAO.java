package fr.eql.ai109.tontapat.dao;
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

	@Override
	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin) {
		Prestation prestation = new Prestation(); 
		prestation.setOffre(offre);
		prestation.setTroupeau(offre.getTroupeau());
		prestation.setDateDebut(debut);
		prestation.setDateFin(fin);
		prestation.setDateReservation(new Date());
		TerrainDAO dao = new TerrainDAO();
		Terrain terrain = new Terrain();
		terrain.setId(idTerrain);
		prestation.setTerrain(terrain);
		add(prestation);	
	}



}
