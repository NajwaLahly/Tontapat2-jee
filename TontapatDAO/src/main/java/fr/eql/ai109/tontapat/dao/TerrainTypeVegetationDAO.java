package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainTypeVegetation;
import fr.eql.ai109.tontapat.idao.TerrainTypeVegetationIDAO;

@Remote(TerrainTypeVegetationIDAO.class)
@Stateless
public class TerrainTypeVegetationDAO extends GenericDAO<TerrainTypeVegetation> implements TerrainTypeVegetationIDAO {

	@Override
	public TerrainTypeVegetation ajoutNouveauTerrainTypeVegetation(TerrainTypeVegetation terrainTypeVegetation) {
		add (terrainTypeVegetation);
		return  terrainTypeVegetation;
	}

}
