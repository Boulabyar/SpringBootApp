package com.voitures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voitures.entities.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> , VoitureRepositoryCustum{

	
}
