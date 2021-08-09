package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Offre;
import fr.eql.ai109.tontapat.entity.Utilisateur;

public interface OffreIBusiness {
	public List<Offre> findAll();
	public List<Offre> findAllByCurrentUser(Utilisateur utilisateur);
	public Offre findById(int id);
}

