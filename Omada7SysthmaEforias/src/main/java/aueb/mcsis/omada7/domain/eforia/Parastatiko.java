package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Parastatika")
public class Parastatiko {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	
	@Column(name="afmmsimvalwmenou")
	String afmsimvalwmenoou;
	
	@Column(name="arithmosparastatikou",nullable = false, unique = true)
	int arithmosparastatikou;
	
	@Column(name="eidos")
	//gia esoda tha einai 1,gia eksoda tha einai 0
	boolean eidossinallaghs;
	
	@Column(name="poso")
	double poso;
	
	@Column(name="hmeromhniaparas")
	Date hmeromhniaparastatikou;
	
	
	//ean einai monodromh telika tote den xreiazetai 
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="dhlwshid")
	private Dhlwsh d;
	
	
	public Parastatiko() {
		super();
	}
	
	

	
	public Parastatiko( String afmsimvalwmenoou, int arithmosparastatikou, boolean eidossinallaghs, double poso,
			Date hmeromhniaparastatikou) {
		super();
	
		this.afmsimvalwmenoou = afmsimvalwmenoou;
		this.arithmosparastatikou = arithmosparastatikou;
		this.eidossinallaghs = eidossinallaghs;
		this.poso = poso;
		this.hmeromhniaparastatikou = hmeromhniaparastatikou;
	}












	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getAfmsimvalwmenoou() {
		return afmsimvalwmenoou;
	}
	public void setAfmsimvalwmenoou(String afmsimvalwmenoou) {
		this.afmsimvalwmenoou = afmsimvalwmenoou;
	}
	
	
	public int getArithmosparastatikou() {
		return arithmosparastatikou;
	}
	public void setArithmosparastatikou(int arithmosparastatikou) {
		this.arithmosparastatikou = arithmosparastatikou;
	}
	
	
	public boolean isEidossinallaghs() {
		return eidossinallaghs;
	}
	public void setEidossinallaghs(boolean eidossinallaghs) {
		this.eidossinallaghs = eidossinallaghs;
	}
	
	
	public double getPoso() {
		return poso;
	}
	public void setPoso(double poso) {
		this.poso = poso;
	}
	
	
	public Date getHmeromhniaparastatikou() {
		return hmeromhniaparastatikou;
	}
	public void setHmeromhniaparastatikou(Date hmeromhniaparastatikou) {
		this.hmeromhniaparastatikou = hmeromhniaparastatikou;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((afmsimvalwmenoou == null) ? 0 : afmsimvalwmenoou.hashCode());
		result = prime * result + arithmosparastatikou;
		result = prime * result + id;
		return result;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parastatiko other = (Parastatiko) obj;
		if (afmsimvalwmenoou == null) {
			if (other.afmsimvalwmenoou != null)
				return false;
		} else if (!afmsimvalwmenoou.equals(other.afmsimvalwmenoou))
			return false;
		if (arithmosparastatikou != other.arithmosparastatikou)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	// epistrefei to poso analoga me to ti einai kaii pairnei ws orisma ena parastaiko apo to set parastikwn pou diathetei h dhlwsh
	public double PareToPoso(Parastatiko p){
		if (p.isEidossinallaghs())
		{return p.getPoso();}
		else{
			return -p.getPoso();
		}
	}
}

