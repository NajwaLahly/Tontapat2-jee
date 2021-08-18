package fr.eql.ai109.tontapat.dao;

import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;
@Remote(PrestationIDAO.class)
@Stateless
public class PrestationDAO extends GenericDAO<Prestation> implements PrestationIDAO {

	private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;

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
		prestation.setStatut(0);
		prestation = add(prestation);
		prestation.setNumReservation(prestation.getDateReservation() + "-" + prestation.getId());
		prestation = update(prestation);
		return prestation;
	}
	
	
	@Override
	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix) {
		Prestation prestation = new Prestation(); 
		prestation.setOffre(offre);
		prestation.setTroupeau(offre.getTroupeau());
		prestation.setDateDebut(debut);
		prestation.setDateFin(fin);
		prestation.setDateReservation(new Date());
		Terrain terrain = new Terrain();
		terrain.setId(idTerrain);
		prestation.setTerrain(terrain);
		prestation.setPrixTotal(prix);

		prestation.setDateDebutInstallation(new Date(debut.getTime() - (MILLIS_IN_A_DAY * 2)));
		prestation.setDateDebutDesinstallation(new Date(fin.getTime() - (MILLIS_IN_A_DAY * 2)));

		prestation.setDateApportTroupeau(new Date(debut.getTime() - MILLIS_IN_A_DAY));
		add(prestation);	
	}

		@Override
		public List<Prestation> getPrestationsByUtilisateur(Utilisateur utilisateur) {
			List<Prestation> prestations = null;
			Query query = em.createQuery("SELECT p FROM Prestation p WHERE p.terrain.utilisateur=:utilisateurParam "
					+ "or p.troupeau.utilisateur=:utilisateurParam");
			query.setParameter("utilisateurParam", utilisateur);
			prestations = query.getResultList();
			return prestations;
		}
	
	@Override
	public List<Prestation> getDemandesReservationByUtilisateur(Utilisateur utilisateur) { // Ajout Elodie
		List<Prestation> prestations = null;
		Query query = em.createQuery("SELECT p FROM Prestation p "
				+ "WHERE p.troupeau.utilisateur=:utilisateurParam "
				+ "AND p.dateValidation IS NULL "
				+ "AND p.dateRefus IS NULL "
//				+ "AND p.etatNotif IS NULL"
				);
		query.setParameter("utilisateurParam", utilisateur);
		prestations = query.getResultList();
		return prestations;
	}


	
	@Override
	public List<Prestation> getDemandesReservationOffreAccepted(Utilisateur utilisateur) { // Ajout Elodie
		List<Prestation> prestations = null;
		Query query = em.createQuery("SELECT p FROM Prestation p "
				+ "WHERE p.terrain.utilisateur=:utilisateurParam "
				+ "AND p.dateValidation IS NOT NULL "
				+ "AND p.dateRefus IS NULL ");

		query.setParameter("utilisateurParam", utilisateur);
		prestations = query.getResultList();
		return prestations;

	}

	
	@Override
	public List<Prestation> getDemandesReservationOffreRefused(Utilisateur utilisateur) { // Ajout Elodie
		List<Prestation> prestations = null;
		Query query = em.createQuery("SELECT p FROM Prestation p "
				+ "WHERE p.terrain.utilisateur=:utilisateurParam "
				+ "AND p.dateValidation IS NULL "
				+ "AND p.dateRefus IS NOT NULL ");
		query.setParameter("utilisateurParam", utilisateur);
		prestations = query.getResultList();
		return prestations;

	}
}
