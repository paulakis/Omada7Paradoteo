package aueb.mcsis.omada7.resource.eforia;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.services.eforia.IpovolhDhlwshsService;
import aueb.mcsis.omada7.services.eforia.TropopoihshDhlwshsService;

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
	
	@GET
	@Path("/{id}/date")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean KaneTropopoihshDhlwshs(@PathParam("id") int id){
		EntityManager em = getEntityManager();
		TropopoihshDhlwshsService tr=new TropopoihshDhlwshsService(em);
		return tr.TropopoihshDhlwshs(id, new Date());
	}
	
	@GET
	@Path("/{id}/arpara/{arpar}/poso/{poso}/eidos/{eidos}")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean kantropopoihshparastatikou(
			@PathParam("id") int id,
			@PathParam("arpar") int arithmospara,
			@PathParam("poso") double poso,
			@PathParam("eidos") boolean eidos
			){
		EntityManager em = getEntityManager();
		TropopoihshDhlwshsService tr=new TropopoihshDhlwshsService(em);
		return tr.TropopoihshParastatikwn(id, arithmospara, poso, eidos);		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response tropodhl(Dhlwsh d){
		EntityManager em = getEntityManager();
		TropopoihshDhlwshsService tr=new TropopoihshDhlwshsService(em);
		System.out.println(d.getId());
		boolean ela = tr.troponea(d);
		if(ela){
			return Response.ok().build();
		}else{
			return Response.status(400).build();
		}

	}
	
}
