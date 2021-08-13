package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainTypeVegetation;
import fr.eql.ai109.tontapat.ibusiness.TerrainTypeVegetationIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainTypeVegetationIDAO;


@Remote(TerrainTypeVegetationIBusiness.class)
@Stateless
public class TerrainTypeVegetationBusiness implements TerrainTypeVegetationIBusiness {

	@EJB
	private TerrainTypeVegetationIDAO terrainTypeVegetationIDAO;
	
	@Override
	public TerrainTypeVegetation addNewTerrainTypeVegetation(TerrainTypeVegetation terrainTypeVegetation) {
		return terrainTypeVegetationIDAO.ajoutNouveauTerrainTypeVegetation(terrainTypeVegetation);
	}

	@Override
	public List<TerrainTypeVegetation> findAllThisTerrain(Terrain terrain) {
		return terrainTypeVegetationIDAO.getAllThisTerrain(terrain);
	}
}
