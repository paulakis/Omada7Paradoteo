package aueb.mcsis.omada7.domain.eforia;


import org.junit.Before;
import org.junit.Test;
import aueb.mcsis.omada7.domain.eforia.ElegxosAnantistixiwn;
import junit.framework.Assert;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;

public class ElegxosAnantistixoiwnTester {

	@Before
	//na kanei arxikopoihsh me ton initializer
	// dio dilwseis 4 parastatika gia na metrhsoume ti ginetai ,mia idia posa mia diaforetika kai tha doume ti tha epistrefei.
	@Test
	public void AnantistoixiaEnaProsEnaTester(){
		ElegxosAnantistixiwn ele = new ElegxosAnantistixiwn();
		//Dhlwsh d = new Dhlwsh();
		ele.setDiaforaposou(30000);
		Assert.assertEquals(ele.getDiaforaposou(), 30000.0);
		
		
		//Assert.assertTrue(ele.tsekareEanEntosXronikouOriou(d));
		//Assert.assertFalse(ele.tsekareEanEntosXronikouOriou(d));
	}
	
	
	
	
}
