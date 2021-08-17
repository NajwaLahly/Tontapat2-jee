package fr.eql.ai109.tontapat.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Morphologie;
import fr.eql.ai109.tontapat.ibusiness.MorphologieIBusiness;
import fr.eql.ai109.tontapat.idao.MorphologieIDAO;

@Remote(MorphologieIBusiness.class)
@Stateless
public class MorphologieBusiness implements MorphologieIBusiness{
	
	@EJB
	private MorphologieIDAO morphologieIDAO;
	
	
	@Override
	public Morphologie findById(int id) {
		return morphologieIDAO.getById(id);
	}


	@Override
	public List<Morphologie> findAll() {
		return morphologieIDAO.getAll();
	}


}
