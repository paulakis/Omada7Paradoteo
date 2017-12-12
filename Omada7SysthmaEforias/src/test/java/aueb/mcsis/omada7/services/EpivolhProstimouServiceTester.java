package aueb.mcsis.omada7.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.ElegxosAnantistixiwn;
import aueb.mcsis.omada7.domain.eforia.ElegxosApaths;
import aueb.mcsis.omada7.persistence.eforia.JPAUtil;
import aueb.mcsis.omada7.services.eforia.EpivolhProstimouService;



public class EpivolhProstimouServiceTester  extends GenikoServiceTest{

	private EpivolhProstimouService ep;
	
	public EpivolhProstimouServiceTester() {
		super();
	}
	
	@Test
	public void TestFereTisApates(){
	//vazw mia apath 	
		EntityManager em = JPAUtil.getCurrentEntityManager();
		ep=new EpivolhProstimouService(em);
		ElegxosApaths e=new ElegxosApaths();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
		Assert.assertEquals(ep.FereTisApates().size(), 1);
	}
	
	
	@Test
	public void TestFereTisAnantistoixies(){
		EntityManager em = JPAUtil.getCurrentEntityManager();
		ep=new EpivolhProstimouService(em);
		ElegxosAnantistixiwn e=new ElegxosAnantistixiwn();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
		Assert.assertEquals(ep.FereTisAnantistoixies().size(), 1);
	}
	
	
	
	
	@Test
	public void Testupdatesinoloprostimogiathnkathedhlwsh(){
		EntityManager em = JPAUtil.getCurrentEntityManager();
		ep=new EpivolhProstimouService(em);
		ElegxosApaths e=new ElegxosApaths(150, 1500, true);
		e.setEnhmerwsheforou(true);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
		Assert.assertEquals(ep.updateSinolikoProstimoGiathnkatheDhlwsh(),false);
	}
	
}
