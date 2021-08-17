package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainTypeAbreuvoir;
import fr.eql.ai109.tontapat.idao.TerrainTypeAbreuvoirIDAO;


@Remote(TerrainTypeAbreuvoirIDAO.class)
@Stateless
public class TerrainTypeAbreuvoirDAO extends GenericDAO<TerrainTypeAbreuvoir> implements TerrainTypeAbreuvoirIDAO {

	@Override
	public TerrainTypeAbreuvoir ajoutNouveauTerrainTypeAbreuvoir(TerrainTypeAbreuvoir terrainTypeAbreuvoir) {
		add (terrainTypeAbreuvoir );
		return  terrainTypeAbreuvoir ;
	}

}
