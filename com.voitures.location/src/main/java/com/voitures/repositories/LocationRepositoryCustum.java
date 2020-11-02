package com.voitures.repositories;

import java.util.List;

import com.voitures.entities.Client;
import com.voitures.entities.Location;
import com.voitures.entities.Voiture;

public interface LocationRepositoryCustum {
	
// Liste des Locations par Client 
	
	List <Location> ListeLocationsByClient(Client client);
	
// Liste des Locations par Voiture
	
	List<Location> ListeLocationByVoiture(Voiture voiture);
}