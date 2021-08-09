package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.AnnonceIDAO;

@Remote(AnnonceIDAO.class)
@Stateless
public class AnnonceDAO extends GenericDAO<Annonce> implements AnnonceIDAO{


	@Override
	public List<Annonce> getAll(Annonce annonce) {
		List<Annonce> annonces = null;
		Query query = em.createQuery("SELECT a FROM Annonce a");
		annonces = query.getResultList();
	return annonces;
	}
	

	@Override
	public List<Annonce> getAnnoncesByUtilisateur(Utilisateur utilisateur) {
		List<Annonce> annonces = null;
		Query query = em.createQuery("SELECT t FROM Annonce t WHERE t.terrain.utilisateur=:utilisateurParam");
		query.setParameter("utilisateurParam", utilisateur);
		annonces = query.getResultList();
		return annonces;
	}

}
