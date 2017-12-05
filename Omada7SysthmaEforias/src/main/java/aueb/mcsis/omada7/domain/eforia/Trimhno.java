package aueb.mcsis.omada7.domain.eforia;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Trimhno {
	//vohthitikh klash gia na mas dinei to pedio emmprothesmh.kai na kanoume kai allous elegxous

 public static final LocalDate atrimhno = LocalDate.of(2017, Month.APRIL, 1);
 public static final LocalDate btrimhno = LocalDate.of(2017, Month.JULY, 1);
 public static final LocalDate gtrimhno = LocalDate.of(2017, Month.OCTOBER, 1);
 public static final LocalDate dtrimhno = LocalDate.of(2017, Month.JANUARY, 1);
  
  LocalDate ela;
  int mhnas;
  int etos;
  int mera;
  
  
  public Trimhno() {
	this.ela = LocalDate.now();
}
  
  



public Trimhno(int mhnas, int etos, int mera) {
	super();
	this.mhnas = mhnas;
	this.etos = etos;
	this.mera = mera;
	this.ela = LocalDate.of(etos, mhnas, mera);
}




public LocalDate SePioTrimhnoEisai(){
	
	if(ela.getYear()<=LocalDate.now().getYear()){
	if (ela.isBefore(atrimhno)){
		return dtrimhno;
	}else if (ela.isBefore(btrimhno) && ela.isAfter(atrimhno)) {
		return atrimhno;
	}else if (ela.isAfter(btrimhno) && ela.isBefore(gtrimhno)) {
		return btrimhno;
	}else if (ela.isAfter(gtrimhno) && ela.isBefore(dtrimhno)) {
		return gtrimhno;
	}else{
		return null;
	}
	}
	else{
		return null;
	}
}



public int paremeres(){
	  int days=0;
	  if (ela.isBefore(atrimhno)){
		  Period age = Period.between(dtrimhno, ela);
		  days = age.getDays();
	  }else if (ela.isBefore(btrimhno) && ela.isAfter(atrimhno)) {
		  Period age = Period.between(atrimhno, ela);
		  days = age.getDays();
	}else if (ela.isAfter(btrimhno) && ela.isBefore(gtrimhno)) {
		Period age = Period.between(btrimhno, ela);
		  days = age.getDays();
	}else if (ela.isAfter(gtrimhno) && ela.isBefore(dtrimhno)) {
		Period age = Period.between(gtrimhno, ela);
		  days = age.getDays();
	}
	  return days;
  }
  
  
}
