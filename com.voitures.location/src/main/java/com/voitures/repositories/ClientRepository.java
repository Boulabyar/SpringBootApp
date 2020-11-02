package com.voitures.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voitures.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> , ClientRepositoryCustum{

}
