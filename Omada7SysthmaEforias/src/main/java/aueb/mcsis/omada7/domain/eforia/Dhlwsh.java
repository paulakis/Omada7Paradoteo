package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Dhlwsh")
public class Dhlwsh {
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, 
	            mappedBy="id", fetch=FetchType.LAZY)
	private Set<Parastatiko> parastatika = new HashSet<Parastatiko>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	
	@Column(nullable = false, unique = true)
	Date submissiondate;
	
	@Column(nullable = false, unique = true)
	double sinoloprostimou;
	
	@Column(nullable = false, unique = true)
	boolean emprothesmh;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="afmprwteuontos")
	
	private LogariasmosEtairias etairia;
	
	
	
	
	public Dhlwsh() {
		super();
	}


	public Dhlwsh(int id, Date submissiondate, double sinoloprostimou, boolean emprothesmh) {
		super();
		this.id = id;
		this.submissiondate = submissiondate;
		this.sinoloprostimou = sinoloprostimou;
		this.emprothesmh = emprothesmh;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getSubmissiondate() {
		return submissiondate;
	}


	public void setSubmissiondate(Date submissiondate) {
		this.submissiondate = submissiondate;
	}


	public double getSinoloprostimou() {
		return sinoloprostimou;
	}


	public void setSinoloprostimou(double sinoloprostimou) {
		this.sinoloprostimou = sinoloprostimou;
	}


	public boolean isEmprothesmh() {
		return emprothesmh;
	}


	public void setEmprothesmh(boolean emprothesmh) {
		this.emprothesmh = emprothesmh;
	}

	
	
	//den exw valei setter gia n mhn mporei kapoios na peiraksei ena parastatiko
	public HashSet<Parastatiko> getParastatika() {
		return new HashSet<Parastatiko>(parastatika);
	}


	//no setter gia na mhn mporei kapoiow na peiraksei thn etairia
	public LogariasmosEtairias getEtairia() {
		return etairia;
	}

	public void setLogarismosEtairias( LogariasmosEtairias etairia){
		this.etairia=etairia;
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Dhlwsh other = (Dhlwsh) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	public boolean MporeiNaKaneiTropopoihsh(){
		if (etairia.isExeiElefthei()){
			return true;
		}else{
			return false;
		}
	}
	// den kserw an xreiazetai
	public void EisagwghNeasDhlwshs(int id, Date submissiondate, double sinoloprostimou, boolean emprothesmh){
		new Dhlwsh(id,submissiondate,sinoloprostimou,emprothesmh);
	}
	
	
	
	//metraei ta parastatika pou exei katathesei sthn kathe tou dhlwsh h x etairia
	public int SinoloParastatikwn(){
		return parastatika.size();
	}
	
	//eisagei neo parastatiko
	public void addParastatiko(Parastatiko p){
		if(p!=null){
			parastatika.add(p);
		}
	}

	
	//diorwthwnei hddh iparxon parastatiko mono ean einai emprothesmh kai den exw kseperasei tis meres pou mporw na kanw thn allagh
	//pithanon na thelei kai allo orisma
	//anloga me to id tha prepei na vriskw to parastaiko x kai na tou allazw to aparaithta pedia
	public void diorthwseParastatiko(int id ){
		//na mpei sta service
	}
	
	//elegxos ean iparxei sta parastatika.used by correctParastatiko
	public  boolean IparxeiHdhStaParastatika(Parastatiko p){
		if(parastatika.contains(p)){
			return true;	
		}else{
			return false;
		}
		
		
	}
	

}
