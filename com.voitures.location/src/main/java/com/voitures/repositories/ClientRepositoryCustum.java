package com.voitures.repositories;

import com.voitures.entities.Client;

public interface ClientRepositoryCustum {
	
	//Get client par nom
	
	Client GetClientByname(String name);

}
