package aueb.mcsis.omada7.domain.eforia;


import org.junit.*;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import aueb.mcsis.omada7.domain.eforia.AithmaElegxou;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;

public class AithmaElegxouTest {
	
	LogariasmosEtairias log;
	Dhlwsh dhlwsh;
	
	//boolean oloklhrwshelegxwn, boolean enhmerwsheforou, boolean dinatothtatropo
	//otan dimiourgite dhlwsh olok=false, true,true
	//meta add elegxo an den einai null ara true ,false,true(me calenderal an einai empro8esmi)
	//gia logariamos an den einai null otan dimourite false,true,true
	//meta elegxo true ,false,true gia tropooisi
	@Test
	public void addNullForDhlwsh(){
		LogariasmosEtairias log= new LogariasmosEtairias();
		log.addDhlwsh(null);
		Assert.assertTrue(condition);
		Assert.assertEquals(0,log.getDhlwseis().size());
		dhlwshBidirectionalAssociationInvariant(log);
		
	}
	@Test
	public void addDhlwsh(){
		LogariasmosEtairias log= new LogariasmosEtairias();
		Dhlwsh dhlwsh=new Dhlwsh();
		log.addDhlwsh(dhlwsh);
		Assert.assertEquals(1, log.getDhlwseis().size());
        Assert.assertTrue(log.getDhlwseis().contains(dhlwsh));
        dhlwshBidirectionalAssociationInvariant(log);   
		
		}
	                
	
	    
	    
	    @Test
	    public void removeNullForDhlwseis() {
	    	LogariasmosEtairias log= new LogariasmosEtairias();
			Dhlwsh dhlwsh=new Dhlwsh();
			log.addDhlwsh(dhlwsh);
	       // oxi  log.removeDhlwshs(null);
	        Assert.assertEquals(1, log.getDhlwseis().size());
	        dhlwshBidirectionalAssociationInvariant(log);
	    }
	    
	    @Test
	    public void removeDhlwsh() {
	    	LogariasmosEtairias log= new LogariasmosEtairias();
			Dhlwsh dhlwsh=new Dhlwsh();
			log.addDhlwsh(dhlwsh);
			dhlwshBidirectionalAssociationInvariant(log);
	       //oxi log.removeDhlwsh(dhlwsh);
	        Assert.assertEquals(0, log.getDhlwseis().size());
	       dhlwshBidirectionalAssociationInvariant(log);
	    }
	    
	    
	    
	    private void dhlwshBidirectionalAssociationInvariant(LogariasmosEtairias log) {
	        for(Dhlwsh dhlwsh : log.getDhlwseis()) {
	            Assert.assertTrue(dhlwsh.getEtairia().contains(log));            
	        }
	    }
	}



