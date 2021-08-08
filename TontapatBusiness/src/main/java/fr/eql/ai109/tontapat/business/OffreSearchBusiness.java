package fr.eql.ai109.tontapat.business;

import java.util.List;

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
	
	OffreDTO offreDTO;
	List<OffreDTO> offresDTO;

	@Override
	public List<OffreDTO> findSearchResults(OffreSearch offreSearch) {
		
		System.out.println("********* RECHERCHE *********");
		System.out.println(" Terrain : " + offreSearch.getTerrain().getNom() + " (" + offreSearch.getTerrain().getId() + ")");
		System.out.println(" Date début : " + offreSearch.getDateDebut());
		System.out.println(" Date fin : " + offreSearch.getDateFin());
		System.out.println(" Installation : " + offreSearch.getInstallationAssuree());
		System.out.println(" Espèce préférée : " + (offreSearch.getEspece() != null ? offreSearch.getEspece().getNom() : "aucune"));
		System.out.println(" Prix maximum : " + offreSearch.getPrixMaximum());
		System.out.println(" ");
		List<Offre> offres = offreIDAO.getQueryResults(offreSearch);
		if (offres != null) {
			System.out.println("RESULTATS : " + offres.size());
		for (Offre o : offres) {
			System.out.println(" Offre n°" + o.getId() + " : " + o.getNom());
			offreDTO.setOffre(o);
			offreDTO.setSearch(offreSearch);
			offresDTO.add(findQualifiedResult(offreDTO));
		}
		return offresDTO;
		}
		else {
			System.out.println("Aucun résultat");
			return null;
		}
	}

	@Override
	public OffreDTO findQualifiedResult(OffreDTO offreDTO) {
		float distance = findDistanceBetween(offreDTO.getOffre().getTroupeau(), offreDTO.getSearch().getTerrain());
		
		
		return offreDTO;
	}

	private float findDistanceBetween(Troupeau troupeau, Terrain terrain) {

		return 0;
	}

}
