package aueb.mcsis.omada7.services.eforia;

import javax.persistence.EntityManager;
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
	
	// tha pairnei id dhlwshs tha kanei query sth vash tha fernei mia dhlwsh mazi me to set parastatikwn 
	// kai meta tha mazeuei ta posa me epanalhpsh sto set parastatikwn.
	// ilopoihsh ths ekaneapath() an h diafora twn poswn poy ftiaksame panw einai (x100)
	
	

}
