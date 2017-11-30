package aueb.mcsis.omada7.domain.eforia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("emprothesmh")
public class AithmaElegxouEmprothesmisIpovolhs extends AithmaElegxou {

	
	double prostimoekprothesmis;

	
	
	
	public AithmaElegxouEmprothesmisIpovolhs(double prostimoekprothesmis) {
		super();
		this.prostimoekprothesmis = prostimoekprothesmis;
	}

	public double getProstimoekprothesmis() {
		return prostimoekprothesmis;
	}

	public void setProstimoekprothesmis(double prostimoekprothesmis) {
		this.prostimoekprothesmis = prostimoekprothesmis;
	}
	
	
	//Dhlwsh d1= new Dhlwsh(int id, Date submissiondate, double sinoloprostimou, boolean emprothesmh);
	//if (d1.isEmprothesmh()){
	//     prostimoekprothesmis=0;}
	//else{
	     // prostimoekprothesmis=100;}
	
	
	
}
