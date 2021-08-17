package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TypeVegetation;
import fr.eql.ai109.tontapat.ibusiness.TypeVegetationIBusiness;
import fr.eql.ai109.tontapat.idao.TypeVegetationIDAO;


@Remote(TypeVegetationIBusiness.class)
@Stateless
public class TypeVegetationBusiness  implements TypeVegetationIBusiness{ 

	@EJB
	private TypeVegetationIDAO typeVegetationIDAO;


	@Override
	public TypeVegetation findById(int id) {
		return typeVegetationIDAO.getById(id);
	}

	@Override
	public List<TypeVegetation> findAll() {
		return typeVegetationIDAO.getAll();
	}
}