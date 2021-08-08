package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.entity.Utilisateur;


public interface AnnonceIBusiness {
		List<Annonce> findAll();
		List<Annonce> findAllByCurrentUser(Utilisateur utilisateur);
}
