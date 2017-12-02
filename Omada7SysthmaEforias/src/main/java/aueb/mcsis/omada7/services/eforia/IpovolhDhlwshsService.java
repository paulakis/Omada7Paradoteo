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
	private Parastatiko para;
	
	
	
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
	//vriskei mia dhlwsh me to id
	public Dhlwsh VresDhlwshById(int id ){
		Dhlwsh d;
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			d = em.find(Dhlwsh.class, id);
			tx.commit();
		} catch (NoResultException ex) {
			d = null;
			tx.rollback();
		}
		return d;
	}
	
	
	
	//vazoume kai ta parastatika afou exoume kanei nea dhlwsh
	public boolean ValeNeoParastatiko(int id){
		
		//prwta mallon kalei th sinarthsh gia na vrei thn dhlwsh.auto mporei kai na mhn xreiazetai
		Dhlwsh d=VresDhlwshById(id);
		if(d==null){
			return false;
		}else{
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(para);
			tx.commit();
			return true;
		}
		//metaa vazei sth dhlwsh to kataallhlo parastatiko.
	
	}
	
	
	
	
	
	
	
}
