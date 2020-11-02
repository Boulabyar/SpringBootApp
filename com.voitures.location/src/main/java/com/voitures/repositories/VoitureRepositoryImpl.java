package com.voitures.repositories;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.voitures.entities.Model;
import com.voitures.entities.Voiture;



@Repository
@Transactional(readOnly = true)
public class VoitureRepositoryImpl implements VoitureRepositoryCustum {
	
@PersistenceContext
EntityManager entityManager;

// Liste des voitures par model


public List <Voiture> ListeVoituresBymodel(Model model) {
	Query query = entityManager.createNativeQuery("SELECT v.* from Voiture v"+"WHERE v.model.id = ?", Voiture.class);
	query.setParameter(1, model.getId() + "%");
	return query.getResultList();
}

}
