package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.UtilisateurIBusiness;
import fr.eql.ai109.tontapat.idao.UtilisateurIDAO;



@Remote(UtilisateurIBusiness.class)
@Stateless
public class UtilisateurBusiness implements UtilisateurIBusiness {

	@EJB
	private UtilisateurIDAO utilisateurIDao;
	
	public Utilisateur connection(String email, String motDePasse) {
		return utilisateurIDao.authenticate(email, motDePasse);
	}

	public List<Utilisateur> findAll() {
		return utilisateurIDao.getAll();
	}
}
