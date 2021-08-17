package fr.eql.ai109.tontapat.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainTypeAbri;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeAbriIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainTypeAbriIDAO;

@Remote(TerrainTypeAbriIBusiness.class)
@Stateless
public class TerrainTypeAbriBusiness implements TerrainTypeAbriIBusiness {
	
	@EJB
	private TerrainTypeAbriIDAO terrainTypeAbriIDAO;

	@Override
	public TerrainTypeAbri addNewTerrainTypeAbri(TerrainTypeAbri terrainTypeAbri) {
		return terrainTypeAbriIDAO.ajoutNouveauTerrainTypeAbri(terrainTypeAbri);
	}

}
