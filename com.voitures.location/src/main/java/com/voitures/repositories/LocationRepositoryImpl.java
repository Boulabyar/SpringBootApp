package com.voitures.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.voitures.entities.Client;
import com.voitures.entities.Location;
import com.voitures.entities.Voiture;

@Repository
@Transactional(readOnly = true)
public class LocationRepositoryImpl implements LocationRepositoryCustum {
	
@PersistenceContext
EntityManager entityManager;

//Liste des Locations par Client 

	public List <Location> ListeLocationsByClient(Client client){
		Query query = entityManager.createNativeQuery("SELECT l.* from Location l"+"WHERE l.client.id = ?", Location.class);
		query.setParameter(1, client.getId() + "%");
		return query.getResultList();
	}
	
//Liste des Locations par Voiture
	
	public List<Location> ListeLocationByVoiture(Voiture voiture) {
		Query query = entityManager.createNativeQuery("SELECT l.* from Location l"+"WHERE l.voiture.id = ?", Location.class);
		query.setParameter(1, voiture.getId() + "%");
		return query.getResultList();
}
}
