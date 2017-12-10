package aueb.mcsis.omada7.domain.eforia;
import java.util.Date;
import org.junit.*;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;

//import org.junit.Assert;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

public class DhlwshTest {
 
	@Test
	public void addNullForParastatiko(){
		Dhlwsh dhlwsh = new Dhlwsh();
		dhlwsh.addParastatiko(null);
		Assert.assertEquals(0,dhlwsh.getParastatika().size());
		
		
	}
	
	
	@Test
	public void addParastatikoTest(){
		Dhlwsh dhlwsh = new Dhlwsh(1,new Date(),0 ,true);
		Parastatiko parastatiko = new Parastatiko("987654322" , 1234,true , 300000 , new Date());
		dhlwsh.addParastatiko(parastatiko);
		Assert.assertEquals(1,dhlwsh.getParastatika().size());
		//Assert.assertTrue(dhlwsh.getParastatika().contains(parastatiko));
		
	}
	
	@Test
	public void mporeiNaKaneiTropopoihshTest(){
		
		Date ho = new Date();
		LogariasmosEtairias logEt = new LogariasmosEtairias(20, "KostasAE", ho  , "123456678", "email@em.co", 2106547395,true, false);
		Dhlwsh dhlwsh = new Dhlwsh();
		Assert.assertTrue(dhlwsh.MporeiNaKaneiTropopoihsh(logEt));
		logEt.setExeiElefthei(false);
		Assert.assertFalse(dhlwsh.MporeiNaKaneiTropopoihsh(logEt));
		//etairia.setExeiElefthei(false);
		}

	@Test
	public void testPedia()
	{	Date ho =new Date();
		Date ha =new Date();
		Dhlwsh dhlwsh = new Dhlwsh(1,ho,0 ,false);
		LogariasmosEtairias logEt = new LogariasmosEtairias();
		
		//dhlwsh.setSinoloprostimou(300000);
		//Assert.assertEquals(dhlwsh.getSinoloprostimou(),dhlwsh.sinoloprostimou);
		dhlwsh.setEmprothesmh(true);
		dhlwsh.setTrimhno(2);
		dhlwsh.setSubmissiondate(ha);
		
		dhlwsh.setId(20);
		Assert.assertEquals(20, dhlwsh.getId());
		Assert.assertEquals(2, dhlwsh.getTrimhno());
		Assert.assertEquals(ha, dhlwsh.getSubmissiondate());
		Assert.assertTrue(dhlwsh.isEmprothesmh());
		
		dhlwsh.setLogarismosEtairias(logEt);
		Assert.assertEquals(logEt,dhlwsh.getEtairia());
		
		Assert.assertEquals(51, dhlwsh.hashCode());
		
		
			
	}
	
	@Test
	public void testEquals(){
		Dhlwsh dhlwsh = new Dhlwsh(1,new Date(),0 ,false);
		Dhlwsh dhlwnot = null;
		Assert.assertTrue(dhlwsh.equals(dhlwsh)); 
		Assert.assertFalse(dhlwsh.equals(dhlwnot));
	}
	
	
	
	
	
	
	
	
	
	/*@Test//tha thelei diorthosi
	public void IparxeiHdhStaParastatika(){
		Set<Parastatiko> parastatika = null;
		Parastatiko p = new Parastatiko();
		Assert.assertTrue(parastatika.contains(p)); 
		
	}*/

}
