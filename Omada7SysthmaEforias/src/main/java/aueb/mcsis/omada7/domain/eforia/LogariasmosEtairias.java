package aueb.mcsis.omada7.domain.eforia;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name = "LogariasmosEtairias")
public class LogariasmosEtairias  {
	
	Set<Dhlwsh> dhlwseis;
	//Set<Dhlwsh> dhlwseis = new HashSet<Dhlwsh>();

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(nullable = false, unique = true)
	String epwnimia;
	
	@Column(nullable = false, unique = true)
	Date hmeromhniasistashs;
	
	@Column(nullable = false, unique = true)
	String afm;
	
	@Column(nullable = false, unique = true)
	String email;
	
	@Column(nullable = false, unique = true)
	int thlefwno;
	
	
	public LogariasmosEtairias() {
		super();
	}
	
	public LogariasmosEtairias(String epwnimia, Date hmeromhniasistashs, String afm, String email, int thlefwno) {
		super();
		this.epwnimia = epwnimia;
		this.hmeromhniasistashs = hmeromhniasistashs;
		this.afm = afm;
		this.email = email;
		this.thlefwno = thlefwno;
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEpwnimia() {
		return epwnimia;
	}
	public void setEpwnimia(String epwnimia) {
		this.epwnimia = epwnimia;
	}
	
	public Date getHmeromhniasistashs() {
		return hmeromhniasistashs;
	}
	public void setHmeromhniasistashs(Date hmeromhniasistashs) {
		this.hmeromhniasistashs = hmeromhniasistashs;
	}
	
	public String getAfm() {
		return afm;
	}
	public void setAfm(String afm) {
		this.afm = afm;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getThlefwno() {
		return thlefwno;
	}
	public void setThlefwno(int thlefwno) {
		this.thlefwno = thlefwno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((afm == null) ? 0 : afm.hashCode());
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
		LogariasmosEtairias other = (LogariasmosEtairias) obj;
		if (afm == null) {
			if (other.afm != null)
				return false;
		} else if (!afm.equals(other.afm))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	// public Set<Dhlwsh> getDhlwseis() {
	  //      return new HashSet<Dhlwsh>(Dhlwseis);
	    //}
	
	
	
	
	
	
}
