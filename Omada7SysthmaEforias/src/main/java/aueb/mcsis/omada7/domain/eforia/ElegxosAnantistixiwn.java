package aueb.mcsis.omada7.domain.eforia;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("anantistoixies")
public class ElegxosAnantistixiwn extends AithmaElegxou {
	
	

	
	@Column
	double diaforaposou;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dhlwshid")
	public  Dhlwsh d;

	
	
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
	
	

	
	
	//AFTO EINAI LATHOS -- METRAME APO TIN ARXI TOU TRIMINOU OXI APO TIN IMERA POU EGINE SUBMISION H DILOSI -FILTI
	//ean exoun perasei oi 30 meres gia na ginei o prwtos elegxos
	@SuppressWarnings("deprecation")
	public boolean tsekareEanEntosXronikouOriou(Dhlwsh d){
		Trimhno tr=new Trimhno(d.getSubmissiondate().getMonth(), d.getSubmissiondate().getYear(), d.getSubmissiondate().getDay());
		if(tr.paremeres()>30){
			return true;
		}else{
		return false;}
		
	}
	
	//na eksetasoume kai ton elegxo meta apo tis 35 meres.ti tha ginetai
	
	
}
