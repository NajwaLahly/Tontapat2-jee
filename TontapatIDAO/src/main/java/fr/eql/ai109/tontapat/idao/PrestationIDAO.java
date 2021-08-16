package fr.eql.ai109.tontapat.idao;

import java.util.Date;
import java.util.List;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.Prestation;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface PrestationIDAO extends GenericIDAO<Prestation> {

	public Prestation createFromOffreDTO(OffreDTO offreDTO);

	public void createPrestationOffer(Offre offre,int idTerrain,Date debut, Date fin, float prix);
	
	public List<Prestation> getPrestationsByUtilisateur(Utilisateur utilisateur);
	
	public List<Prestation> getDemandesReservationByUtilisateur(Utilisateur utilisateur); //Ajout Elodie
}
