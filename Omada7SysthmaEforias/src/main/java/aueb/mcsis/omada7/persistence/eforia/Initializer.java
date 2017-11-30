package aueb.mcsis.omada7.persistence.eforia;

import java.util.Date;

import com.mgiandia.library.domain.Author;

public class Initializer {
	//ftiaxnei adikimena gia na petame mesa stin vasi.afta ta adikeimena tha xeiristoume kathos trexoume tin efarmogi
 //tha dimiourgoume to prepare data : 3 logarisomous diafoterous apo mia dhlwsh  ka8enas apo 3 parastatika gia ka8e dilswsh 
// susxetisies logarismos-dilosi - parastatiko
 // mitsuko pano!!! 
 // tha thn vgalw gia kopanima ston pano
 // oti leei sth h2
 // break panos;
 
  protected  void eraseData();
   
  
     public void prepareData() {
         // πριν εισάγουμε τα δεδομένα διαγράφουμε ότι υπάρχει
         eraseData();                      
         LogariasmosEtairias VEROPOULOS = new LogariasmosEtairias( 1, "veropoulos","2012-5-13", 987654321, "veropoulos@ver.gr", 2102574575,
        true, true);
         LogariasmosEtairias SKLAVENITIS= new LogariasmosEtairias( 2, "sklavenitis","2015-2-13", 987654322, "sklavenitis@sklav.gr", 2102574576,
        true,false);
         LogariasmosEtairias JUMBO = new LogariasmosEtairias( 3, "jumbo","2013-9-12", 987654323, "jumbo@jum.gr", 2102579574,
        false, true);
         LogariasmosEtairias XAITOGLOU = new LogariasmosEtairias( 4, "xaitoglou","2013-5-13", 987654324, "xaitoglou@xai.gr", 2102584575,
        false, false);
         
         int id, Date submissiondate, double sinoloprostimou, boolean emprothesmh
         
         	Dhlwsh d1 = new Dhlwsh(1,"2017-10-3",0 ,true)
         	Dhlwsh d2 = new Dhlwsh(2,"2017-10-15",0,true)
        	Dhlwsh d3 = new Dhlwsh(3,"2017-10-22",500000,false)
                 
           Parastatiko p1= new Parastatiko(1, 987654321,987654322 , 1234,true , 300000 , "2017-6-3")
           Parastatiko p2= new Parastatiko(2, 987654321,987654323 , 2341,true , 250000 , "2017-8-22")
           Parastatiko p3= new Parastatiko(3, 987654321,987654323 , 3412,false , 100000 , "2017-5-4")
           Parastatiko p4= new Parastatiko(4, 987654323,987654324 , 4123,true , 500000 , "2017-8-15")//edo tha xtipaei
           Parastatiko p5= new Parastatiko(5, 987654324,987654322 , 1243,true , 450000 , "2017-5-13")
           Parastatiko p6= new Parastatiko(6, 987654322,987654324 , 1423,true , 330000 , "2017-4-24")
           Parastatiko p7= new Parastatiko(7, 987654321,987654322 , 1432,true , 270000 , "2017-6-3" )
           Parastatiko p8= new Parastatiko(8, 987654324,987654323 , 2134,true , 550000 , "2017-6-3" )
           Parastatiko p9= new Parastatiko(9, 987654324,987654322 , 3142,false , 60000 , "2017-6-3" )
          
           
           
           
           
           
          EntityManager em = JPAUtil.getCurrentEntityManager();
         EntityTransaction tx = em.getTransaction();
         tx.begin();

         em.persist(VEROPOULOS);
         em.persist(SKLAVENITIS);
         em.persist(JUMBO);
         em.persist(XAITOGLOU);
         em.persist(d1);
         em.persist(d2);
         em.persist(d3);
         em.persist(p1);
         em.persist(p2);
         em.persist(p3);
         em.persist(p4);
         em.persist(p5);
         em.persist(p6);
         em.persist(p7);
         em.persist(p8);
         em.persist(p9);
         
         
         tx.commit();
     }
     
}