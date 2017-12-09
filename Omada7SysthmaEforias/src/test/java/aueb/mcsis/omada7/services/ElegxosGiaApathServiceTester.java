package aueb.mcsis.omada7.services;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.ElegxosApaths;
import aueb.mcsis.omada7.persistence.eforia.*;
import aueb.mcsis.omada7.services.eforia.ElegxosGiaApathService;


public class ElegxosGiaApathServiceTester {
	
	Initializer dataHelper;
	private EntityManager em;

		
	public ElegxosGiaApathServiceTester() {
		super();
	}


	@Before
	public final void setUp() {
		dataHelper = new Initializer();
		dataHelper.prepareData();
		em = JPAUtil.getCurrentEntityManager();
		
	}
	// prepei na doume ama exoume kapoia apath mesa ston pinaka 
	 
	
	@Test
	public void testFindElegxosApathsById()
	{
		
	}
	
	@Test
	public void testfindDhlwshById(){
	
	}
	
	@Test
	public void testGirnaeiToAfmThsApaths(){
		
	}
	
	
	
	
	
	
	@After
	public final void tearDown() {
		em.close();
	}

	
}
