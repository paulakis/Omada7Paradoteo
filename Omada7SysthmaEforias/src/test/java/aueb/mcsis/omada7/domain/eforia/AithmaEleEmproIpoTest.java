package aueb.mcsis.omada7.domain.eforia;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.AithmaElegxouEmprothesmisIpovolhs;

public class AithmaEleEmproIpoTest {
	
	@Test
	public void prwtoTest(){
	AithmaElegxouEmprothesmisIpovolhs aempI = new AithmaElegxouEmprothesmisIpovolhs(30000);
	
	Assert.assertEquals(30000, aempI.getProstimoekprothesmis(),0.01);
	}
	

	@Test
	public void ElegkseGiaEkprothesmh(){
	AithmaElegxouEmprothesmisIpovolhs aempI = new AithmaElegxouEmprothesmisIpovolhs(30000);
	Dhlwsh d = new Dhlwsh(1,new Date(),0 ,true);
	aempI.ElegkseGiaEkprothesmh(d);
	Assert.assertTrue(d.isEmprothesmh());

	}
	
	
	
}
