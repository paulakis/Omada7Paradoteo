package aueb.mcsis.omada7.resource.eforia;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import aueb.mcsis.omada7.domain.eforia.Dhlwsh;


@XmlRootElement
public class DhlwshInfo {
	
	int trimhno;	
	Date submissiondate;
	double sinoloprostimou;
	boolean emprothesmh;



	public DhlwshInfo() {
		super();
	}


	public DhlwshInfo(Dhlwsh d) {
		trimhno=d.getTrimhno();
		submissiondate=d.getSubmissiondate();
		sinoloprostimou=d.getSinoloprostimou();
		emprothesmh=d.isEmprothesmh();
		
	}




	public DhlwshInfo(int trimhno, Date submissiondate, double sinoloprostimou, boolean emprothesmh) {
		super();
		this.trimhno = trimhno;
		this.submissiondate = submissiondate;
		this.sinoloprostimou = sinoloprostimou;
		this.emprothesmh = emprothesmh;
	}

	
	public int getTrimhno() {
		return trimhno;
	}


	public void setTrimhno(int trimhno) {
		this.trimhno = trimhno;
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



	public void wrap(){
		
	}

}
