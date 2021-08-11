package fr.eql.ai109.tontapat.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Terrain;

import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIDAO.class)
@Stateless
public class PrestationDAO  extends GenericDAO<Prestation> implements PrestationIDAO{

	@Override
    public void createPrestationOffer() {
        Prestation prestation = new Prestation(); 
        prestation.setDateReservation(new Date());
		prestation.setDateDebutInstallation(new Date());
        add(prestation);
    }
}
