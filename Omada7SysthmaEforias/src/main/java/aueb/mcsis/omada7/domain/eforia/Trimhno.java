package aueb.mcsis.omada7.domain.eforia;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Trimhno {
	//vohthitikh klash gia na mas dinei to pedio emmprothesmh.

 public static LocalDate atrimhno = LocalDate.of(2017, Month.APRIL, 1);
  static LocalDate btrimhno = LocalDate.of(2017, Month.JULY, 1);
  static LocalDate gtrimhno = LocalDate.of(2017, Month.OCTOBER, 1);
  static LocalDate dtrimhno = LocalDate.of(2017, Month.JANUARY, 1);
  
  LocalDate ela;
  
  
  
  public Trimhno() {
	this.ela = LocalDate.now();
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
