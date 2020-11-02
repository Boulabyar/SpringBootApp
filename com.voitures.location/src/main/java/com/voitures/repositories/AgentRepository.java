package com.voitures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voitures.entities.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent,Long>{
	
}
