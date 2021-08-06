package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.UtilisateurIDAO;

@Remote(UtilisateurIDAO.class)
@Stateless
public class UtilisateurDAO extends GenericDAO<Utilisateur> implements UtilisateurIDAO {
	
	@PersistenceContext(unitName = "myPersistenceUnit")
	protected EntityManager em = null;
	EntityTransaction tx = null;

	@Override
	public Boolean exists(Utilisateur utilisateur) {
		List<Utilisateur> utilisateurs = null;

		
		Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:emailParam");
		query.setParameter("emailParam", utilisateur.getEmail());
		System.out.println(query);
		utilisateurs = query.getResultList();
		
	return utilisateurs.size() > 0;
	}

	@Override
	public Utilisateur authenticate(String email, String motDePasse) {
		Utilisateur utilisateur = null;
		List<Utilisateur> utilisateurs = null;
		
			Query query =  em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:emailParam "
					+ "AND u.motDePasse=:motDePasseParam");
			query.setParameter("emailParam", email);
			query.setParameter("motDePasseParam", motDePasse);
			System.out.println(query);
			System.out.println("********************* HELLO WORLD *******************");
			utilisateurs = query.getResultList();
			
		if (utilisateurs.size() > 0) {
			utilisateur = utilisateurs.get(0);
		}
		return utilisateur;
	}

}
