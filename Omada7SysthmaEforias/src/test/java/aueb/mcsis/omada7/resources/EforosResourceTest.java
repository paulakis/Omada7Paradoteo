package aueb.mcsis.omada7.resources;

import java.util.List;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.persistence.eforia.Initializer;
import aueb.mcsis.omada7.resource.eforia.EforosResource;

public class EforosResourceTest extends EforiaResourceTest{

	
	
@Override
	protected Application configure() {
		return new ResourceConfig(EforosResource.class);
	}

@Test
public void FereLogGiaelegxoTest(){
	List<LogariasmosEtairias> pendinglog= target("eforos").request().get(new GenericType<List<LogariasmosEtairias>>(){});
	Assert.assertEquals(1,pendinglog.size());
}

	
}
