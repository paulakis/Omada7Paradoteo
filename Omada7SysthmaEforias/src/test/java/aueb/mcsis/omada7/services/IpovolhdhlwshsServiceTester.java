package aueb.mcsis.omada7.services;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.services.eforia.IpovolhDhlwshsService;

public class IpovolhdhlwshsServiceTester extends GenikoServiceTest {

	
	IpovolhDhlwshsService ipo;
	
	
	@Test
	public void VresEtairiaTester(){
		String afmhdhentos="987654321";
		ipo = new IpovolhDhlwshsService(em);
		 LogariasmosEtairias VEROPOULOS = new LogariasmosEtairias(1, "veropoulos",new Date(), "987654321", "veropoulos@ver.gr",2102574575,
			        true, true);
		Assert.assertEquals(ipo.VresEtairia(afmhdhentos),VEROPOULOS);
		Assert.assertNull(ipo.VresEtairia(""));
	}
	
	@Test
	public void TestKaneNeaDhlwsh(){
		ipo = new IpovolhDhlwshsService(em);
		ipo.VresEtairia("987654322");
		ipo.KaneNeaDhlwsh(3);
		Assert.assertEquals(ipo.fereArDhlwsewn(),4);
		
	}
	
	@Test
	public void TestNaMhnThnVazeiThNeaDhlwsh(){
		ipo = new IpovolhDhlwshsService(em);
		ipo.VresEtairia("987654321");
		ipo.KaneNeaDhlwsh(3);
		Assert.assertNull(ipo.KaneNeaDhlwsh(3));
		Assert.assertEquals(ipo.fereArDhlwsewn(), 3);
	}
	
	@Test
	public void TestVresDhlwshById(){
		
	}
	
	
	
	
	
}
