package aueb.mcsis.omada7.domain.eforia;
import java.util.Set;
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
		Dhlwsh dhlwsh = new Dhlwsh();
		Parastatiko parastatiko = new Parastatiko();
		dhlwsh.addParastatiko(parastatiko);
		Assert.assertEquals(1,dhlwsh.getParastatika().size());
		Assert.assertTrue(dhlwsh.getParastatika().contains(parastatiko));
		
	}
	
	@Test
	public void mporeiNaKaneiTropopoihshTest(){
		LogariasmosEtairias etairia = new LogariasmosEtairias();
		Assert.assertTrue(etairia.isExeiElefthei());
		}

	
	@Test//tha thelei diorthosi
	public void IparxeiHdhStaParastatika(){
		Set<Parastatiko> parastatika = null;
		Parastatiko p = new Parastatiko();
		Assert.assertTrue(parastatika.contains(p));
		
	}

}
