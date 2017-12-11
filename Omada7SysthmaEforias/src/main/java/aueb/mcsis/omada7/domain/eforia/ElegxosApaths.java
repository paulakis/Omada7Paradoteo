package aueb.mcsis.omada7.domain.eforia;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="ElegxosApaths")
public class ElegxosApaths extends AithmaElegxou {
	
	

	@Column
	double prostimo;
	@Column
	double soumaesodwneskodwn;
	@Column
	boolean apath;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dhlwshid")
	public  Dhlwsh d;
	
	
	
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

//na valoume edw to ean exoun perasei oi 35 meres??
@SuppressWarnings("deprecation")
public boolean ElegkseAnPerasan35Meres(Dhlwsh d){
	Trimhno tr=new Trimhno(d.getTrimhno(), d.getSubmissiondate().getMonth(),d.getSubmissiondate().getYear() , d.getSubmissiondate().getDay());
	if(tr.paremeres()>=35){
		System.out.println(tr.paremeres());
		setEnhmerwsheforou(true);
		return true;
	}else{
		return false;
	}
	
}
//to trimhno ths dhlwshs
//tha paroume kai to submissiondate
//kai tha doume >=35 meres





	//service elegxos apaths allages.
	
	//ena add na valoume ena antikeimeno.
	
	
	
	
}
