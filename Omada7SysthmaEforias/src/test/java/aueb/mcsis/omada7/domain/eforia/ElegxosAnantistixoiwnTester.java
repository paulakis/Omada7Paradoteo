package aueb.mcsis.omada7.domain.eforia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElegxosAnantistixoiwnTester {

	@Before
	//na kanei arxikopoihsh me ton initializer
	// dio dilwseis 4 parastatika gia na metrhsoume ti ginetai ,mia idia posa mia diaforetika kai tha doume ti tha epistrefei.
	@Test
	public void AnantistoixiaEnaProsEnaTester(){
		Assert.assertEquals(new ElegxosAnantistixiwn().AnantistoixiesEnaProsEna().size(),2);
	}
	
}
