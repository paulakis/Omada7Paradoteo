package aueb.mcsis.omada7.domain.eforia;

import org.junit.Assert;
import org.junit.Test;

public class ElegxosApathsTester {
	//na valoume th dhlwsh pou theloume na kanoume gia na doume ta analoga apotelesmata
	
	Dhlwsh d;
	ElegxosApaths e;
	//sto initializer na valoume kai kapoies akraies periptwseis
	//mia dhlwsh polla parastatika
	//otan den einai apath
	@Test
	public void IpopsifiaApathIsaTester(){
		//tha pairnei mia dhlwsh me tria parastatika 
		Assert.assertTrue((e.Ipopsifiaapath()==0));
	}
	
	@Test
	public void IpopsifiaApathNotTester(){
		//tha pairnei mia dhlwsh me tria parastatika gia na leei oti iparxei kapoia anantistoixia 
		Assert.assertTrue(!(e.Ipopsifiaapath()==0));
	}
	
	@Test 
	public void EinaiApathTester(){
		Assert.assertTrue((e.EinaiApath(e.Ipopsifiaapath())));
		Assert.assertFalse(!(e.EinaiApath(e.Ipopsifiaapath())));
	}
	
	@Test
	public void ToGirnaeiToAfmTester(){
		// an valoume kai mia kenh dhlwsh kai na paroume null
		Assert.assertEquals(e.GirnaeiToAfmThsApaths(), d.getEtairia().getAfm());
	}
	
	
	@Test 
	public void DhmiourgiaProstimouTest(){
		//dio tria parastatika.
		double actualprostimo= Math.abs(e.Ipopsifiaapath()*100);
		Assert.assertTrue((e.DhmiourgiaProstimou()==actualprostimo));
	}
}
