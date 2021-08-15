package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainMorphologie;
import fr.eql.ai109.tontapat.ibusiness.TerrainMorphologieIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainMorphologieIDAO;



@Remote(TerrainMorphologieIBusiness.class)
@Stateless
public class TerrainMorphologieBusiness implements TerrainMorphologieIBusiness {

	@EJB
	private TerrainMorphologieIDAO terrainMorphologieIDAO;
	
	@Override
	public TerrainMorphologie addNewTerrainMorphologie(TerrainMorphologie terrainMorphologie) {
		return terrainMorphologieIDAO.ajoutNouveauTerrainMorphologie(terrainMorphologie);
	}

	@Override
	public List<TerrainMorphologie> findAllMorphologieThisTerrain(Terrain terrain) {
		return terrainMorphologieIDAO.getAllMorphologieThisTerrain(terrain);
	}

}
