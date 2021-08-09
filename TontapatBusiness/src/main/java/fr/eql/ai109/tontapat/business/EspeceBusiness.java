package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Espece;
import fr.eql.ai109.tontapat.ibusiness.EspeceIBusiness;
import fr.eql.ai109.tontapat.idao.EspeceIDAO;

@Remote(EspeceIBusiness.class)
@Stateless
public class EspeceBusiness implements EspeceIBusiness {

	@EJB
	private EspeceIDAO especeIDAO;
	
	@Override
	public List<Espece> findAll() {
		return especeIDAO.getAll();
	}

}
