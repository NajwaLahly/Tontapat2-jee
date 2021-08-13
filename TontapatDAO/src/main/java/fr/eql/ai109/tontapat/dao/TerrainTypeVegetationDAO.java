package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Terrain;
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

	@Override
	public List<TerrainTypeVegetation> getAllTypeVegetationThisTerrain(Terrain terrain) {
		List<TerrainTypeVegetation> terrainTypeVegetations = null;
		Query query = em.createQuery("SELECT t FROM TerrainTypeVegetation t WHERE t.terrain=:terrainParam");
		query.setParameter("terrainParam", terrain);
		terrainTypeVegetations = query.getResultList();
		//System.out.println(utilisateur.getNom());
		//System.out.println(terrains);
		System.out.println(terrainTypeVegetations.get(0).getTerrain());
		System.out.println(terrainTypeVegetations.get(0).getTypeVegetation());
		System.out.println(terrainTypeVegetations.get(0).getPourcentage());
		return terrainTypeVegetations;
	}
}


