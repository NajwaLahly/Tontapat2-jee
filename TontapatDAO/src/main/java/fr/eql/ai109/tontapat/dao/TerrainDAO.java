package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.TerrainIDAO;

@Remote(TerrainIDAO.class)
@Stateless
public class TerrainDAO extends GenericDAO<Terrain> implements TerrainIDAO {

	@Override
	public List<Terrain> getAnnoncesByUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Terrain> getAll(Terrain terrain) {
		List<Terrain> terrains = null;
		Query query = em.createQuery("SELECT a FROM Annonce a");
		terrains = query.getResultList();
		return terrains;
	}


	@Override
	public List<Terrain> getTerrainsByUtilisateur(int i) {
		System.out.println(i);
		List<Terrain> terrains = null;
		Query query = em.createQuery("SELECT t FROM Terrain t WHERE t.utilisateur=:utilisateurParam");
		query.setParameter("utilisateurParam", i);
		terrains = query.getResultList();
		return terrains;
	}

}
