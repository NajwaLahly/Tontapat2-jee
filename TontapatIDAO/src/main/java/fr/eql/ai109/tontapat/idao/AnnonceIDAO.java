package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface AnnonceIDAO extends GenericIDAO<Annonce> {
	List<Annonce> getAnnoncesByUtilisateur(Utilisateur utilisateur);
	List<Annonce> getAll(Annonce annonce);

}
