package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Terrain;
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

	@Override
	public List<TerrainMorphologie> getAllMorphologieThisTerrain(Terrain terrain) {
		List<TerrainMorphologie> terrainMorphologies = null;
		Query query = em.createQuery("SELECT t FROM TerrainMorphologie t WHERE t.terrain=:terrainParam");
		query.setParameter("terrainParam", terrain);
		terrainMorphologies = query.getResultList();
		return terrainMorphologies;
	}

}
