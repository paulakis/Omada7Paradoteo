package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class ElegxosApathsTester {
	@SuppressWarnings("deprecation")
	@Test
	public void ElegkseAnperasan35Meres(){
		Dhlwsh d1= new Dhlwsh(3,new Date(2017, 11, 8), 0, true);
		Dhlwsh d2= new Dhlwsh(3,new Date(2017, 10, 10), 0, true);
		ElegxosApaths elegxosApaths1=new ElegxosApaths();
		ElegxosApaths elegxosApaths2=new ElegxosApaths();
		//trexoun apla kanoun mia vlakia
		Assert.assertEquals(elegxosApaths1.ElegkseAnPerasan35Meres(d1),true);
		Assert.assertEquals(elegxosApaths2.ElegkseAnPerasan35Meres(d2),false);
		
		/*elegxosApaths1.setApath(true);
		elegxosApaths1.setProstimo(3000000);
		elegxosApaths1.setSoumaesodwneskodwn(20000);
		Assert.assertEquals(3000000,elegxosApaths1.getProstimo());
		Assert.assertEquals(20000,elegxosApaths1.getSoumaesodwneskodwn());
		Assert.assertEquals(true, elegxosApaths1.isApath()); */
		
		
	}
	@Test
	public void GenikaTest(){
		ElegxosApaths elegxosApaths2=new ElegxosApaths(3000000,20000,false);
		elegxosApaths2.setApath(true);
		//elegxosApaths2.setProstimo(3000000);
		//elegxosApaths2.setSoumaesodwneskodwn(20000);
		//Assert.assertEquals(3000000,elegxosApaths2.getProstimo());
		//Assert.assertEquals(20000,elegxosApaths2.getSoumaesodwneskodwn());
		Assert.assertEquals(true, elegxosApaths2.isApath()); 
		
	}
	
}
