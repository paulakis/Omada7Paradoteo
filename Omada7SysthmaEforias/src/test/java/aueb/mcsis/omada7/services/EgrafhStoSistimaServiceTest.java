package aueb.mcsis.omada7.services;

import aueb.mcsis.omada7.services.eforia.EgrafhStoSistimaService;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import junit.framework.Assert;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import javax.persistence.EntityManager;

import org.junit.Test;

public class EgrafhStoSistimaServiceTest {
	
	private EntityManager em;
	Date ho = new Date(2017,12,17);
	private LogariasmosEtairias logEt = new LogariasmosEtairias(1, "KostasAE", ho , "123456678", "email@em.co", 2106547395,
			true, false);
	private LogariasmosEtairias logEtf = new LogariasmosEtairias(1, "KostasAE", ho , "12345667", "email@em.co", 2106547395,
			true, false);
	EgrafhStoSistimaService EgStoSys = new EgrafhStoSistimaService(em);
	
	@Test
	public void testKaneNeaEggrafh(){
		
		Assert.assertTrue(EgStoSys.KaneNeaEggrafh(logEt));
		
		
		//Assert.assertTrue();
		
		
	}
	
	@Test
	public void testEgirosAfm(){
				
		
		
		
		Assert.assertTrue(EgStoSys.EgirosAfm(logEt));
		Assert.assertFalse(EgStoSys.EgirosAfm(logEtf));
		
		
		
		
	}
	
	
}
