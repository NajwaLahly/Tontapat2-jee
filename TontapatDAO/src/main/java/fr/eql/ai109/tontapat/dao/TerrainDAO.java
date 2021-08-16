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
	public List<Terrain> getAll(Terrain terrain) {
		List<Terrain> terrains = null;
		Query query = em.createQuery("SELECT a FROM Terrain a");
		terrains = query.getResultList();
		return terrains;
	}


	@Override
	public List<Terrain> getTerrainsByUtilisateur(Utilisateur utilisateur) {
		List<Terrain> terrains = null;
		Query query = em.createQuery("SELECT t FROM Terrain t WHERE t.utilisateur=:utilisateurParam");
		query.setParameter("utilisateurParam", utilisateur);
		terrains = query.getResultList();
		//System.out.println(utilisateur.getNom());
		//System.out.println(terrains);
		return terrains;
	}
	
//	@Override
//	public Utilisateur getUtilisateurByTerrain(soit terrain soit id terrain) {
//		List<Terrain> terrains = null;
//		Query query = em.createQuery("SELECT t FROM Terrain t WHERE t.utilisateur=:utilisateurParam");
//		query.setParameter("utilisateurParam", utilisateur);
//		terrains = query.getResultList();
//		//System.out.println(utilisateur.getNom());
//		//System.out.println(terrains);
//		return user;
//	}


	@Override
	public List<String> getTerrainsByUtilisateurAsList(Utilisateur utilisateur) {
		List<String> terrains = null;
		Query query = em.createQuery("SELECT t.nom FROM Terrain t WHERE t.utilisateur=:utilisateurParam");
		query.setParameter("utilisateurParam", utilisateur);
		terrains = query.getResultList();
		//System.out.println(utilisateur.getNom());
		//System.out.println(terrains);
		return terrains;
	}

}
