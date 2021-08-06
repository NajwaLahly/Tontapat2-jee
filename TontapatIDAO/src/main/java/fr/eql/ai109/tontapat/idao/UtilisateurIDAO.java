package fr.eql.ai109.tontapat.idao;

import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface UtilisateurIDAO extends GenericIDAO<Utilisateur> {
	

	Boolean exists(Utilisateur utilisateur);
	Utilisateur authenticate(String email, String motDePasse);

}
