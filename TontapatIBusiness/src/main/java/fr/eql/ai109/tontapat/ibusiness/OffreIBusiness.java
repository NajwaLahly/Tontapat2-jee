package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface OffreIBusiness {
	public List<Offre> findAll();
	public List<Offre> findAllByCurrentUser(Utilisateur utilisateur);
	public Offre getById(int id);
	public List<OffreDTO> getSearchResults(OffreSearch offreSearch);
	public OffreDTO getQualifiedResult(OffreDTO offreDTO);
}

