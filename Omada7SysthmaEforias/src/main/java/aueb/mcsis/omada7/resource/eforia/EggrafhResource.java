package aueb.mcsis.omada7.resource.eforia;

import java.util.List;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.services.eforia.*;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("Logariasmos")
public class EggrafhResource extends AbstractResource {
	
	@Context
	UriInfo uriInfo;
	
	
	
	@GET
	@Produces("application/xml")
	public int GirnaToSinoloTwnLogariasmwn(){
		EntityManager em = getEntityManager();
		EgrafhStoSistimaService e= new EgrafhStoSistimaService(em);
		return e.FerePosoiEinaiStoSysthma();
	}
	
	
}
