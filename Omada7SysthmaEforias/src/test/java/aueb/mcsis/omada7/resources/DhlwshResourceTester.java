package aueb.mcsis.omada7.resources;

import java.util.List;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.resource.eforia.DhlwshResource;


public class DhlwshResourceTester extends EforiaResourceTest {

	@Override
	protected Application configure() {
		return new ResourceConfig(DhlwshResource.class);
	}
	
	
	@Test
	public void vresDhlwshapoIdTester(){
		List<Dhlwsh> l =fereOlestisDhlwseis();
		Dhlwsh d= target("dhlwsh/"+l.get(0).getId()).request().get(new GenericType<Dhlwsh>(){});
		Assert.assertEquals(l.get(0), d);
	}
	
}
