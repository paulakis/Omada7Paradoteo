package aueb.mcsis.omada7.resources;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.spi.TestContainerFactory;

import aueb.mcsis.omada7.persistence.eforia.Initializer;



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

	
	
}
