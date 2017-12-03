package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;

import org.junit.*;


public class LogariasmosEtairiasTest {
	
	
	@Test
	public void EanToAfmEinaiValid(){
		LogariasmosEtairias a=new LogariasmosEtairias(1, "emeis", new Date(), "1234567899", "asdasdasdasd", 2105012217,
				true , false);
		Assert.assertTrue(a.isValidAfm(a));
	}
	
	
	  @Test
	  public void setDhlwshToLogariasmouEtairias() {
		   LogariasmosEtairias logariasmos = new  LogariasmosEtairias();
		   Assert.assertEquals(0,logariasmos.getDhlwseis().size());
		   //^nomizo to pano einai pio sosto
	       // Assert.assertTrue(logariasmos.getDhlwseis().size() == 0 );
	        
	        Dhlwsh dhlwsh = new Dhlwsh();
	        
	       //dhlwsh.setLogariasmosEtairias(logariasmos);
	        
	       // Assert.assertTrue(logariasmos.getDhlwseis().size() == 1);
	        
	        Assert.assertEquals(1, logariasmos.getDhlwseis().size());
	      //pali nomizo oti afto einai pio sosto
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        
	  }

	  @Test
	  public void setDhlwshToNewLogariasmosEtairias() {
		  LogariasmosEtairias logariasmos = new  LogariasmosEtairias() ;      
				  Dhlwsh dhlwsh = new Dhlwsh();
	        //dhlwsh.setLogariasmosEtairias(logariasmos);
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        LogariasmosEtairias newlogariasmos = new  LogariasmosEtairias(); 
	        
	        //dhlwsh.setLogariasmosEtairias(newlogariasmos);
	        Assert.assertTrue(logariasmos.getDhlwseis().size() == 0);
	                
	        Assert.assertTrue(newlogariasmos.getDhlwseis().size() == 1);
	        Assert.assertTrue(newlogariasmos.getDhlwseis().contains(dhlwsh));
	        
	    }
}
