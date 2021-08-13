package fr.eql.ai109.tontapat.idao;

import fr.eql.ai109.tontapat.entity.TerrainTypeVegetation;

public interface TerrainTypeVegetationIDAO extends GenericIDAO<TerrainTypeVegetation> {
	TerrainTypeVegetation ajoutNouveauTerrainTypeVegetation (TerrainTypeVegetation terrainTypeVegetation);
}
