package aueb.mcsis.omada7.persistence.eforia;


import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import aueb.mcsis.omada7.persistence.eforia.JPAUtil;

import aueb.mcsis.omada7.domain.eforia.*;


public class Initializer {
	//ftiaxnei adikimena gia na petame mesa stin vasi.afta ta adikeimena tha xeiristoume kathos trexoume tin efarmogi
 //tha dimiourgoume to prepare data : 3 logarisomous diafoterous apo mia dhlwsh  ka8enas apo 3 parastatika gia ka8e dilswsh 
// susxetisies logarismos-dilosi - parastatiko
 // mitsuko pano!!! 
 // tha thn vgalw gia kopanima ston pano
 // oti leei sth h2
 // break panos;
 
  public  void eraseData(){
	  
	  
	  EntityManager em = JPAUtil.getCurrentEntityManager();
      EntityTransaction tx = em.getTransaction();
      tx.begin();
      
      
      Query query = em.createNativeQuery("delete from parastatiko");
      query.executeUpdate();
      query = em.createNativeQuery("delete from dhlwsh");
      query.executeUpdate(); 
      query = em.createNativeQuery("delete from logariamosetairias");
      query.executeUpdate(); 
      tx.commit();
      em.close();
      
      
      
      
  };
   
  
     public void prepareData() {
         // ���� ��������� �� �������� ����������� ��� �������
         eraseData();  
        Date a= new Date();
         
         LogariasmosEtairias VEROPOULOS = new LogariasmosEtairias(1, "veropoulos",a, "987654321", "veropoulos@ver.gr", 2102574575,
        true, true);
         LogariasmosEtairias SKLAVENITIS= new LogariasmosEtairias( 2, "sklavenitis",a, "987654322", "sklavenitis@sklav.gr", 2102574576,
        true,false);
         LogariasmosEtairias JUMBO = new LogariasmosEtairias( 3, "jumbo",a, "987654323", "jumbo@jum.gr", 2102579574,
        false, true);
         LogariasmosEtairias XAITOGLOU = new LogariasmosEtairias( 4, "xaitoglou",a, "987654324", "xaitoglou@xai.gr", 2102584575,
        false, false);
         
       
         
         	Dhlwsh d1 = new Dhlwsh(1,a,0 ,true);
         	Dhlwsh d2 = new Dhlwsh(2,a,0,true);
        	Dhlwsh d3 = new Dhlwsh(3,a,500000,false);
                 
           Parastatiko p1= new Parastatiko(1, "987654322" , 1234,true , 300000 , a);
           Parastatiko p2= new Parastatiko(2,"987654323" , 2341,true , 250000 , a);
           Parastatiko p3= new Parastatiko(3,"987654323", 3412,false , 100000 , a);
           Parastatiko p4= new Parastatiko(4,"987654324" , 4123,true , 500000 , a);//edo tha xtipaei
           Parastatiko p5= new Parastatiko(5,"987654322", 1243,true , 450000 , a);
           Parastatiko p6= new Parastatiko(6,"987654324" , 1423,true , 330000 , a);
           Parastatiko p7= new Parastatiko(7,"987654322" , 1432,true , 270000 , a );
           Parastatiko p8= new Parastatiko(8,"987654323" , 2134,true , 550000 , a );
           Parastatiko p9= new Parastatiko(9,"987654322" , 3142,false , 60000 , a );
          
           
           
           
           
           
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