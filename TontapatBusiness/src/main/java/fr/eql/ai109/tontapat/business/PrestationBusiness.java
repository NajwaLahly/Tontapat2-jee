package fr.eql.ai109.tontapat.business;


import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Notification;
import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.PrestationIBusiness;
import fr.eql.ai109.tontapat.idao.PrestationIDAO;

@Remote(PrestationIBusiness.class)
@Stateless
public class PrestationBusiness implements PrestationIBusiness {

	@EJB
	private PrestationIDAO prestationIDAO;

	@Override
	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix) {
		prestationIDAO.createPrestationOffer(offre,idTerrain,debut, fin, prix);	
	}
	
	@Override
	public Prestation createFromOffreDTO(OffreDTO offreDTO) {
		return prestationIDAO.createFromOffreDTO(offreDTO);
	}

	@Override
	public List<Prestation> findAllByCurrentUser(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return prestationIDAO.getPrestationsByUtilisateur(utilisateur);

	}

	public Prestation findById(int id) {
		return prestationIDAO.getById(id);
	}

	@Override
	public List<Prestation> findAllNotificationsByCurrentUser(Utilisateur utilisateur) { //Ajout Elodie
		return prestationIDAO.getDemandesReservationByUtilisateur(utilisateur);
	}


	@Override
	public List<Prestation> findValidatedPrestation(Utilisateur utilisateur){
		return prestationIDAO.getDemandesReservationOffreAccepted(utilisateur);
	}

	public void validate(Prestation prestation) {
		prestation.setDateValidation(new Date());
		prestation.setStatut(1);
		prestationIDAO.update(prestation);
		
	}

	@Override
	public List<Prestation> findRefusedPrestation(Utilisateur utilisateur) {
		return prestationIDAO.getDemandesReservationOffreRefused(utilisateur);
	}

}
