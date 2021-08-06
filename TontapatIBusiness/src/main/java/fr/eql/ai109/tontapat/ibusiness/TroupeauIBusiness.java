package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface TroupeauIBusiness {
	List<Troupeau> findAll();
	List<Troupeau> findAllByCurrentUser(Utilisateur utilisateur);

}
