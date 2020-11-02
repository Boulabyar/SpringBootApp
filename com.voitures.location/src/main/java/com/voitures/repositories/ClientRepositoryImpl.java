package com.voitures.repositories;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.voitures.entities.Client;



@Repository
@Transactional(readOnly = true)
public class ClientRepositoryImpl implements ClientRepositoryCustum {
	
@PersistenceContext
EntityManager entityManager;

// Get Client par nom

public Client GetClientByname(String name) {
	Query query = entityManager.createNativeQuery("SELECT c.* from Client c"+"WHERE c.name LIKE ?", Client.class);
	query.setParameter(1, name + "%");
	return (Client) query.getSingleResult();
}

}
