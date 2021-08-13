package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.TerrainTypeVegetation;

public interface TerrainTypeVegetationIDAO extends GenericIDAO<TerrainTypeVegetation> {
	TerrainTypeVegetation ajoutNouveauTerrainTypeVegetation (TerrainTypeVegetation terrainTypeVegetation);
	List<TerrainTypeVegetation> getAllTypeVegetationThisTerrain (Terrain terrain);
}
