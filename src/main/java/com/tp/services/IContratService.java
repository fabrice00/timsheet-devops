package com.tp.services;

import java.util.List;

import com.tp.entities.Contrat;

public interface IContratService {
	
	 
		List<Contrat> RetrieveAllContrat(); 
		Contrat addContrat(Contrat c);
		void deleteContrat(int id);
		Contrat updateContrat(Contrat u);
		Contrat retrieveContrat(int id);

}
