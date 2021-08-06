package fr.eql.ai109.tontapat.idao;

import java.util.List;


import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface TroupeauIDAO extends GenericIDAO<Troupeau> {
	List<Troupeau> getOffresByUtilisateur(Utilisateur utilisateur);
	List<Troupeau> getAll(Troupeau terrain);
	List<Troupeau> getTroupeauxByUtilisateur(Utilisateur utilisateur);

}
