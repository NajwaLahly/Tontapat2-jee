package fr.eql.ai109.tontapat.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainTypeAbreuvoir;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeAbreuvoirIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainTypeAbreuvoirIDAO;


@Remote(TerrainTypeAbreuvoirIBusiness.class)
@Stateless
public class TerrainTypeAbreuvoirBusiness implements TerrainTypeAbreuvoirIBusiness {
	@EJB
	private TerrainTypeAbreuvoirIDAO terrainTypeAbreuvoirIDAO;

	@Override
	public TerrainTypeAbreuvoir addNewTerrainTypeAbreuvoir(TerrainTypeAbreuvoir terrainTypeAbreuvoir) {
		return terrainTypeAbreuvoirIDAO.ajoutNouveauTerrainTypeAbreuvoir(terrainTypeAbreuvoir);
	}


}
