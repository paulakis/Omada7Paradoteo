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
	
	String afmkatoxou;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, 
	            mappedBy="LogariasmosEtairias", fetch=FetchType.LAZY)
	Set<Parastatiko> parastatika;
	
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
	@JoinColumn(name="afmprwteuontos" )
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
	public Set<Parastatiko> getParastatika() {
		return parastatika;
	}


	//no setter gia na mhn mporei kapoiow na peiraksei thn etairia
	public LogariasmosEtairias getEtairia() {
		return etairia;
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
	
	
	public boolean MporeiNaKaneiTropopoihsh(boolean e){
		if (e){
			return true;
		}else{
			return false;
		}
	}
	
	public void EisagwghNeasDhlwshs(int id, Date submissiondate, double sinoloprostimou, boolean emprothesmh){
		new Dhlwsh(id,submissiondate,sinoloprostimou,emprothesmh);
	}
	
	//diorthwsh
	public void TropopoihshDhlwshs(Set<Parastatiko> parastatika, boolean e , Parastatiko p ){
		boolean a=true;
		if(e){
			for (Parastatiko g: parastatika){
				if (g.getArithmosparastatikou()==p.arithmosparastatikou){
					g.setPoso(p.poso);
					g.setEidossinallaghs(p.eidossinallaghs);
				}
				else{
					parastatika.add(p);
				}
			}
		}
	}
	
	//diorthwsh
	public int SinoloParastatikwn(Set<Parastatiko> parastatika,String afm){
		int i=0;
		for (Parastatiko s :parastatika){
			if(true){
				i++;
			}
		}
		return i;
	}
	
	//eisagei neo parastatiko
	public void addParastatiko(){
		
	}

	
	//diorwthwnei hddh iparxon parastatiko
	public void correctParastatiko(){
		
	}
	
	//elegxos ean iparxei sta parastatika.used by correctParastatiko
	public  boolean IparxeiHdhStaParastatika(){
		return true;
	}
	

}
