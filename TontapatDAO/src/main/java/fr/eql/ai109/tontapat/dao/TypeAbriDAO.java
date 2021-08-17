package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.TypeAbri;
import fr.eql.ai109.tontapat.idao.TypeAbriIDAO;



@Remote(TypeAbriIDAO.class)
@Stateless
public class TypeAbriDAO extends GenericDAO<TypeAbri> implements TypeAbriIDAO {

	@Override
	public List<TypeAbri> getAll(TypeAbri typeAbri) {
		List<TypeAbri> typeAbris = null;
		Query query = em.createQuery("SELECT a FROM TypeAbri a");
		typeAbris = query.getResultList();
		return typeAbris;
	}

}
