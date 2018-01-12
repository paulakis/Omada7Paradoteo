package aueb.mcsis.omada7.resource.eforia;


import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.services.eforia.IpovolhDhlwshsService;

@Path("dhlwsh")
public class DhlwshResource extends AbstractResource {

	@GET
	@Path("/{id}")
	@Produces
	public Dhlwsh GirnaThDwhlwshApoToIDths(@PathParam("id") int id){
		EntityManager em = getEntityManager();
		IpovolhDhlwshsService ipo=new IpovolhDhlwshsService(em);
		return ipo.VresDhlwshById(id);
	}
	
	
	@GET
	@Path("/trimhno/{trimhno}/etairia/{afm}")
	@Produces
	public Dhlwsh KaneNEaDhlwsh(@PathParam("trimhno") int tri,@PathParam("afm") String afm){
		EntityManager em = getEntityManager();
		IpovolhDhlwshsService ipo=new IpovolhDhlwshsService(em);
		ipo.VresEtairia(afm);
		return ipo.KaneNeaDhlwsh(tri);
	}
	
	@GET
	@Path("/{id}/neoparastatiko")
	@Produces
	public boolean ValeNeoParastatiko(@PathParam("id") int id){
		EntityManager em = getEntityManager();
		IpovolhDhlwshsService ipo=new IpovolhDhlwshsService(em);
		return ipo.ValeNeoParastatiko(id);
	}
}
