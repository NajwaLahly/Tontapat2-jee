package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Annonce;
import fr.eql.ai109.tontapat.ibusiness.AnnonceIBusiness;
import fr.eql.ai109.tontapat.idao.AnnonceIDAO;

@Remote(AnnonceIBusiness.class)
@Stateless
public class AnnonceBusiness implements AnnonceIBusiness {

	@EJB
	private AnnonceIDAO annonceIDAO;

	public List<Annonce> findAll() {
		return annonceIDAO.getAll();
	}
}
