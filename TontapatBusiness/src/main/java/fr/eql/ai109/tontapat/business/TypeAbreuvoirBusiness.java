package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TypeAbreuvoir;
import fr.eql.ai109.tontapat.ibusiness.TypeAbreuvoirIBusiness;
import fr.eql.ai109.tontapat.idao.TypeAbreuvoirIDAO;


@Remote(TypeAbreuvoirIBusiness.class)
@Stateless
public class TypeAbreuvoirBusiness implements TypeAbreuvoirIBusiness {
	
	@EJB
	private TypeAbreuvoirIDAO typeAbreuvoirIDAO;

	@Override
	public List<TypeAbreuvoir> findAll() {
		return typeAbreuvoirIDAO.getAll();
	}

	@Override
	public TypeAbreuvoir findById(int id) {
		return typeAbreuvoirIDAO.getById(id);
		}

}
