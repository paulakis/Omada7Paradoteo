package aueb.mcsis.omada7.domain.eforia;


import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import aueb.mcsis.omada7.domain.eforia.ElegxosAnantistixiwn;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.Trimhno;
public class ElegxosAnantistixoiwnTester {

	@Before
	
	@Test
	public void AnantistoixiaEnaProsEnaTester(){
		ElegxosAnantistixiwn ele = new ElegxosAnantistixiwn(20000);
		//Dhlwsh d = new Dhlwsh();
		ele.setDiaforaposou(30000);
		Assert.assertEquals(ele.getDiaforaposou(), 30000.0, 0.1);
		 LocalDate a=  LocalDate.of(2017, 10, 2);
		 LocalDate b= LocalDate.of(2017, 7, 15);
		 
		 Dhlwsh d = new Dhlwsh(3,a,0,true);
		 Dhlwsh d1 = new Dhlwsh(3,a,0,false);
		Trimhno tr=new Trimhno(d.getSubmissiondate().getMonthValue(), d.getSubmissiondate().getYear(), d.getSubmissiondate().getDayOfMonth());
		Assert.assertFalse(ele.tsekareEanEntosXronikouOriou(d));
		Assert.assertFalse(ele.tsekareEanEntosXronikouOriou(d1));
	}}
	
	
	
	

