package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainMorphologie;

public interface TerrainMorphologieIBusiness {

	TerrainMorphologie addNewTerrainMorphologie (TerrainMorphologie terrainMorphologie);
	List<TerrainMorphologie> findAllMorphologieThisTerrain(Terrain terrain);
}
