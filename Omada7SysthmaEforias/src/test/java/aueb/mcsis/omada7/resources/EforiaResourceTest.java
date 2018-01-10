package aueb.mcsis.omada7.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.spi.TestContainerFactory;

import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.persistence.eforia.Initializer;
import aueb.mcsis.omada7.persistence.eforia.JPAUtil;



public class EforiaResourceTest extends JerseyTest {

	Initializer dataHelper; 
	

	public EforiaResourceTest() {
		super();
	}

	public EforiaResourceTest(TestContainerFactory testContainerFactory) {
		super(testContainerFactory);
	}
	
	public EforiaResourceTest(Application jaxrsApplication) {
		super(jaxrsApplication);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		dataHelper = new Initializer();
		dataHelper.prepareData();
	}

	
	@SuppressWarnings("unchecked")
	public List<LogariasmosEtairias> FereOlousTousLog(){
		EntityManager em = JPAUtil.getCurrentEntityManager();
		 List<LogariasmosEtairias> l = em.createQuery("select e from LogariasmosEtairias e").getResultList();
		 return l;
	}
	
	
	
	
}
