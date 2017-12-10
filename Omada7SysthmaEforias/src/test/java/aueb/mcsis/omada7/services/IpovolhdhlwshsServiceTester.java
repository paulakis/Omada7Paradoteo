package aueb.mcsis.omada7.services;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.services.eforia.IpovolhDhlwshsService;

public class IpovolhdhlwshsServiceTester extends GenikoServiceTest {

	
	IpovolhDhlwshsService ipo=new IpovolhDhlwshsService(em);
	
	
	@Test
	public void VresEtairiaTester(){
		ipo=new IpovolhDhlwshsService(em);
		String afmhdhentos="987654321";
		 LogariasmosEtairias VEROPOULOS = new LogariasmosEtairias(1, "veropoulos",new Date(), "987654321", "veropoulos@ver.gr",2102574575,
			        true, true);
		Assert.assertEquals(ipo.VresEtairia(afmhdhentos),VEROPOULOS);
		Assert.assertNull(ipo.VresEtairia(""));
	}
	
	@Test
	public void TestKaneNeaDhlwsh(){
		ipo=new IpovolhDhlwshsService(em);
		ipo.VresEtairia("987654322");
		ipo.KaneNeaDhlwsh(3);
		Assert.assertEquals(ipo.fereArithmoDhlwsewn(),4);
		
	}
	
	@Test
	public void TestNaMhnThnVazeiThNeaDhlwsh(){
		ipo=new IpovolhDhlwshsService(em);
		ipo.VresEtairia("987654321");
		ipo.KaneNeaDhlwsh(3);
		Assert.assertNull(ipo.KaneNeaDhlwsh(3));
		Assert.assertEquals(ipo.fereArithmoDhlwsewn(), 3);
	}
	//den paizei
	@Test
	public void TestVresDhlwshById(){
		ipo=new IpovolhDhlwshsService(em);
		//kane mia nea dhlwsh prwta kai meta koita
		Dhlwsh d=ipo.KaneNeaDhlwsh(5);
		Assert.assertNotNull(ipo.VresDhlwshById(d.getId()));
		
	}
	
	@Test
	public void TestVresDhlwshByIdDenIparxei(){
		ipo=new IpovolhDhlwshsService(em);
		Assert.assertNull(ipo.VresDhlwshById(2569));
	}
	
	//exoume ena provlimataki.den vazei t parastatiko
	@Test
	public void TestValeNeoParastatiko(){
		//kane nea dhlwsh kai vale kai ena parastatiko alla den mporw na ta valw swsta
		ipo=new IpovolhDhlwshsService(em);
		Assert.assertFalse(ipo.ValeNeoParastatiko(1));
		Assert.assertEquals(ipo.fereTaParastatika(),9);
	}
	
	
}
