package aueb.mcsis.omada7.services.eforia;

import javax.persistence.EntityManager;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;

public class EgrafhStoSistimaService {
	 // to service auto elexgxei an uparxei allh etairia me to idio afm
	 // an to afm einai egkiro kai exoun elex8ei ta stoixeia tote stelnei mnm epitixous eggrafhs
	 // kataxwrei thn eggrafh sth vash logariasmoi !!!
	 // h arxikopoihsh twnn pediwn prepei na elegthei kai pending einai katallhlh

	private EntityManager em;

	public EgrafhStoSistimaService(EntityManager em) {
		super();
		this.em = em;
	}
	
	public boolean KaneNeaEggrafh(LogariasmosEtairias e){
		if (e!=null){
			em.persist(e);
			return true;
		}else
		{
			return false;
		}
	}
	
	//diaagrafh etairias den prepei na ginetai kanonika,na menoun ta stoixeia gia panta
	
	
	public LogariasmosEtairias VresEanExeiKsanakataxwrhtheiToAfm(String afm){
		return em.find(LogariasmosEtairias.class, afm);
	}
	
	//oxi tropopoihsh edw eini se alo service
	
	
	
}
