package aueb.mcsis.omada7.services;


import java.util.Date;

import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.ElegxosApaths;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
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
		
		natos=new ElegxosGiaApathService(em);
		ElegxosApaths e=new ElegxosApaths();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
		Assert.assertTrue(natos.FindElegxosApathsById(e.getId()));
		//gia kapoio logo den paizei
		//Assert.assertEquals(natos.ferePosesEggrafes(), 1);
	}
	 
	
	/*
	
	@Test
	public void testfindDhlwshById(){
		Dhlwsh d=new Dhlwsh(3,new Date(2017, 10, 2), 0, true);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(d);
		tx.commit();
		
		//kanw mia dhlwsh 
		//kai ena dio parastatika me apokleinouses times 
		//kanw elegxo 
		//koitaw ama thn evale mesa ston pinaka
		//kalw kai ena elegxo apaths
		
	
	}
	
	
	
	@Test
	public void TestIpologismosApaths(){
		natos=new ElegxosGiaApathService(em);
		Dhlwsh d=new Dhlwsh(3,new Date(2017, 10, 2), 0, true);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(d);
		tx.commit();
		Parastatiko p1=new Parastatiko("252525252", 100,true, 10000, new Date());
		Parastatiko p2=new Parastatiko("102030405", 101,false, 100, new Date());
		em.persist(p1);
		em.persist(p2);
		natos.ipologismosApaths(d);
		//Assert.assertEquals(natos.ferePosesEggrafes(),1);
	}
	
	
	
	
	*/
	


	
}
