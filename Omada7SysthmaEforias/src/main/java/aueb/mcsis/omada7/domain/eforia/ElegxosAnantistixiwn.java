package aueb.mcsis.omada7.domain.eforia;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("anantistoixies")
public class ElegxosAnantistixiwn extends AithmaElegxou {
	
	double diaforaposou;
	Set<Dhlwsh> dhlwsh;

	
	
	public ElegxosAnantistixiwn(double diaforaposou) {
		super();
		this.diaforaposou = diaforaposou;
	}
	
	
	
	public ElegxosAnantistixiwn() {
		super();
	}



	public double getDiaforaposou() {
		return diaforaposou;
	}

	public void setDiaforaposou(double diaforaposou) {
		this.diaforaposou = diaforaposou;
	}
	
	
	// na doume mipws valoume mia klash anantistoixies.!!!!!!
	//mipws na dinei pisw ena set apo afms diafora posou kai ta loipa 
	public void AnantistoixiesEnaProsEna(){
		for(Dhlwsh d:dhlwsh){
			for(Parastatiko p:d.getParastatika()){
				String afmtolook=p.getAfmsimvalwmenoou();
				int parastatikotollok=p.getArithmosparastatikou();
				double prwto=p.getPoso();
				for(Dhlwsh dhl:dhlwsh){
					if(dhl.getEtairia().getAfm()==afmtolook){
						for(Parastatiko para:dhl.getParastatika()){
							if(para.getArithmosparastatikou()==parastatikotollok){
								double teliko= prwto-para.getPoso();
								EinaiAnantistoixia(teliko);
							}
						}
					}
				}
			}
		}
	}
	

	
	public boolean EinaiAnantistoixia(double x){
		if (x!=0){
			return true;
		}else{
		return false;}
		
	}
	

}
