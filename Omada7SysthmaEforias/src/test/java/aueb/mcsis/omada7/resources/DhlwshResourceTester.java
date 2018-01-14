package aueb.mcsis.omada7.resources;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.persistence.eforia.JPAUtil;
import aueb.mcsis.omada7.resource.eforia.DhlwshResource;
import aueb.mcsis.omada7.services.eforia.TropopoihshDhlwshsService;


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
	
	@Test
	public void kanetropopoihshdhlwshsTester(){
		List<Dhlwsh> l =fereOlestisDhlwseis();
		Response r=target("dhlwsh/"+l.get(0).getId()+"/date").request().get();
		Assert.assertEquals(200,r.getStatus());
	}
	
	
	@Test
	public void kanetropopoihshparastatikou(){
		EntityManager em = JPAUtil.getCurrentEntityManager();
		Date a = new Date();
		Dhlwsh d1 = new Dhlwsh(3,a,0 ,true);
		Parastatiko p1= new Parastatiko("987654322" ,1234,true ,300000 ,a);
		p1.setD(d1);
        EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(d1);
		em.persist(p1);
		tx.commit();
		//prepei na valw kapoia stoixeia mesa mia dhwlsh kai ena parastatiko
		Response r=target("dhlwsh/"+d1.getId()+"/arpara/1234/poso/600/eidos/false").request().get();
		Assert.assertEquals(200, r.getStatus());
		
		
	}
	
	@Test
	public void tropoTest(){
		Dhlwsh d = new Dhlwsh();
		Response r =target("dhlwsh").request().post(Entity.entity(d,MediaType.APPLICATION_JSON));
		Assert.assertEquals(null, r);
	}

	
}
