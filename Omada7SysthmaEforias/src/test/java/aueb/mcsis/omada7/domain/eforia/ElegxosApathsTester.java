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
		
		
		
	}
}
