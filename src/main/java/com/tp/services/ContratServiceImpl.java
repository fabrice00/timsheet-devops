package com.tp.services;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.entities.Contrat;
import com.tp.repositories.ContratRepository;

@Service
public class ContratServiceImpl implements IContratService {

	@Autowired
	ContratRepository contratRepository;

	private static final Logger l = LogManager.getLogger(ContratServiceImpl.class);



	
	
	@Override
	public List<Contrat> RetrieveAllContrat() { 
		List<Contrat> contrats = null; 
		try {
	
			l.info("In retrieveAllContrat() : ");
			contrats = (List<Contrat>) contratRepository.findAll();  
			for (Contrat contrat : contrats) {
				l.debug("contrat +++ : " + contrat);
			} 
			l.info("Out of retrieveAllContrat() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllContrat() : " + e);
		}

		return contrats;
	}


	@Override
	public Contrat addContrat(Contrat c) {
		return contratRepository.save(c); 
	}

	@Override 
	public Contrat updateContrat(Contrat c) { 
		return contratRepository.save(c);
	}

	@Override
	public void deleteContrat(int id) {
		contratRepository.deleteById(id);
	}


	@Override
	public Contrat retrieveContrat(int id) {
		l.debug(id);
		try {
		Optional<Contrat> c = contratRepository.findById(id);
		if(c.isPresent()) {
			Contrat temp = c.get();
			return temp;
		}
		return null;
		}
		catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
