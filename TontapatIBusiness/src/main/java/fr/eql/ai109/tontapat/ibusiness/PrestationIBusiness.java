package fr.eql.ai109.tontapat.ibusiness;

import java.util.Date;
import java.util.List;

import fr.eql.ai109.tontapat.entity.Notification;
import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface PrestationIBusiness {

	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix);
	
	public Prestation createFromOffreDTO(OffreDTO offreDTO);
	
	public List<Prestation> findAllByCurrentUser(Utilisateur utilisateur);

	public Prestation findById(int id);
	
	public List<Prestation> findAllNotificationsByCurrentUser(Utilisateur utilisateur); //Ajout Elodie

	public List<Prestation> findValidatedPrestation(Utilisateur utilisateur); // Ajout Elodie

	public List<Prestation> findRefusedPrestation(Utilisateur utilisateur); //Ajout Elodie
	
	public void validate(Prestation prestation);
	
}
