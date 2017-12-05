package aueb.mcsis.omada7.domain.eforia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("apath")
public class ElegxosApaths extends AithmaElegxou {
	
	 double prostimo;
	double soumaesodwneskodwn;
	boolean apath;
	private  Dhlwsh d;
	
	
	
public ElegxosApaths() {
		super();
	}



public ElegxosApaths(double prostimo, double soumaesodwneskodwn, boolean apath) {
	super();
	this.prostimo = prostimo;
	this.soumaesodwneskodwn = soumaesodwneskodwn;
	this.apath = apath;
}




//sinoliko poso exodown-esodwn diafora <<0 episterfei boolean apath kai ekxorei sth vadh apati
	//apo mian dhlwsh athroizei ola ta parastatika kai vgazei to sum
	
	public double getProstimo() {
	return prostimo;
}



public void setProstimo(double prostimo) {
	this.prostimo = prostimo;
}



public double getSoumaesodwneskodwn() {
	return soumaesodwneskodwn;
}



public void setSoumaesodwneskodwn(double soumaesodwneskodwn) {
	this.soumaesodwneskodwn = soumaesodwneskodwn;
}



public boolean isApath() {
	return apath;
}



public void setApath(boolean apath) {
	this.apath = apath;
}



	public double Ipopsifiaapath(Dhlwsh d){
		double souma=0;
		for(Parastatiko p: d.getParastatika()){
			souma =+ p.PareToPoso(p);
		}
		return souma;
	}
	
	public boolean EinaiApath(double x){
		if(x<-1000){
			return true;
		}else{
			return false;
		}
	}
	
	public String GirnaeiToAfmThsApaths(){
		if(EinaiApath(Ipopsifiaapath(d))){
			return d.getEtairia().getAfm();
		}else{
		return null;
		}
	}
	
	public double DhmiourgiaProstimou(){
		return prostimo=Math.abs(soumaesodwneskodwn*100);
	}

}
