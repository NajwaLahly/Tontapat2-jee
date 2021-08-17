package fr.eql.ai109.tontapat.business;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
			int i = 0;
			for (Offre o : offres) {
				OffreDTO offreDTO = new OffreDTO();
				offreDTO.setId(i);
				i++;
				System.out.println(" Offre n°" + o.getId() + " : " + o.getNom());
				offreDTO.setOffre(o);
				offreDTO.setSearch(offreSearch);
				
				//Calcul du prix
				offreDTO = calculatePrice(offreDTO);
				//if (offreDTO.getPrixTotal() <= offreSearch.getPrixMaximum())
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
		int frequenceIntervention = offreDTO.getOffre().getFrequenceIntervention();

		//double distance = findDistanceBetween(offreDTO.getOffre().getTroupeau(), offreDTO.getSearch().getTerrain());
		float distance = 55;
		float superficie = offreDTO.getSearch().getTerrain().getSuperficie() * 10000;
		float surfaceConsommeeParJour = 10;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
//		Date dateFin = sdf.parse(offreDTO.getOffre().getDateFin().toString());
//		int a = 1;
//		Date dateDebut = sdf.parse(offreDTO.getOffre().getDateDebut());
//		long dureeEnMillisecondes = Math.abs(dateFin.getTime() - dateDebut.getTime());
//		long duree = TimeUnit.DAYS.convert(dureeEnMillisecondes, TimeUnit.MILLISECONDS);
		int duree = 15;
		
		int nombreBetes = (int) (superficie / (duree * surfaceConsommeeParJour));

		float fraisInstallation = (prixKm * prixInstallation * distance * superficie / 100) * 2;
		float fraisBetail = (prixBeteJour * nombreBetes * duree);
		float fraisIntervention = (duree / frequenceIntervention * prixIntervention * distance * prixKm * 5);
		float fraisTotaux = (fraisInstallation + fraisBetail + fraisIntervention);
		float fraisService = (float) (fraisTotaux * 0.1);
		float TVA = (float) ((fraisTotaux + fraisService) * 0.2);
		float prixTotal = (fraisTotaux + fraisService + TVA);
		
		fraisInstallation = Math.round(fraisInstallation * 100) / 100;
		fraisBetail = Math.round(fraisBetail * 100) / 100;
		fraisIntervention = Math.round(fraisIntervention * 100) / 100;
		fraisTotaux = Math.round(fraisTotaux * 100) / 100;
		fraisService = Math.round(fraisService * 100) / 100;
		TVA = Math.round(TVA * 100) / 100;
		prixTotal = Math.round(prixTotal * 100) / 100;
		
		offreDTO.setNombreBetes(nombreBetes);
		offreDTO.setFraisBetail(fraisBetail);
		offreDTO.setFraisInstallation(fraisInstallation);
		offreDTO.setFraisIntervention(fraisIntervention);
		offreDTO.setFraisService(fraisService);
		offreDTO.setTVA(TVA);
		offreDTO.setPrixTotal(prixTotal);
		return offreDTO;
	}

	private float findDistanceBetween(Troupeau troupeau, Terrain terrain) {

		return 0;
	}

}
