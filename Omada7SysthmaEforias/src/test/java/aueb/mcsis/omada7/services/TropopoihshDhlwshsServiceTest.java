package aueb.mcsis.omada7.services;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.services.eforia.TropopoihshDhlwshsService;
import aueb.mcsis.omada7.services.eforia.IpovolhDhlwshsService;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;


public class TropopoihshDhlwshsServiceTest {
	
	private EntityManager em;
	
	@Test
	public void VresThnTeleutaiaDhlwshTest(){
		Date a = new Date();
		LogariasmosEtairias VEROPOULOS = new LogariasmosEtairias(1, "veropoulos",a, "987654321",
				"veropoulos@ver.gr",2102574575,
		        true, false); //ftiaxno adikimeno logariasmo
		IpovolhDhlwshsService ids = new IpovolhDhlwshsService(em); //kano adikimeno apo tin klasi gia na kano dilosi
		ids.KaneNeaDhlwsh(1); //ftiaxno dilosi kai tin kano persist
		//THA SINEXISTEI OTAN VRW POS VRISKEIS TO ID TIS DILOSIS GIA NA TO XRISIMOPIISO GIA NA TO GIRISO-FILTI
		
		Dhlwsh d1 = new Dhlwsh(3,a,0 ,true);
		d1.setId(1);
		Dhlwsh d2 = new Dhlwsh(1,a,0 ,false);
		d2.setId(2);
		TropopoihshDhlwshsService tds = new TropopoihshDhlwshsService(em);
		Assert.assertEquals(d1, tds.VresThnTeleutaiaDhlwsh(1));
		Assert.assertNull(tds.VresThnTeleutaiaDhlwsh(2));
	}
	
}
