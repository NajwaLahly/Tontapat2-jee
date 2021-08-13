package fr.eql.ai109.tontapat.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIDAO.class)
@Stateless
public class PrestationDAO  extends GenericDAO<Prestation> implements PrestationIDAO{

	@Override
	public void createPrestationOffer(Offre offre) {
		Prestation prestation = new Prestation(); 
		Query query = em.createQuery("INSERT INTO Prestation (id_offre) VALUES (offre.id)");
		//terrains = query.getResultList();
		
		
	}

	@Override
	public Prestation createFromOffreDTO(OffreDTO offreDTO) {
		Offre offre = offreDTO.getOffre();
		OffreSearch search = offreDTO.getSearch();
		Prestation prestation = new Prestation();
		
		prestation.setTerrain(search.getTerrain());
		
		prestation.setDateDebutInstallation(search.getDateDebut());
		prestation.setDateFinInstallation(search.getDateDebut());
		prestation.setDateDebutDesinstallation(search.getDateFin());
		prestation.setDateFinDesinstallation(search.getDateFin());
		
		prestation.setDateDebut(search.getDateDebut());
		prestation.setDateApportTroupeau(search.getDateDebut());
		prestation.setDateFin(search.getDateFin());
		prestation.setDateRecuperationTroupeau(search.getDateFin());
		prestation.setDateReservation(new Date());
		
		prestation.setTypeInstallation(offre.isInstallationAssuree());
		prestation.setFrequenceIntervention(offre.getFrequenceIntervention());
		prestation.setTroupeau(offre.getTroupeau());
		prestation.setOffre(offre);
		
		prestation.setFraisInstallation(offreDTO.getFraisInstallation());
		prestation.setFraisIntervention(offreDTO.getFraisIntervention());
		prestation.setFraisBetail(offreDTO.getFraisBetail());
		prestation.setFraisService(offreDTO.getFraisService());
		prestation.setTVA(offreDTO.getTVA());
		prestation.setPrixTotal(offreDTO.getPrixTotal());
		
		prestation = add(prestation);
		prestation.setNumReservation(prestation.getDateReservation() + "-" + prestation.getId());
		prestation = update(prestation);
		return prestation;
	}


}
