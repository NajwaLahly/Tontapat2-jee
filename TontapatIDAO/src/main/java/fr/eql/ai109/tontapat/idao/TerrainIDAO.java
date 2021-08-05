package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;


public interface TerrainIDAO  extends GenericIDAO<Terrain> {
	List<Terrain> getAnnoncesByUtilisateur(Utilisateur utilisateur);
	List<Terrain> getAll(Terrain terrain);

}
