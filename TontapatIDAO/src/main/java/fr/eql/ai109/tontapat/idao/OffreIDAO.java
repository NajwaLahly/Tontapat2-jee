package fr.eql.ai109.tontapat.idao;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface OffreIDAO extends GenericIDAO<Offre> {
	public List<Offre> getAllByUtilisateur(Utilisateur utilisateur);
	public List<Offre> getQueryResults(OffreSearch offreSearch);
}
