package fr.eql.ai109.tontapat.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TerrainMorphologie;
import fr.eql.ai109.tontapat.ibusiness.TerrainMorphologieIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainMorphologieIDAO;



@Remote(TerrainMorphologieIBusiness.class)
@Stateless
public class TerrainMorphologieBusiness implements TerrainMorphologieIBusiness {

	@EJB
	private TerrainMorphologieIDAO terrainMorphologieIDAO;
	
	@Override
	public TerrainMorphologie addNewTerrain(TerrainMorphologie terrainMorphologie) {
		return terrainMorphologieIDAO.ajoutNouveauTerrainMorphologie(terrainMorphologie);
	}

}
