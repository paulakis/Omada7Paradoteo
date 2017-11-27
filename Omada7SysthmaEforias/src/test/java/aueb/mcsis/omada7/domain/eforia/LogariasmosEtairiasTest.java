package aueb.mcsis.omada7.domain.eforia;

import org.junit.Assert;

import com.mgiandia.library.domain.Borrower;
import com.mgiandia.library.domain.Loan;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LogariasmosEtairiasTest {
	
	  @Test
	  public void setDhlwshToLogariasmouEtairias() {
		   LogariasmosEtairias logariasmos = new  LogariasmosEtairias();
	        
	        Assert.assertTrue(logariasmos.getDhlwseis().size() == 0 );
	        
	        Dhlwsh dhlwsh = new Dhlwsh();
	        
	       dhlwsh.setLogariasmosEtairias(logariasmos);
	        
	        Assert.assertTrue(logariasmos.getDhlwseis().size() == 1);
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        
	  }

	  @Test
	  public void setDhlwshToNewLogariasmosEtairias() {
		  LogariasmosEtairias logariasmos = new  LogariasmosEtairias()        
				  Dhlwsh dhlwsh = new Dhlwsh();
	        dhlwsh.setLogariasmosEtairias(logariasmos);
	        Assert.assertTrue(logariasmos.getDhlwseis().contains(dhlwsh));
	        LogariasmosEtairias newlogariasmos = new  LogariasmosEtairias() 
	        
	        dhlwsh.setLogariasmosEtairias(newlogariasmos);
	        Assert.assertTrue(logariasmos.getDhlwseis().size() == 0);
	                
	        Assert.assertTrue(newlogariasmos.getDhlwseis().size() == 1);
	        Assert.assertTrue(newlogariasmos.getDhlwseis().contains(dhlwsh));
	        
	    }
}
