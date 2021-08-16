package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.TypeCloture;
import fr.eql.ai109.tontapat.ibusiness.TypeClotureIBusiness;
import fr.eql.ai109.tontapat.idao.TypeClotureIDAO;

@Remote(TypeClotureIBusiness.class)
@Stateless
public class TypeClotureBusiness implements TypeClotureIBusiness {
	
	@EJB
	private TypeClotureIDAO typeClotureIDAO;
	

	@Override
	public List<TypeCloture> findAll() {
		return typeClotureIDAO.getAll();
		
	}
 
}
