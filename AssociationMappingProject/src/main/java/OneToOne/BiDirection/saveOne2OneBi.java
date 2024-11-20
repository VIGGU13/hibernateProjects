package OneToOne.BiDirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveOne2OneBi {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("asm");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
//		Person p=new Person();
//		p.setName("Viggu");
//		p.setAge(22);
//		p.setPhone(7338221016l);
//		
//		AdharCard ac=new AdharCard();
//		ac.setName(p.getName());
//		ac.setAdharNo(5874963241256l);
//		ac.setDistrict("Mangalore");
//		
//		p.setCard(ac);
//		ac.setPerson(p);
		
		Person p1=new Person();
		p1.setName("Viggu");
		p1.setAge(22);
		p1.setPhone(7338221016l);
		
		AdharCard ac1=new AdharCard();
		ac1.setName(p1.getName());
		ac1.setAdharNo(5874963241256l);
		ac1.setDistrict("Mangalore");
		
		p1.setCard(ac1);
		ac1.setPerson(p1);
		
		em.persist(ac1);
		et.commit();
	}
}
