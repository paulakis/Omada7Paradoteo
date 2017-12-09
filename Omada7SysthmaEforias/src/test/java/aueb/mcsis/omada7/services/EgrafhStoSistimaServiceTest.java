package aueb.mcsis.omada7.services;

import aueb.mcsis.omada7.services.eforia.EgrafhStoSistimaService;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import junit.framework.Assert;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import javax.persistence.EntityManager;

import org.junit.Test;

public class EgrafhStoSistimaServiceTest extends GenikoServiceTest {
	
	
	Date ho = new Date();
	private LogariasmosEtairias logEt = new LogariasmosEtairias(1, "KostasAE", ho , "123456678", "email@em.co", 2106547395,
			true, false);
	private LogariasmosEtairias logEtf = new LogariasmosEtairias(2, "RostasAE", ho , "12345667", "email@semm.co", 2107647395,
			true, false);
	private EgrafhStoSistimaService EgStoSys = new EgrafhStoSistimaService(em);
	
	@SuppressWarnings("deprecation")
	@Test
	public void testVresEanExeiKsanakataxwrhtheiToAfm(){
		
		
		Assert.assertNull(EgStoSys.VresEanExeiKsanakataxwrhtheiToAfm(logEt.getAfm()));
	}
	
	@SuppressWarnings("deprecation")
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
