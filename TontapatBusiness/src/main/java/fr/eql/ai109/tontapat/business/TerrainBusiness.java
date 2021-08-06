package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.TerrainIBusiness;
import fr.eql.ai109.tontapat.idao.TerrainIDAO;



@Remote(TerrainIBusiness.class)
@Stateless
public class TerrainBusiness implements TerrainIBusiness {

	@EJB
	private TerrainIDAO terrainIDAO;
	
	@Override
	public List<Terrain> findAll() {
		
		return terrainIDAO.getAll();
	}

	@Override
	public List<Terrain> findAllByCurrentUser(int i) {

		return terrainIDAO.getTerrainsByUtilisateur(i);
	}

}
