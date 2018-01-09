package aueb.mcsis.omada7.resources;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.resource.eforia.EggrafhResource;

public class EggrafhResourceTester extends EforiaResourceTest {

	
	
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
