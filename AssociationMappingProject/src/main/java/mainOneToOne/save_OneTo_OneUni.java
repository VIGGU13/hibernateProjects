package mainOneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneMapping.UniDir.PanCard;
import OneToOneMapping.UniDir.Person;

public class save_OneTo_OneUni {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Person p=new Person();
		p.setName("Shashank");
		p.setPhoneNumber(753229111);
		p.setAddr("Bhihar");
	     
	     PanCard pan=new PanCard();
	     pan.setFatherName("Devndra");
	     pan.setPanNumber("ABCD423H");
	     p.setCard(pan);
	     em.persist(p);
	    
	     et.commit();
	}
}
