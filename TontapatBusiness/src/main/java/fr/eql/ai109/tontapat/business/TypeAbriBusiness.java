package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TypeAbri;
import fr.eql.ai109.tontapat.ibusiness.TypeAbriIBusiness;
import fr.eql.ai109.tontapat.idao.TypeAbriIDAO;

@Remote(TypeAbriIBusiness.class)
@Stateless
public class TypeAbriBusiness implements TypeAbriIBusiness {
	
	@EJB
	private TypeAbriIDAO typeAbriIDAO;

	@Override
	public List<TypeAbri> findAll() {
		return typeAbriIDAO.getAll();
	}

}
