package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.TypeAbreuvoir;
import fr.eql.ai109.tontapat.idao.TypeAbreuvoirIDAO;


@Remote(TypeAbreuvoirIDAO.class)
@Stateless
public class TypeAbreuvoirDAO extends GenericDAO<TypeAbreuvoir> implements TypeAbreuvoirIDAO {

	@Override
	public List<TypeAbreuvoir> getAll(TypeAbreuvoir typeAbreuvoir) {
		List<TypeAbreuvoir> typeAbreuvoirs = null;
		Query query = em.createQuery("SELECT a FROM TypeAbreuvoir a");
		typeAbreuvoirs = query.getResultList();
		return typeAbreuvoirs;
	}

}
