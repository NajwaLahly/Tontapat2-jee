package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.OffreDTO;
import fr.eql.ai109.tontapat.entity.OffreSearch;

public interface OffreSearchIBusiness {
	public List<OffreDTO> findSearchResults(OffreSearch offreSearch);
	OffreDTO calculatePrice(OffreDTO offreDTO);
}
