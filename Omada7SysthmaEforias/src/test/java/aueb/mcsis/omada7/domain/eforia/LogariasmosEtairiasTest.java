package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import org.junit.*;
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
		LogariasmosEtairias a=new LogariasmosEtairias(1, "emeis", new Date(), "1234567899", "asdasdasdasd", 2105012217,
				true , false);
		Assert.assertFalse(a.isValidAfm(a));
		a.setAfm("12457889");
		Assert.assertFalse(a.isValidAfm(a));
		a.setAfm("123456789");
		Assert.assertTrue(a.isValidAfm(a));
	}
	
	
	  @Test
	  public void setDhlwshToLogariasmouEtairias() {
		   LogariasmosEtairias logariasmos = new  LogariasmosEtairias();
		   Assert.assertEquals(0,logariasmos.getDhlwseis().size());
	        Dhlwsh dhlwsh = new Dhlwsh();
	        Assert.assertEquals(1, logariasmos.getDhlwseis().size());
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        
	  }

	  @Test
	  public void setDhlwshToNewLogariasmosEtairias() {
		  LogariasmosEtairias logariasmos = new  LogariasmosEtairias() ;      
				  Dhlwsh dhlwsh = new Dhlwsh();
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        LogariasmosEtairias newlogariasmos = new  LogariasmosEtairias(); 
	        Assert.assertTrue(logariasmos.getDhlwseis().size() == 0);
	                
	        Assert.assertTrue(newlogariasmos.getDhlwseis().size() == 1);
	        Assert.assertTrue(newlogariasmos.getDhlwseis().contains(dhlwsh));
	        
	    }
}
