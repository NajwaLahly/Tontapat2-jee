package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;


public interface TerrainIDAO  extends GenericIDAO<Terrain> {
	List<Terrain> getAll(Terrain terrain);
	List<Terrain> getTerrainsByUtilisateur(Utilisateur utilisateur);
	List<String> getTerrainsByUtilisateurAsList(Utilisateur utilisateur);
	Terrain ajoutNouveauTerrain (Terrain terrain);
}
