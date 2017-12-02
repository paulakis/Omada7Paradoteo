package aueb.mcsis.omada7.services.eforia;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;

public class IpovolhDhlwshsService {
	// koitaei sto logariasmo me  afm ean mporei na kanei dhlwsh
	// kanei dhlwsh 
	// 
	private EntityManager em;
	private LogariasmosEtairias etairia;

	
	
	
	public IpovolhDhlwshsService(EntityManager em) {
		super();
		this.em = em;
	}
	
	
	
	//elegxei ean  iparxei etairia
	public LogariasmosEtairias VresEtairia(String  afm){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try{
			etairia=em.find(LogariasmosEtairias.class, afm);
			tx.commit();
			return etairia;
		}catch(NoResultException e){
			return null;
		}
	}
	
	//pragmnatopoiei th dhlwsh
	public Dhlwsh KaneNeaDhlwsh(){
		Dhlwsh d=null;
		if(etairia!=null){
		if (etairia.isExeiElefthei() && !etairia.isNeedCheck() ){
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			//apo constructor ths dhlwshs apothikeuseh sth vash
			
		}
		}
		
		return d ;
	}
	
	
	//vazoume kai ta parastatika afou exoume kanei nea dhlwsh
	public Parastatiko ValeNeoParastatiko(){
		return new Parastatiko();
	}
	
	
	
	
	
	
	
}
