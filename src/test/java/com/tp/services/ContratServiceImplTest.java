package com.tp.services;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.tp.entities.Contrat;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ContratServiceImplTest {
	private static final Logger l = LogManager.getLogger(ContratServiceImplTest.class);


	@Autowired
	IContratService cn;
	
	Contrat testCaseContrat;

	@Test
	@Order(1)
	public void isConnectingtoDb() {
		List<Contrat> listContrats = cn.RetrieveAllContrat();
		Assertions.assertNotNull(listContrats);

	}

	@Test
	@Order(2)
	public void addContrat() throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2015-03-23");
		
		Contrat cont = new Contrat( d,"CDI", (float)3000);
		this.testCaseContrat = cn.addContrat(cont);
		l.info(this.testCaseContrat);
		Assertions.assertEquals(cont.getDateDebut(),this.testCaseContrat.getDateDebut());
	}
	
	@Test
	@Order(3)
	public void retrieveContrat() {
		List<Contrat> listContrat = cn.RetrieveAllContrat();
		Assertions.assertEquals(3,listContrat.size());

	}

	@Test
	@Order(4)
	public void modifyUser() {
		Contrat cont = cn.retrieveContrat(7);
		cont.setTypeContrat("CDD");
		this.testCaseContrat = cn.updateContrat(cont);
		Assertions.assertEquals("CDD", this.testCaseContrat.getTypeContrat());
	}
	
	@Test
	@Order(5)
	public void deleteContrat() {
		cn.deleteContrat(6);
		Contrat usr = cn.retrieveContrat(6);
		Assertions.assertNull(usr);
	}

}
