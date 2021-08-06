package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.TroupeauIDAO;


@Remote(TroupeauIDAO.class)
@Stateless
public class TroupeauDAO extends GenericDAO<Troupeau> implements TroupeauIDAO {

	@Override
	public List<Troupeau> getOffresByUtilisateur(Utilisateur utilisateur) {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Troupeau> getAll(Troupeau troupeau) {
		List<Troupeau> troupeaux = null;
		Query query = em.createQuery("SELECT a FROM Troupeau a");
		troupeaux = query.getResultList();
		return troupeaux;
	}

	@Override
	public List<Troupeau> getTroupeauxByUtilisateur(Utilisateur utilisateur) {
		List<Troupeau> troupeaux = null;
		Query query = em.createQuery("SELECT t FROM Troupeau t WHERE t.utilisateur=:utilisateurParam");
		query.setParameter("utilisateurParam", utilisateur);
		troupeaux = query.getResultList();
		System.out.println("********************* HELLO LES TROUPEAUX *******************");
		return troupeaux;
	}
	




}
