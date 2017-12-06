package aueb.mcsis.omada7.domain.eforia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anantistoixia")
public class Anantistoixia {

	//vohthitikh klash gia na epistrefoume ena set apo antikeimena gia ton eforo kai gia na enhmerwnonte o eforos-kai oi antisimbalomenoi.
	@Column(name="afmsimba",nullable = false, unique = true)
	String afmsimbalomenou;
	@Column(name="afmanti",nullable = false, unique = true)
	String afmanti;
	@Column(name="diafora",nullable = false, unique = true)
	double diafora;
	@Column(name="apath",nullable = false, unique = true)
	boolean apath;
	@Id
	@Column(name="arithmospara",nullable = false, unique = true)
	int arithmospara;
	
	
	
	
	public Anantistoixia() {
		super();
	}


	public Anantistoixia(String afmsimbalomenou, String afmanti, double diafora, boolean apath, int arithmospara) {
		super();
		this.afmsimbalomenou = afmsimbalomenou;
		this.afmanti = afmanti;
		this.diafora = diafora;
		this.apath = apath;
		this.arithmospara = arithmospara;
	}


	public String getAfmsimbalomenou() {
		return afmsimbalomenou;
	}


	public void setAfmsimbalomenou(String afmsimbalomenou) {
		this.afmsimbalomenou = afmsimbalomenou;
	}


	public String getAfmanti() {
		return afmanti;
	}


	public void setAfmanti(String afmanti) {
		this.afmanti = afmanti;
	}


	public double getDiafora() {
		return diafora;
	}


	public void setDiafora(double diafora) {
		this.diafora = diafora;
	}


	public boolean isApath() {
		return apath;
	}


	public void setApath(boolean apath) {
		this.apath = apath;
	}


	public int getArithmospara() {
		return arithmospara;
	}


	public void setArithmospara(int arithmospara) {
		this.arithmospara = arithmospara;
	}
	
	
	
	
	
	
	
}
