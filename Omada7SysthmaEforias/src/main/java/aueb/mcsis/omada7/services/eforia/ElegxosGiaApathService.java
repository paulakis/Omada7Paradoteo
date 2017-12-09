package aueb.mcsis.omada7.services.eforia;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;


import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.ElegxosApaths;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.domain.eforia.Trimhno;

public class ElegxosGiaApathService {
	
	private EntityManager em;
	private ElegxosApaths m;
	private Dhlwsh d;
	
	public ElegxosGiaApathService(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void FindElegxosApathsById(int id){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			m = em.find(ElegxosApaths.class, id);
			tx.commit();
		} catch (NoResultException ex) {
			m = null;
			tx.rollback();
		}
	}
	

	public  boolean findDhlwshById(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			d = em.find(Dhlwsh.class, m.d.getId());
			tx.commit();
		} catch (NoResultException ex) {
			d = null;
			tx.rollback();
		}

		return d != null;
	}
	
	public void ipologismosApaths(){
			if(tsekareEanEntosXronikouOriou(d)){
				m = new ElegxosApaths(DhmiourgiaProstimou(Ipopsifiaapath()),Ipopsifiaapath(),EinaiApath(Ipopsifiaapath()));
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				em.persist(m);
				tx.commit();
				em.close();
		}
	}
	
	
	public double Ipopsifiaapath(){
		double souma=0;
		for(Parastatiko p: d.getParastatika()){
			souma =+ p.PareToPoso(p);
		}
		return souma;
	}
	
	public boolean EinaiApath(double x){
		if(x<-1000){
			return true;
		}else{
			return false;
		}
	}
	
	
	public String GirnaeiToAfmThsApaths(){
		if(EinaiApath(Ipopsifiaapath())){
			return d.getEtairia().getAfm();
		}else{
		return null;
		}
	}
	

	public double DhmiourgiaProstimou(double souma){
		return Math.abs(souma*100);
	}
	 
	//h opoia tha tsekarei ean eimaste entos xronikou oriou
	//tsekarei ean exoun perasei oi meres(35) gia na kanei ton elegxo apaths
	//exei merikes deprecated methods
	@SuppressWarnings("deprecation")
	public boolean tsekareEanEntosXronikouOriou(Dhlwsh d){
		Trimhno tr=new Trimhno(d.getSubmissiondate().getMonth(), d.getSubmissiondate().getYear(), d.getSubmissiondate().getDay());
		if(tr.paremeres()>35){
			return true;
		}else{
		return false;}
		
	}
	

	
}
