package aueb.mcsis.omada7.services.eforia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import aueb.mcsis.omada7.domain.eforia.Anantistoixia;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;


public class EpivolhProstimouService {
	//an einai ekpro8smi i dilosi boolean true 
	// epivolh mikrou prostimou
	//an apath true kai anantistixiwn true(meta thn enimerosi) 
	// epivolh prostimou apo mia dikia mas sinaritisi!!
	
	
	private EntityManager em;

	public EpivolhProstimouService(EntityManager em) {
		super();
		this.em = em;
	}
	//fernei sinolo anantistixoiwn
	public List<Anantistoixia> fereTisAna(){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<Anantistoixia> results = null;
		results = em.createQuery("select * from Anantistoixia").getResultList();
		return results;
	}
	// epivalei to sinomo prostimo
	public void EpivolhSinomouProstimou(){
		List<Anantistoixia> lista = fereTisAna();
		for(Anantistoixia l:lista){
			double prostimo = Math.abs(l.getDiafora()*100);
			//join logariasmo dhlwsh where afm tade kai iddhlwshs deina kane set to prostimo persist to antikeimeno
			
		}
	}
	
	
	
	
}
