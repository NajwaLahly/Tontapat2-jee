package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface UtilisateurIBusiness {
	Utilisateur connection(String email, String motDePasse);
	List<Utilisateur> findAll();

}
