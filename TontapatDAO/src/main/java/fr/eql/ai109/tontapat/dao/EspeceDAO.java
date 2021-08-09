package fr.eql.ai109.tontapat.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.eql.ai109.tontapat.entity.Espece;
import fr.eql.ai109.tontapat.idao.EspeceIDAO;

@Remote(EspeceIDAO.class)
@Stateless
public class EspeceDAO extends GenericDAO<Espece> implements EspeceIDAO {

	@PersistenceContext(unitName = "myPersistenceUnit")
	protected EntityManager em = null;
}