package aueb.mcsis.omada7.domain.eforia;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("emprothesmh")
public class AithmaElegxouEmprothesmisIpovolhs extends AithmaElegxou {

	final double protimo=500;
	
	@Id
	@Column
	int id;
	
	@Column
	private	double prostimoekprothesmis;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dhlwshid")
	public  Dhlwsh d;
	
	
	
	
	public AithmaElegxouEmprothesmisIpovolhs() {
		super();
	}

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
	//mallon prepei na figei
	public void ElegkseGiaEkprothesmh(){
		Trimhno ela=new Trimhno();
		if (ela.paremeres()>20){
			d.setEmprothesmh(true);
			
		}else{
			d.setEmprothesmh(false);
			updatesinolopros();
		}
		}
	
	
	public void updatesinolopros(){
		// mporei na ginei kai xwris prosthesh
		d.setSinoloprostimou(protimo+d.getSinoloprostimou());
	}
	

	
	
	
}
