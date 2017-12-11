package aueb.mcsis.omada7.services;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.services.eforia.ElegxosGiaAnantistixoiesService;

public class ElegxosAnantistoixiwnServiceTest extends GenikoServiceTest {
	
	ElegxosGiaAnantistixoiesService s;
	
	@Test
	public void TestfindallDhlwseis(){
		s=new ElegxosGiaAnantistixoiesService(em);
		Assert.assertEquals(s.findAllDhlwseis().size(), 3);
	}

	
	@Test
	public void TestElegxosAnantistoixiwn(){
		s=new ElegxosGiaAnantistixoiesService(em);
		s.elegxosAnantistoixiwn();
		Dhlwsh d=new Dhlwsh(3,new Date(2017, 11, 28), 0, true);
		Parastatiko p1=new Parastatiko("252525252", 100,true, 10000, new Date());
		Parastatiko p2=new Parastatiko("102030405", 101,false, 100, new Date());
		d.addParastatiko(p1);
		d.addParastatiko(p2);
		Assert.assertTrue(s.girnaTisAnantistoixies().size()!=0);
	}
	
	@Test
	public void TestGirnaTisAnantistoixies(){
		s=new ElegxosGiaAnantistixoiesService(em);
		Assert.assertEquals(s.girnaTisAnantistoixies().size(), 0);
	}
	
	@Test
	public void TestKaneEisagwghSthBash(){
		s=new ElegxosGiaAnantistixoiesService(em);
		s.KaneEisagwghSthBash(1000);
		Assert.assertEquals(s.girnaTisAnantistoixies().size(),1);
	}
}
