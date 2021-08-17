package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.TypeCloture;
import fr.eql.ai109.tontapat.idao.TypeClotureIDAO;


@Remote(TypeClotureIDAO.class)
@Stateless
public class TypeClotureDAO extends GenericDAO<TypeCloture> implements TypeClotureIDAO {

	@Override
	public List<TypeCloture> getAll(TypeCloture typeCloture) {
		List<TypeCloture> typeClotures = null;
		Query query = em.createQuery("SELECT a FROM TypeCloture a");
		typeClotures = query.getResultList();
		return typeClotures;
	}

}
