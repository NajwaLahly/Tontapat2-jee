package fr.eql.ai109.tontapat.idao;

import fr.eql.ai109.tontapat.entity.TerrainMorphologie;

public interface TerrainMorphologieIDAO extends GenericIDAO<TerrainMorphologie>{
	TerrainMorphologie ajoutNouveauTerrainMorphologie (TerrainMorphologie terrainMorphologie);
}
