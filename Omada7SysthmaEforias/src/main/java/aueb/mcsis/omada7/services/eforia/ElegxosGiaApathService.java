package aueb.mcsis.omada7.services.eforia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import aueb.mcsis.omada7.domain.eforia.AithmaElegxou;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.ElegxosApaths;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.domain.eforia.Trimhno;

public class ElegxosGiaApathService {
	
	private EntityManager em;
	private ElegxosApaths m;
	private Dhlwsh dil;
	
	public ElegxosGiaApathService(EntityManager em) {
		super();
		this.em = em;
	}
	
	public boolean FindElegxosApathsById(int id){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			m = em.find(ElegxosApaths.class, id);
			tx.commit();
			return true;
		} catch (NoResultException ex) {
			m = null;
			tx.rollback();
			return false;
		}
	}
	//voithitiko
	public void EkteleseElegxo(){
		ElegxosApaths e=new ElegxosApaths();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
	}
	//na to dw .den kanei elegxoi is not mapped
	@SuppressWarnings("unchecked")
	public int ferePosesEggrafes(){
		int poses=0;
		List<AithmaElegxou> l = em.createQuery("select e from AithmaElegxou e where e.type = apath").getResultList();
		if(l.size()==0){
			return poses;
		}else{
		return l.size();
		}
	}
	//na ton vazoume na kanei enan elegxo apaths gia mia dhlwsh?
	public void KaneElegxoApathsGiaTisdhlwseis(){
		
		
	}
	
	//auto mallon dne xreiazetai
	public  boolean findDhlwshById(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			dil = em.find(Dhlwsh.class, m.d.getId());
			tx.commit();
		} catch (NoResultException ex) {
			dil = null;
			tx.rollback();
		}

		return dil != null;
	}
	//koitaei gia mia dhlwsh ean ekane apath kai thn apothikeuei sth vash ean einai ipopsifia
	//xrhsimopoiei tis parakatw sinarthseis
	public void ipologismosApaths(Dhlwsh a){
			if(tsekareEanEntosXronikouOriou(a)){
				m = new ElegxosApaths(DhmiourgiaProstimou(Ipopsifiaapath(a)),Ipopsifiaapath(a),EinaiApath(Ipopsifiaapath(a)));
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				em.persist(m);
				tx.commit();
				em.close();
		}
	}
	
	
	public double Ipopsifiaapath(Dhlwsh a){
		double souma=0;
		for(Parastatiko p: a.getParastatika()){
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
	//den nomizw oti xreiazetai
	/*
	public String GirnaeiToAfmThsApaths(){
		if(EinaiApath(Ipopsifiaapath())){
			return d.getEtairia().getAfm();
		}else{
		return null;
		}
	}*/
	

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
