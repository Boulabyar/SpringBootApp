package com.voitures.repositories;

import java.util.List;

import com.voitures.entities.Model;
import com.voitures.entities.Voiture;

public interface VoitureRepositoryCustum {
	
	//Get Liste des voitures par Model
	
	List <Voiture> ListeVoituresBymodel(Model model);

}