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

	public double getDiaforaposou() {
		return diaforaposou;
	}

	public void setDiaforaposou(double diaforaposou) {
		this.diaforaposou = diaforaposou;
	}
	
	
	// mia sinarthsh h opoia tha pigainei sto service
	// kai tha tou dinei to arithmosparastatikou
	// tha girname ena afm kai ena arithmo parastatikou.
	public String fereAfmsimbalomenou(int id ){
		String ela;
		for(Dhlwsh d:dhlwsh){
			if(d.getId()==id){
				for(Parastatiko p:d.getParastatika()){
					p.getAfmsimvalwmenoou();
					
				}
				
			}
		}
		return;
		
	}
	
	

}
