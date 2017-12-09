package aueb.mcsis.omada7.services.eforia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import aueb.mcsis.omada7.domain.eforia.ElegxosAnantistixiwn;
import aueb.mcsis.omada7.domain.eforia.ElegxosApaths;

public class EpivolhProstimouService {
	
	private EntityManager em;

	public EpivolhProstimouService(EntityManager em) {
		super();
		this.em = em;
	}

	
	//o eforos paei ston elegxo anantistoixeiwn kai fernei tis eggrafes gia na tis dei o eforos
	@SuppressWarnings("unchecked")
	public List<ElegxosAnantistixiwn> FereTisAnantistoixies(){
		List<ElegxosAnantistixiwn> l=null;
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		l=em.createQuery("select from elegxoi e where e.type = :type").setParameter("type", "anantistoixies").getResultList();
		return l; 
	}
	
	//prostimo se anantistoxoia
	public void ProstimoGiaAnantistoixies(){
		//List<ElegxosAnantistixiwn> l=null;
		//for(ElegxosAnantistixiwn e:l){
			//na epivalei kapws ena prostimo
		
	}
	
	//koitaei kai tis apates 
	
	@SuppressWarnings("unchecked")
	public List<ElegxosApaths> FereTisApates(){
		List<ElegxosApaths> l=null;
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		l=em.createQuery("select from elegxoi e where e.type = :type").setParameter("type", "apath").getResultList();
		return l; 
	}
	
	
	
	//enhmerwnei ta sinolika prostima epixeirhsewvn
	public void updateSinolikoProstimoGiathnkatheDhlwsh(){
		List<ElegxosApaths> listaapatwn=FereTisApates();
		for(ElegxosApaths e:listaapatwn){
			//na dei ean hrthe h wra na tou epivalei to prostimo
			if(e.isEnhmerwsheforou()){
			e.d.setSinoloprostimou(e.d.getSinoloprostimou()+e.getProstimo());
			//prepei na to valoume kai sthn vash
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.merge(e.d);
			tx.commit();}
		}
			em.close();
	}
	
	
}

