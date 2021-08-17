package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.TypeVegetation;
import fr.eql.ai109.tontapat.idao.TypeVegetationIDAO;

@Remote(TypeVegetationIDAO.class)
@Stateless
public class TypeVegetationDAO extends GenericDAO<TypeVegetation> implements TypeVegetationIDAO {

	@Override
	public List<TypeVegetation> getAll(TypeVegetation typeVegetation) {
		List<TypeVegetation> typeVegetations = null;
		Query query = em.createQuery("SELECT a FROM TypeVegetation a");
		typeVegetations = query.getResultList();
		return typeVegetations;
	}

}
