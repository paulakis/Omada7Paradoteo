package aueb.mcsis.omada7.services.eforia;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import aueb.mcsis.omada7.domain.eforia.Anantistoixia;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.ElegxosAnantistixiwn;
import aueb.mcsis.omada7.domain.eforia.Trimhno;

public class ElegxosGiaAnantistixoiesService {
		//dexete set parastikwn
		// kanei diplo for(px gia to an ta esoda ths A apo thn B antistixoun sta exoda ths B apo thn A)
		//epistrofh boolean true kai mnm tropoisi an oxi -->epivoliprosimou

	private EntityManager em;

	
		public ElegxosGiaAnantistixoiesService(EntityManager em) {
			super();
			this.em = em;
		}
	    
		
		//fere tis dhlwseis oles
		@SuppressWarnings("unchecked")
		public List<Dhlwsh> findAllDhlwseis(){
			List<Dhlwsh> d=null;
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			d=em.
					createQuery("select * from Dhlwsh").getResultList();
			tx.commit();
			em.close();
			return d;
		}
		
		//apothikeuse sti vash to set anantistoixiwn ean to anantisoixies ginei vash
		
		
		// trekse to paketo elegxosAnantistoixeiwn gia na kaneis to set twn anantistoixiwn
		//sto domain model exoume valei na pairnei ena sinolo dhlwsewn edw pws tis fernei einai to thema thelei querry?sti vash me kapoio tropo
		//an den iparxei logos gia tis dhlwseis na figei h parapanw sinarthsh
		public Set<Anantistoixia> girnaTisAnantistoixies(){
			ElegxosAnantistixiwn ele=new ElegxosAnantistixiwn();
			//an to anantistoixia einai pinakas na apothikeuoume tis anantistoixies edw.me persist
			return ele.AnantistoixiesEnaProsEna();
		}
		
		//trekse ena aplo elegxo na deis ama iparxoun h oxi
		public Boolean IparxounAnantistixoies(){
			if(girnaTisAnantistoixies().size()>0){
				return true;
			}else{
				return false;
			}
		}
		
		// elegxos meta thn tropopoihsh twn anantistoixountwn parastatikwn?
		
		
}
