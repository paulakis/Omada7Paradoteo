package aueb.mcsis.omada7.resources;

import java.util.Date;
import java.util.List;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.persistence.eforia.Initializer;
import aueb.mcsis.omada7.resource.eforia.EggrafhResource;

public class EggrafhResourceTester extends EforiaResourceTest {
	
@Override
	protected Application configure() {
		// TODO Auto-generated method stub
		return new ResourceConfig(EggrafhResource.class);
	}




@Test
public void GirnaToSinoloTwnLogariasmwnTest(){
	//int x = target("Logariasmos").request().get(Integer.class);
	//Assert.assertEquals(4, x);
	//Response r=target("Logariasmos").request().get();
	//Assert.assertEquals(200, r.getStatus());
}
	@Test
	public void KaneNeaEggLogTest(){
		//ftiaxnw logariasmo
		//ftiaxnw to uri pou prepei na steilw
		// kai koitaw meta ama evale neo logariasmo
		LogariasmosEtairias log=new LogariasmosEtairias(21, "aek", new Date(), "149187741", "aek@gmail.com", 2015012217, false, true);
		Response response = target("Logariasmos").request().post(Entity.entity(log, MediaType.APPLICATION_JSON));
		//epeidh einai void den girnaei tipota
		Assert.assertEquals(204, response.getStatus());
		List <LogariasmosEtairias> l = FereOlousTousLog();
		Assert.assertEquals(5, l.size());
 	}
	
	
	
	@Test
	public void vreseaniparxeiTester(){
		//na deite kai ta alla afm
		//auto sigoura den iparxei gia auto evala kai to null
		String afm1="149187741";
		LogariasmosEtairias l=target("Logariasmos/vres/"+afm1).request().get(new GenericType<LogariasmosEtairias>(){});
		Assert.assertEquals(null, l);
		
	}

}
