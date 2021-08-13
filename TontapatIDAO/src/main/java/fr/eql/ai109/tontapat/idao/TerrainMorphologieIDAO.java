package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainMorphologie;

public interface TerrainMorphologieIDAO extends GenericIDAO<TerrainMorphologie>{
	TerrainMorphologie ajoutNouveauTerrainMorphologie (TerrainMorphologie terrainMorphologie);
	List<TerrainMorphologie> getAllMorphologieThisTerrain (Terrain terrain);
}
