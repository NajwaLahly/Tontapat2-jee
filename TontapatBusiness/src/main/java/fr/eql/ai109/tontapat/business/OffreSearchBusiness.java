package fr.eql.ai109.tontapat.business;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.entity.Terrain;
import fr.eql.ai109.tontapat.entity.Troupeau;
import fr.eql.ai109.tontapat.ibusiness.OffreSearchIBusiness;
import fr.eql.ai109.tontapat.idao.OffreIDAO;

@Remote(OffreSearchIBusiness.class)
@Stateless
public class OffreSearchBusiness implements OffreSearchIBusiness {

	@EJB
	private OffreIDAO offreIDAO;

	@Override
	public List<OffreDTO> findSearchResults(OffreSearch offreSearch) {

		System.out.println("********* RECHERCHE *********");
		System.out.println(
				" Terrain : " + offreSearch.getTerrain().getNom() + " (" + offreSearch.getTerrain().getId() + ")");
		System.out.println(" Date début : " + offreSearch.getDateDebut());
		System.out.println(" Date fin : " + offreSearch.getDateFin());
		System.out.println(" Installation : " + offreSearch.getInstallationAssuree());
		System.out.println(" Espèce préférée : "
				+ (offreSearch.getEspece() != null ? offreSearch.getEspece().getNom() : "aucune"));
		System.out.println(" Prix maximum : " + offreSearch.getPrixMaximum());
		System.out.println(" ");

		List<Offre> offres = offreIDAO.getQueryResults(offreSearch);

		if (offres != null) {
			List<OffreDTO> offresDTO = new ArrayList<OffreDTO>();
			System.out.println("RESULTATS : " + offres.size());
			for (Offre o : offres) {
				OffreDTO offreDTO = new OffreDTO();
				System.out.println(" Offre n°" + o.getId() + " : " + o.getNom());
				offreDTO.setOffre(o);
				offreDTO.setSearch(offreSearch);
				offreDTO = calculatePrice(offreDTO);
//				if (offreDTO.getPrixTotal() <= offreSearch.getPrixMaximum())
					offresDTO.add(offreDTO);
			}
			return offresDTO;
		} else {
			System.out.println("Aucun résultat");
			return null;
		}
	}

	@Override
	public OffreDTO calculatePrice(OffreDTO offreDTO) {
		float prixBeteJour = offreDTO.getOffre().getPrixBeteJour();
		float prixInstallation = offreDTO.getOffre().getPrixInstallation();
		float prixIntervention = offreDTO.getOffre().getPrixIntervention();
		float prixKm = offreDTO.getOffre().getPrixKm();

		//double distance = findDistanceBetween(offreDTO.getOffre().getTroupeau(), offreDTO.getSearch().getTerrain());
		float distance = 55;
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
//		Date dateFin = sdf.parse(offreDTO.getOffre().getDateFin().toString());
//		int a = 1;
//		Date dateDebut = sdf.parse(offreDTO.getOffre().getDateDebut());
//		long dureeEnMillisecondes = Math.abs(dateFin.getTime() - dateDebut.getTime());
//		long duree = TimeUnit.DAYS.convert(dureeEnMillisecondes, TimeUnit.MILLISECONDS);
		int duree = 15;
		
		int nombreBetes = (int) (offreDTO.getSearch().getTerrain().getSuperficie() / duree / 10);

		float fraisInstallation = prixKm * prixInstallation * distance * 2;
		float fraisBetail = prixBeteJour * nombreBetes * duree;
		float fraisIntervention = duree / offreDTO.getOffre().getFrequenceIntervention() * prixIntervention;
		float fraisTotaux = fraisInstallation + fraisBetail + fraisIntervention;
		float fraisService = (float) (fraisTotaux * 0.1);
		float TVA = (float) ((fraisTotaux + fraisService) * 0.2);
		float prixTotal = fraisTotaux + fraisService + TVA;
		
		offreDTO.setFraisBetail(fraisBetail);
		offreDTO.setFraisInstallation(fraisInstallation);
		offreDTO.setFraisIntervention(fraisIntervention);
		offreDTO.setFraisService(fraisService);
		offreDTO.setPrixTotal(prixTotal);
		return offreDTO;
	}

	private float findDistanceBetween(Troupeau troupeau, Terrain terrain) {

		return 0;
	}

}
