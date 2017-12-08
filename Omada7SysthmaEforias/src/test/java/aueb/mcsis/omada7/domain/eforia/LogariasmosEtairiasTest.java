package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import org.junit.*;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
//dimiourgrei logariasmo/null ka/ ekxorei koita me assert ola ta stoixeia 
// dimiourgei kai dilosei pali me null ka kai use assert for all (gia to size tou set twn dilosewn
// kai canmakedilosi
//kai canmaketropoisi
// me boolean ta duo panw
//kai isos kati san to testGetDhlwshDue

public class LogariasmosEtairiasTest {
	LogariasmosEtairias e;
	
	
	@Test
	public void MporeiNaKaneiDhlwshTester(){
		e=new LogariasmosEtairias(5,"aek", new Date(), "123456879", "aek@aek.com", 2105689745, true, true);
		Assert.assertFalse(e.MporeiNaKaneiDhlwsh(e));
		e.setNeedCheck(false);
		Assert.assertTrue(e.MporeiNaKaneiDhlwsh(e));
		e.setExeiElefthei(false);
		Assert.assertFalse(e.MporeiNaKaneiDhlwsh(e));
		
	}
	
	
	@Test
	public void EanToAfmEinaiValid(){
		LogariasmosEtairias a=new LogariasmosEtairias();
		
		a.setAfm("1234567889");
		
		
		Assert.assertFalse(a.isValidAfm(a));
		
		LogariasmosEtairias b=new LogariasmosEtairias();
		b.setAfm("123456789");
		Assert.assertTrue(b.isValidAfm(b));
	}
	
	
	  @Test
	  public void setDhlwshToLogariasmouEtairias() {
		  
		  
		 
		   LogariasmosEtairias logariasmos = new  LogariasmosEtairias();
		   Assert.assertEquals(0,logariasmos.getDhlwseis().size());
		   Dhlwsh dhlwsh = new Dhlwsh();//kai null dilosi se alo
		   dhlwsh.setLogarismosEtairias(logariasmos);
	       logariasmos.addDhlwsh(dhlwsh);
	        Assert.assertEquals(1,logariasmos.getDhlwseis().size());
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        
	  }

	  @Test
	  public void setDhlwshToNewLogariasmosEtairias() {
		  
		 
		  
		  
		  LogariasmosEtairias logariasmos = new  LogariasmosEtairias() ;      
				  Dhlwsh dhlwsh = new Dhlwsh();
				  dhlwsh.setLogarismosEtairias(logariasmos);
				  logariasmos.addDhlwsh(dhlwsh);
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        
	        LogariasmosEtairias newlogariasmos = new  LogariasmosEtairias();
	        dhlwsh.setLogarismosEtairias(newlogariasmos);
	        newlogariasmos.addDhlwsh(dhlwsh);
	        
	        Assert.assertTrue(logariasmos.getDhlwseis().size() == 1);
	                
	        Assert.assertTrue(newlogariasmos.getDhlwseis().size() == 1);
	        Assert.assertTrue(newlogariasmos.getDhlwseis().contains(dhlwsh));
	        
	    }
}
