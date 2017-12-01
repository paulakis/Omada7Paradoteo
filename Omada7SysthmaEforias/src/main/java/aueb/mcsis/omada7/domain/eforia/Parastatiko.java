package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;
import java.util.Set;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	//undeer investigetation(mallon nai)
	String afmprwteuontos;
	
	String afmsimvalwmenoou;
	
	
	int arithmosparastatikou;
	
	
	boolean eidossinallaghs;
	
	
	double poso;
	
	
	Date hmeromhniaparastatikou;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id")
	private Dhlwsh d;
	
	
	public Parastatiko() {
		super();
	}
	
	

	
	
	public Parastatiko(int id, String afmprwteuontos, String afmsimvalwmenoou, int arithmosparastatikou,
			boolean eidossinallaghs, double poso, Date hmeromhniaparastatikou) {
		super();
		this.id = id;
		this.afmprwteuontos = afmprwteuontos;
		this.afmsimvalwmenoou = afmsimvalwmenoou;
		this.arithmosparastatikou = arithmosparastatikou;
		this.eidossinallaghs = eidossinallaghs;
		this.poso = poso;
		this.hmeromhniaparastatikou = hmeromhniaparastatikou;
	}





	
	public String getAfmprwteuontos() {
		return afmprwteuontos;
	}





	public void setAfmprwteuontos(String afmprwteuontos) {
		this.afmprwteuontos = afmprwteuontos;
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
	
// na koitaksoume thn sisxetish ps tha paei telika me th dhlwsh h me ta parastatika.
	public double sinoloesodwneksodwn(Set<Parastatiko> p, LogariasmosEtairias e, boolean x ){
		double poso=0;
		for (Parastatiko item :p){
			if(item.afmprwteuontos==e.getAfm()){
			if(item.eidossinallaghs)
			{poso += item.poso;}
			else
			{ poso -= item.poso;}
		 }
		}
		return poso;}
	
}

