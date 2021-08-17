package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainTypeAbri;
import fr.eql.ai109.tontapat.idao.TerrainTypeAbriIDAO;


@Remote(TerrainTypeAbriIDAO.class)
@Stateless
public class TerrainTypeAbriDAO extends GenericDAO<TerrainTypeAbri> implements TerrainTypeAbriIDAO {

	@Override
	public TerrainTypeAbri ajoutNouveauTerrainTypeAbri(TerrainTypeAbri terrainTypeAbri) {
		add (terrainTypeAbri);
		return  terrainTypeAbri;
	}

}
