package aueb.mcsis.omada7.domain.eforia;


import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import aueb.mcsis.omada7.domain.eforia.ElegxosAnantistixiwn;
import junit.framework.Assert;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.Trimhno;
public class ElegxosAnantistixoiwnTester {

	@Before
	//na kanei arxikopoihsh me ton initializer
	// dio dilwseis 4 parastatika gia na metrhsoume ti ginetai ,mia idia posa mia diaforetika kai tha doume ti tha epistrefei.
	@Test
	public void AnantistoixiaEnaProsEnaTester(){
		ElegxosAnantistixiwn ele = new ElegxosAnantistixiwn(20000);
		//Dhlwsh d = new Dhlwsh();
		ele.setDiaforaposou(30000);
		Assert.assertEquals(ele.getDiaforaposou(), 30000.0);
		 Date a= new Date(2017, 10, 2);
		 Date b= new Date(2017, 7, 15);
		 
		 Dhlwsh d = new Dhlwsh(3,a,0,true);
		 Dhlwsh d1 = new Dhlwsh(3,a,0,false);
		Trimhno tr=new Trimhno(d.getSubmissiondate().getMonth(), d.getSubmissiondate().getYear(), d.getSubmissiondate().getDay());
		Assert.assertFalse(ele.tsekareEanEntosXronikouOriou(d));
		Assert.assertFalse(ele.tsekareEanEntosXronikouOriou(d1));
	}}
	
	
	
	

