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
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.ibusiness.OffreIBusiness;
import fr.eql.ai109.tontapat.idao.OffreIDAO;

@Remote(OffreIBusiness.class)
@Stateless
public class OffreBusiness implements OffreIBusiness {

	@EJB
	private OffreIDAO offreIDAO;

	public List<Offre> findAll() {
		return offreIDAO.getAll();
	}

	@Override
	public List<Offre> findAllByCurrentUser(Utilisateur utilisateur) {
		return offreIDAO.getOffresByUtilisateur(utilisateur);
	}

	@Override
	public Offre findById(int id) {
		return offreIDAO.getById(id);
	}

	@Override
	public List<OffreDTO> findSearchResults(OffreSearch offreSearch) {
		List<Offre> offres = offreIDAO.getQueryResults(offreSearch);
		List<OffreDTO> offresDTO = null;
		for (Offre o : offres) {
			OffreDTO offreDTO = new OffreDTO();
			offreDTO.setOffre(o);
			offreDTO.setSearch(offreSearch);
			offresDTO.add(findQualifiedResult(offreDTO));
		}
		return offresDTO;
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
