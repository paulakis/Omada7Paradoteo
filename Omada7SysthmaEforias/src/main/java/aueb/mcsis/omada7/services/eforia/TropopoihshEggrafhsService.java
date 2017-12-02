package aueb.mcsis.omada7.services.eforia;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;
import aueb.mcsis.omada7.domain.eforia.LogariasmosEtairias;

public class TropopoihshEggrafhsService {
	//BOOLEAN AN TO AFM EINAI TO IDIO
	//EISAGEI TA NEA STOIXEIA
	//(TA LAMAVENEI O ELEGXOS GIA EPIKIRWSI DLD TA KALEI EKEI)

	private EntityManager em;


	public TropopoihshEggrafhsService(EntityManager em) {
		super();
		this.em = em;
	}
	
	// elegxetai automata apo ton eforo.erwthsh(?)
	public void TropopoihshLogariasmou(String afm,String epwnimia,String email,int thlefwno,Date hmeromhniasistashs){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		LogariasmosEtairias eter = em.find(LogariasmosEtairias.class, afm);
		if(eter!=null){
			eter.setEpwnimia(epwnimia);
			eter.setEmail(email);
			eter.setThlefwno(thlefwno);
			eter.setHmeromhniasistashs(hmeromhniasistashs);
			eter.setExeiElefthei(false);
			eter.setNeedCheck(true);
			em.persist(eter);
			tx.commit();
			em.close();
		}
	}
	

	

}
