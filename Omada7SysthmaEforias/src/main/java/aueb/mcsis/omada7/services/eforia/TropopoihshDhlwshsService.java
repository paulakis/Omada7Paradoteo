package aueb.mcsis.omada7.services.eforia;

import java.util.Date;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import aueb.mcsis.omada7.domain.eforia.Parastatiko;
import aueb.mcsis.omada7.persistence.eforia.JPAUtil;
import aueb.mcsis.omada7.domain.eforia.Dhlwsh;

public class TropopoihshDhlwshsService {
	//BOOLEAN TROPOISIS  ENTOS XRONIKOU TRUE 
	//STO FALSE DEN BOREI
	//EISAGWGH ESODWN EXODWN SE VAR KAI DIAXRAFONTAI OI PROIGOUMENES KATAXORISEIS
	//(PERNEI THN TROPOISI APO TON ELEGXO)
	private EntityManager em;
	
	
	public TropopoihshDhlwshsService(EntityManager em) {
		super();
		this.em = em;
		
	}
	

	public Dhlwsh VresThnTeleutaiaDhlwsh(int id){

		Dhlwsh dhlwsh = em.find(Dhlwsh.class, id);
		if(dhlwsh.isEmprothesmh()){
			return dhlwsh;
		}else{
			return null;
	
		}
			}
	
	public boolean TropopoihshDhlwshs(int id, Date neasubmisiondate){
		Dhlwsh d= VresThnTeleutaiaDhlwsh(id);
		if(d!=null){
		d.setSubmissiondate(neasubmisiondate);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(d);
		tx.commit();
		return true;
		}else{
			return false;
		}
		
		
	}
	
	// kai tropopoihsh parastatikwn
	
	public boolean TropopoihshParastatikwn(int id,int arithmospara, double poso, boolean eidos){
		Dhlwsh d= VresThnTeleutaiaDhlwsh(id);
		boolean a=false;
		HashSet<Parastatiko> pa = d.getParastatika();
		for(Parastatiko p:pa){
			if(p.getArithmosparastatikou()==arithmospara){
				p.setPoso(poso);
				p.setEidossinallaghs(eidos);
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				em.persist(p);
				tx.commit();
				a=true;
			}
		}
		return a;
	}
	
	
}
