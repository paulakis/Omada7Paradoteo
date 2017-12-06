package aueb.mcsis.omada7.services.eforia;

import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;



public class ElegxosEggrafwnService {
	// elegxos pinaka etairiwn gia nees eggrafes(koitaei ta dio boolean pedia)
	// stooixeia ston eforo
	// ta vlepei allazei ta pedia analoga thn apofash tou(aporipsh,tropo,epitixia) 
	 
	private EntityManager em;

	
	
	public ElegxosEggrafwnService(EntityManager em) {
		super();
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	public List<LogariasmosEtairias> FerePendingLogariasmous(){
		//fernei apo ton pinaka ths vashs tis eggrafes twn logariasmwn pou den exoun elegthei
		List<LogariasmosEtairias> results = null;
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		results=em.
		createQuery("select e from LogariasmoEtairias e where e.elegxos=false && e.theleielegxo=true").getResultList();
		return results;	
		
	}
	
	//kai kala oti tous exei elegksei.

	public void TropopoihseKatastashLogariasmwn(){
		List<LogariasmosEtairias> lista=FerePendingLogariasmous();
		for(LogariasmosEtairias e: lista){
			e.setExeiElefthei(true);
			e.setNeedCheck(false);
			
		}
	}
	
}
