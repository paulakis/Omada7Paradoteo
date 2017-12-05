package aueb.mcsis.omada7.domain.eforia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("apath")
public class ElegxosApaths extends AithmaElegxou {
	
	static double prostimo;
	double soumaesodwneskodwn;
	boolean apath;
	private  Dhlwsh d;
	
//sinoliko poso exodown-esodwn diafora <<0 episterfei boolean apath kai ekxorei sth vadh apati
	//apo mian dhlwsh athroizei ola ta parastatika kai vgazei to sum
	
	public boolean Ipopsifiaapath(Dhlwsh d){
		double souma=0;
		for(Parastatiko p: d.getParastatika()){
			souma =+ p.PareToPoso(p);
		}
		if (souma<-1000){
		return true;
		}else{
			return false;
		}
	}
	
	public String GirnaeiToAfmThsApaths(){
		if(Ipopsifiaapath(d)){
			return d.getEtairia().getAfm();
		}else{
		return null;
		}
	}
	
	

}
