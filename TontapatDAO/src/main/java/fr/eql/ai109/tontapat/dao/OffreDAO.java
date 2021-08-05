package fr.eql.ai109.tontapat.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Query;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.OffreSearch;
import fr.eql.ai109.tontapat.entity.Utilisateur;
import fr.eql.ai109.tontapat.idao.OffreIDAO;

@Remote(OffreIDAO.class)
@Stateless
public class OffreDAO  extends GenericDAO<Offre> implements OffreIDAO {

	@Override
	public List<Offre> getAllByUtilisateur(Utilisateur utilisateur) {
		List<Offre> offres = null;
		Query query = em.createQuery("SELECT o FROM Offre o WHERE o.id_utilisateur=:utilisateurParam");
		query.setParameter("utilisateurParam", utilisateur.getId());
		return offres;
	}

	@Override
	public List<Offre> getQueryResults(OffreSearch offreSearch) {
		List<Offre> offres = null;
		Query query = em.createQuery(
				"SELECT o"
						+ "FROM Offre o"
						+ "WHERE o.dateDebut <= :dateDebutParam"
						+ "AND o.dateFin >= :dateFinParam"
						+ "AND o.troupeau.race.espece == :especeParam"
						+ "AND o.installationAssuree == :installationAssureeParam");
		query.setParameter("dateDebutParam", offreSearch.getDateDebut());
		query.setParameter("dateFinParam", offreSearch.getDateFin());
		query.setParameter("especeParam", offreSearch.getEspece());
		query.setParameter("installationAssureeParam", offreSearch.getInstallationAssuree());

		return offres;
	}
	public List<Offre> getSearchResults(OffreSearch offreSearch) {
		// TODO Auto-generated method stub
		return null;
	}

}
