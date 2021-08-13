package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainMorphologie;
import fr.eql.ai109.tontapat.idao.TerrainMorphologieIDAO;

@Remote(TerrainMorphologieIDAO.class)
@Stateless
public class TerrainMorphologieDAO extends GenericDAO<TerrainMorphologie> implements TerrainMorphologieIDAO {

	@Override
	public TerrainMorphologie ajoutNouveauTerrainMorphologie(TerrainMorphologie terrainMorphologie) {
		add (terrainMorphologie);
		return terrainMorphologie;
	}

}
