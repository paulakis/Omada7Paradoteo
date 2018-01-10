package aueb.mcsis.omada7.resources;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.persistence.eforia.Initializer;
import aueb.mcsis.omada7.resource.eforia.EggrafhResource;

public class EggrafhResourceTester extends JerseyTest {

	
	Initializer dataHelper; 
	 
	@Override
	public void setUp() throws Exception {
		super.setUp();
		dataHelper = new Initializer();
		dataHelper.prepareData();
	}

	
	
@Override
	protected Application configure() {
		// TODO Auto-generated method stub
		return new ResourceConfig(EggrafhResource.class);
	}




@Test
public void GirnaToSinoloTwnLogariasmwnTest(){
	
	Response r=target("Logariasmos").request().get();
	Assert.assertEquals(200, r.getStatus());
}
	

}
