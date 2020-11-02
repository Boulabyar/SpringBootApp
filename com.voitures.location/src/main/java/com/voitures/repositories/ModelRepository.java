package com.voitures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voitures.entities.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long>{

	
}
