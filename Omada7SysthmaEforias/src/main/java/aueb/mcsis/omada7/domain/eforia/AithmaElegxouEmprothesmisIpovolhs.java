package aueb.mcsis.omada7.domain.eforia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("emprothesmh")
public class AithmaElegxouEmprothesmisIpovolhs extends AithmaElegxou {

	final double protimo=500;
	//mipws prepei na figei?
	private	double prostimoekprothesmis;
	
	@OneToOne
	private Dhlwsh dh;
	
	// den xreiazontaii mallon 
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
	
	public void ElegkseGiaEkprothesmh(){
		Trimhno ela=new Trimhno();
		if (ela.paremeres()>20){
			dh.setEmprothesmh(true);
			
		}else{
			dh.setEmprothesmh(false);
			updatesinolopros();
		}
		}
	
	
	public void updatesinolopros(){
		// mporei na ginei kai xwris prosthesh
		dh.setSinoloprostimou(protimo+dh.getSinoloprostimou());
	}
	

	
	
	
}
