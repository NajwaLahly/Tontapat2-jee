package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainTypeCloture;
import fr.eql.ai109.tontapat.idao.TerrainTypeClotureIDAO;


@Remote(TerrainTypeClotureIDAO.class)
@Stateless
public class TerrainTypeClotureDAO extends GenericDAO<TerrainTypeCloture> implements TerrainTypeClotureIDAO {

	@Override
	public TerrainTypeCloture ajoutNouveauTerrainTypeCloture(TerrainTypeCloture terrainTypeCloture) {
		add (terrainTypeCloture );
		return  terrainTypeCloture ;
	}

}
