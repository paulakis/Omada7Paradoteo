package aueb.mcsis.omada7.services.eforia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;

public class ElegxosGiaApathService {
	// sunoliko sum apo parastatika gia to idio afm gia ka8e etairia esodwn exodwn
		//an <<0 to -->boolean apath true kai ekxorisi sth vash apath!!
		// wra exw na to grapsw o PANOS gamietai!!xaxa

	private EntityManager em;
	private Dhlwsh d;

	public ElegxosGiaApathService(EntityManager em) {
		super();
		this.em = em;
	}
	
	//fernei tis dhlwseis
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
	// tha pairnei id dhlwshs tha kanei query sth vash tha fernei mia dhlwsh mazi me to set parastatikwn 
	// kai meta tha mazeuei ta posa me epanalhpsh sto set parastatikwn.
	// ilopoihsh ths ekaneapath() an h diafora twn poswn poy ftiaksame panw einai (x100)
	
	//gia na treksei simfwna me to provlima prepei na exoun perasei 10+20+5 meres.apo thn arxh tou trimhnou sto opoio vriskomai.
	//simfwna me to datae poy exw prepei na ferw autes tis dhlwseis kai oxi tis alles
	//apo submissiondate ths dhlwshs na dei pou eimaste
	//ean paiksoume mpala me to trimhno mporoume na doume ean exoun perasei oi meres.

}
