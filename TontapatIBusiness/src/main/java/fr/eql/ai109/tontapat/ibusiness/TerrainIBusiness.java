package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface TerrainIBusiness {
	List<Terrain> findAll();
	List<Terrain> findAllByCurrentUser(Utilisateur utilisateur);
	List<String> findAllByCurrentUserAsList(Utilisateur utilisateur);
}
