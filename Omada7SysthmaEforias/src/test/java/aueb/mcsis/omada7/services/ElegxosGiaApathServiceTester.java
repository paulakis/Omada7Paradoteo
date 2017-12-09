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
	
	@Test
	public void DenIparxeiHSigekrimenhDhlwsh(){
		ElegxosGiaApathService e=new ElegxosGiaApathService(em);
		//Auth h dhlwsh den prepei na iparxei
		Assert.assertFalse(e.findDhlwshById(15));
	}
	

	@Test
	public void IparxeiHSigekrimenhDhlwsh(){
		ElegxosGiaApathService e=new ElegxosGiaApathService(em);
		//Auth h dhlwsh  prepei na iparxei
	    
		//Assert.assertTrue(e.findDhlwshById(2));
		Assert.assertNotNull(e.findDhlwshById(1));
	}
	
	
	
	
	
	@After
	public final void tearDown() {
		em.close();
	}

	
}
