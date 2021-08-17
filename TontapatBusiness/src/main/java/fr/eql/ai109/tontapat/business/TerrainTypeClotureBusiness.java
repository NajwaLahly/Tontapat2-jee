package fr.eql.ai109.tontapat.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainTypeCloture;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeClotureIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainTypeClotureIDAO;

@Remote(TerrainTypeClotureIBusiness.class)
@Stateless
public class TerrainTypeClotureBusiness implements TerrainTypeClotureIBusiness {
	
	@EJB
	private TerrainTypeClotureIDAO terrainTypeClotureIDAO;

	@Override
	public TerrainTypeCloture addNewTerrainTypeCloture(TerrainTypeCloture terrainTypeCloture) {
		return terrainTypeClotureIDAO.ajoutNouveauTerrainTypeCloture(terrainTypeCloture);
	}
}
