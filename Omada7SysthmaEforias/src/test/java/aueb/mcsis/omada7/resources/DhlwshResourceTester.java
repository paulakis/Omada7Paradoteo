package aueb.mcsis.omada7.resources;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.eclipse.persistence.oxm.MediaType;
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
	
	
	
	@Test
	public void kaneneadhlwshtester(){
		//den douleuei me post auto prepei na kanw
		Dhlwsh d= target("dhlwsh/trimhno/3/etairia/987654322").request().get(new GenericType<Dhlwsh>(){});
		Assert.assertNotEquals(null, d);
		//metra twra tis dhwlseis na einai 4 prepei
		Assert.assertEquals(4, fereOlestisDhlwseis().size());
		
	}
	
	
	@Test
	public void valeNeoParastatiko(){
		List<Dhlwsh> l =fereOlestisDhlwseis();
		Response b=target("dhlwsh/"+l.get(0).getId()+"/neoparastatiko").request().get();
		System.out.println(b);
		Assert.assertEquals(10, fereTaParastatika().size());
	}
}
