package aueb.mcsis.omada7.services;


import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.ElegxosApaths;
import aueb.mcsis.omada7.services.GenikoServiceTest;
import aueb.mcsis.omada7.services.eforia.ElegxosGiaApathService;

public class ElegxosGiaApathServiceTester extends GenikoServiceTest{
	
	private ElegxosGiaApathService natos;
	public ElegxosGiaApathServiceTester() {
		super();
	}



	// prepei na doume ama exoume kapoia apath mesa ston pinaka 
	 
	
	@Test
	public void testFindElegxosApathsById()
	{
		//ftiaxnw ena antikeimeno tipou elegxos apaths kai to vazw sth vash
		ElegxosApaths e=new ElegxosApaths();
		natos=new ElegxosGiaApathService(em);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
		Assert.assertTrue(natos.FindElegxosApathsById(e.getId()));
		//gia kapoio logo den paizei
		Assert.assertEquals(natos.ferePosesEggrafes(), 1);
	}
	
	
	
	@Test
	public void testfindDhlwshById(){
		//kanw mia dhlwsh 
		//kai ena dio parastatika me apokleinouses times 
		//kanw elegxo 
		//koitaw ama thn evale mesa ston pinaka
		//kalw kai ena elegxo apaths
		
	
	}
	
	
	
	@Test
	public void testGirnaeiToAfmThsApaths(){
		
	}
	
	
	
	
	
	


	
}
