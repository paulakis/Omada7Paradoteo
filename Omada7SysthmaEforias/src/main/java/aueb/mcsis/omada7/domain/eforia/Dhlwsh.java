package aueb.mcsis.omada7.domain.eforia;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Dhlwsh")
public class Dhlwsh {
	
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
	
	
	/*public double sinoloposou(Set<Parastatiko> p){
		for (<Parastatiko> item :p){
			if(item.iseidossinallaghs){
			 double poso += item.poso;
			}
			else
			{double poso -= item.poso}
		}
		return poso;
	}*/
	
	

}
