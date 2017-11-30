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
	
	@Column(name="afmprwteuontos",nullable = false, unique = true)
	String afm;
	
	@Column(nullable = false, unique = true)
	String email;
	
	@Column(nullable = false, unique = true)
	int thlefwno;
	
	//if it's true then eforos has done the check.when false then they can submit the statement
	
	@Column(nullable = false, unique = true)
	boolean exeiElefthei;
	
	//eforos must check thhis logarriasmos.
	
	@Column(nullable = false, unique = true)
	boolean needCheck;
	
	
	public LogariasmosEtairias() {
		super();
	}
	

	


	public LogariasmosEtairias(int id, String epwnimia, Date hmeromhniasistashs, String afm, String email, int thlefwno,
			boolean exeiElefthei, boolean needCheck) {
		super();
		this.id = id;
		this.epwnimia = epwnimia;
		this.hmeromhniasistashs = hmeromhniasistashs;
		this.afm = afm;
		this.email = email;
		this.thlefwno = thlefwno;
		this.exeiElefthei = exeiElefthei;
		this.needCheck = needCheck;
	}





	public Set<Dhlwsh> getDhlwseis() {
		return dhlwseis;
	}



	public void setDhlwseis(Set<Dhlwsh> dhlwseis) {
		this.dhlwseis = dhlwseis;
	}



	public boolean isExeiElefthei() {
		return exeiElefthei;
	}



	public void setExeiElefthei(boolean exeiElefthei) {
		this.exeiElefthei = exeiElefthei;
	}




	public boolean isNeedCheck() {
		return needCheck;
	}

	public void setNeedCheck(boolean needCheck) {
		this.needCheck = needCheck;
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
	
	//mallon auto den xreiazetai
	public Set<Dhlwsh> getDhlwseis(LogariasmosEtairias e, Set<Dhlwsh> dhlwseis) {
		Set <Dhlwsh> a=new HashSet<>();
		for (Dhlwsh s : dhlwseis){
			if (s.afmkatoxou==e.getAfm()){
				a.add(s);
			}
		}
        return a ;
   }
	
	
	public boolean MporeiNaKaneiDhlwsh(LogariasmosEtairias e ){
		
		if (e.exeiElefthei && !e.needCheck){
			return true;
		}
		return false;
	}
	
	
	public boolean isValidAfm(LogariasmosEtairias e){
		if(e.getAfm().length()>9){
			System.out.println("den einai egiros arithmos");
			return false;
		}
		else{
			return true;
		}
	}
	
	public boolean EgirosAfm(LogariasmosEtairias e){
		  char[] afm;
	        double count=0;
	        double digit,finalNum=0;
	        String temp;
	        afm=e.getAfm().toCharArray();

	        for(int i=afm.length;i>=1;i--){
	            if(count!=0){
	            temp=String.valueOf(afm[i-1]);
	            digit=Integer.parseInt(temp);
	           finalNum=finalNum+digit*Math.pow(2,count);
	            }
	           count++;
	        }

	        temp=String.valueOf(afm[afm.length-1]);
	        digit=Integer.parseInt(temp);

	        if(((finalNum%11)%10)==digit){
	           return true;
	        }
	        else {return false;	}
	        
	}
	
	
	public LogariasmosEtairias TropopoihshEggrafhs(int id, String epwnimia, Date hmeromhniasistashs, String afm, String email, int thlefwno,
			boolean exeiElefthei, boolean needCheck){
		return new LogariasmosEtairias(id, epwnimia, hmeromhniasistashs, afm, email, thlefwno, false, true);
	}
	
	
	
	
}
