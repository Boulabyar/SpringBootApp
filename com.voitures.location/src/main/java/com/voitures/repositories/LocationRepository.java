package com.voitures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voitures.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> , LocationRepositoryCustum{

	
}
