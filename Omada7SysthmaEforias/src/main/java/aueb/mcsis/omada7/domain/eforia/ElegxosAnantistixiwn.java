package aueb.mcsis.omada7.domain.eforia;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("anantistoixies")
public class ElegxosAnantistixiwn extends AithmaElegxou {
	
	double diaforaposou;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, 
            mappedBy="id", fetch=FetchType.LAZY)
	private Set<Dhlwsh> dhlwsh=new HashSet<Dhlwsh>();

	
	
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
	public Set<Anantistoixia> AnantistoixiesEnaProsEna(){
		Set<Anantistoixia> ana=new HashSet<Anantistoixia>();
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
								ana.add(new Anantistoixia(afmtolook,d.getId(), d.getEtairia().getAfm(),dhl.getId(), teliko, EinaiAnantistoixia(teliko),parastatikotollok));
							}
						}
					}
				}
			}
		}
		return ana;
	}
	
	
	
	
	public boolean EinaiAnantistoixia(double x){
		if (x!=0){
			return true;
		}else{
		return false;}
		
	}
	
	//ean exoun perasei oi 30 meres gia na ginei o prwtos elegxos
	public boolean tsekareEanEntosXronikouOriou(Dhlwsh d){
		Trimhno tr=new Trimhno(d.getSubmissiondate().getMonth(), d.getSubmissiondate().getYear(), d.getSubmissiondate().getDay());
		if(tr.paremeres()>30){
			return true;
		}else{
		return false;}
		
	}
	
	//na eksetasoume kai ton elegxo meta apo tis 35 meres.ti tha ginetai
	
	
}
