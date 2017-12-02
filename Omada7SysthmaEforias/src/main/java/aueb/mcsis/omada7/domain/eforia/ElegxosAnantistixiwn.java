package aueb.mcsis.omada7.domain.eforia;

import java.util.HashSet;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("anantistoixies")
public class ElegxosAnantistixiwn extends AithmaElegxou {
	
	double diaforaposou;
	private Dhlwsh dh;

	public double getDiaforaposou() {
		return diaforaposou;
	}

	public void setDiaforaposou(double diaforaposou) {
		this.diaforaposou = diaforaposou;
	}
	
	
	// mia sinarthsh h opoia tha pigainei sto service
	// kai tha tou dinei to arithmosparastatikou
	// tha girname ena afm kai ena arithmo parastatikou.
	public void fereAfmKaiAriPara(){
		
	}
	
	

}
