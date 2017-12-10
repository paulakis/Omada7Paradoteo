package aueb.mcsis.omada7.services;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.services.eforia.ElegxosGiaAnantistixoiesService;

public class ElegxosAnantistoixiwnServiceTest extends GenikoServiceTest {
	
	ElegxosGiaAnantistixoiesService s;
	
	@Test
	public void TestfindallDhlwseis(){
		s=new ElegxosGiaAnantistixoiesService(em);
		Assert.assertEquals(s.findAllDhlwseis().size(), 3);
	}

}
