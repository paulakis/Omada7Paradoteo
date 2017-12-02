package aueb.mcsis.omada7.services.eforia;

import java.util.Date;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;

public class TropopoihshDhlwshsService {
	//BOOLEAN TROPOISIS  ENTOS XRONIKOU TRUE 
	//STO FALSE DEN BOREI
	//EISAGWGH ESODWN EXODWN SE VAR KAI DIAXRAFONTAI OI PROIGOUMENES KATAXORISEIS
	//(PERNEI THN TROPOISI APO TON ELEGXO)
	private EntityManager em;
	private Dhlwsh d;
	
	
	public TropopoihshDhlwshsService(EntityManager em) {
		super();
		this.em = em;
		
	}
	
	// xronologika na to kanoume h oxi?
	//elegxos gi ahdh iparxousa
	public Dhlwsh VresThnTeleutaiaDhlwsh(int id){
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Dhlwsh dhlwsh = em.find(Dhlwsh.class, id);
		em.close();
		if(dhlwsh.isEmprothesmh()){
			return dhlwsh;
		}else{
			return null;
	
		}
			}
	
	public void TropopoihshDhlwshs(int id, Date neasubmisiondate){
		Dhlwsh d= VresThnTeleutaiaDhlwsh(id);
		d.setSubmissiondate(neasubmisiondate);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(d);
		tx.commit();
		em.close();
		
	}
	
	// kai tropopoihsh parastatikwn
	
	public void TropopoihshParastatikwn(int id,int arithmospara, double poso, boolean eidos){
		Dhlwsh d= VresThnTeleutaiaDhlwsh(id);
		HashSet<Parastatiko> pa = d.getParastatika();
		for(Parastatiko p:pa){
			if(p.getArithmosparastatikou()==arithmospara){
				p.setPoso(poso);
				p.setEidossinallaghs(eidos);
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				em.persist(p);
				tx.commit();
				em.close();
			}
		}
	}
	
	
}
